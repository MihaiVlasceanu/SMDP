package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import dk.itu.mddp.eank.survey.CodeGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import survey.Choice;
import survey.ChoiceFork;
import survey.ConstantSum;
import survey.Fork;
import survey.MultipleChoice;
import survey.Open;
import survey.Question;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.Survey;

@SuppressWarnings("all")
public class Constraints {
  private static boolean result = true;
  
  public static boolean CheckLoop(final Survey it) {
    boolean _xblockexpression = false;
    {
      Constraints.result = true;
      final HashMap<Question,Integer> map = new HashMap<Question, Integer>();
      final HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
      final ArrayList<Integer> usedList = new ArrayList<Integer>();
      EList<Question> _questions = it.getQuestions();
      final Procedure2<Question,Integer> _function = new Procedure2<Question,Integer>() {
        public void apply(final Question q, final Integer i) {
          map.put(q, i);
        }
      };
      IterableExtensions.<Question>forEach(_questions, _function);
      EList<Question> _questions_1 = it.getQuestions();
      final Procedure1<Question> _function_1 = new Procedure1<Question>() {
        public void apply(final Question q) {
          Integer _get = map.get(q);
          usedList.add(_get);
          List<EList<Question>> localQuestions = CodeGenerator.forkMap(q);
          boolean _notEquals = (!Objects.equal(localQuestions, null));
          if (_notEquals) {
            final Procedure1<EList<Question>> _function = new Procedure1<EList<Question>>() {
              public void apply(final EList<Question> localQuestion) {
                final Procedure1<Question> _function = new Procedure1<Question>() {
                  public void apply(final Question forkQuestion) {
                    Integer _get = map.get(forkQuestion);
                    boolean _contains = usedList.contains(_get);
                    boolean _not = (!_contains);
                    if (_not) {
                      Constraints.result = true;
                    } else {
                      String _name = q.getName();
                      String _plus = ("Question " + _name);
                      String _plus_1 = (_plus + " loops to ");
                      String _name_1 = forkQuestion.getName();
                      String _plus_2 = (_plus_1 + _name_1);
                      InputOutput.<String>println(_plus_2);
                      Constraints.result = false;
                    }
                  }
                };
                IterableExtensions.<Question>forEach(localQuestion, _function);
              }
            };
            IterableExtensions.<EList<Question>>forEach(localQuestions, _function);
          }
        }
      };
      IterableExtensions.<Question>forEach(_questions_1, _function_1);
      _xblockexpression = Constraints.result;
    }
    return _xblockexpression;
  }
  
  protected static boolean _Constraint(final Survey it) {
    boolean _xblockexpression = false;
    {
      boolean result = true;
      EList<Question> _questions = it.getQuestions();
      final Function1<Question,String> _function = new Function1<Question,String>() {
        public String apply(final Question it) {
          return it.getName();
        }
      };
      final List<String> names = ListExtensions.<Question, String>map(_questions, _function);
      boolean _CheckLoop = Constraints.CheckLoop(it);
      if (_CheckLoop) {
        result = true;
      } else {
        InputOutput.<String>println("Survey is looping");
        result = false;
      }
      Set<String> _set = IterableExtensions.<String>toSet(names);
      int _size = _set.size();
      int _size_1 = names.size();
      boolean _equals = (_size == _size_1);
      if (_equals) {
        result = true;
      } else {
        InputOutput.<String>println("Names are not unique");
        result = false;
      }
      EList<Question> _questions_1 = it.getQuestions();
      final Function1<Question,Boolean> _function_1 = new Function1<Question,Boolean>() {
        public Boolean apply(final Question it) {
          return Boolean.valueOf(Constraints.Constraint(it));
        }
      };
      boolean _forall = IterableExtensions.<Question>forall(_questions_1, _function_1);
      if (_forall) {
        result = true;
      } else {
        InputOutput.<String>println("Fork issues");
        result = false;
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected static boolean _Constraint(final Open it) {
    return true;
  }
  
  protected static boolean _Constraint(final MultipleChoice it) {
    boolean _and = false;
    boolean _and_1 = false;
    EList<ChoiceFork> _fork = it.getFork();
    final Function1<ChoiceFork,Boolean> _function = new Function1<ChoiceFork,Boolean>() {
      public Boolean apply(final ChoiceFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    boolean _forall = IterableExtensions.<ChoiceFork>forall(_fork, _function);
    if (!_forall) {
      _and_1 = false;
    } else {
      EList<ChoiceFork> _fork_1 = it.getFork();
      final Function1<ChoiceFork,Boolean> _function_1 = new Function1<ChoiceFork,Boolean>() {
        public Boolean apply(final ChoiceFork it) {
          EList<Question> _questions = it.getQuestions();
          Set<Question> _set = IterableExtensions.<Question>toSet(_questions);
          int _size = _set.size();
          EList<Question> _questions_1 = it.getQuestions();
          int _size_1 = _questions_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_1 = IterableExtensions.<ChoiceFork>forall(_fork_1, _function_1);
      _and_1 = _forall_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EList<ChoiceFork> _fork_2 = it.getFork();
      final Function1<ChoiceFork,Boolean> _function_2 = new Function1<ChoiceFork,Boolean>() {
        public Boolean apply(final ChoiceFork it) {
          EList<Choice> _on = it.getOn();
          Set<Choice> _set = IterableExtensions.<Choice>toSet(_on);
          int _size = _set.size();
          EList<Choice> _on_1 = it.getOn();
          int _size_1 = _on_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_2 = IterableExtensions.<ChoiceFork>forall(_fork_2, _function_2);
      _and = _forall_2;
    }
    return _and;
  }
  
  protected static boolean _Constraint(final Ranking it) {
    boolean _xblockexpression = false;
    {
      EList<Choice> _choices = it.getChoices();
      final int choiceCount = _choices.size();
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      EList<RankingSumFork> _fork = it.getFork();
      final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
        public Boolean apply(final RankingSumFork x) {
          return Boolean.valueOf(Constraints.Constraint(x, it));
        }
      };
      boolean _forall = IterableExtensions.<RankingSumFork>forall(_fork, _function);
      if (!_forall) {
        _and_2 = false;
      } else {
        EList<RankingSumFork> _fork_1 = it.getFork();
        final Function1<RankingSumFork,Boolean> _function_1 = new Function1<RankingSumFork,Boolean>() {
          public Boolean apply(final RankingSumFork x) {
            EList<Question> _questions = x.getQuestions();
            Set<Question> _set = IterableExtensions.<Question>toSet(_questions);
            int _size = _set.size();
            EList<Question> _questions_1 = x.getQuestions();
            int _size_1 = _questions_1.size();
            return Boolean.valueOf((_size == _size_1));
          }
        };
        boolean _forall_1 = IterableExtensions.<RankingSumFork>forall(_fork_1, _function_1);
        _and_2 = _forall_1;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        EList<RankingSumFork> _fork_2 = it.getFork();
        final Function1<RankingSumFork,Boolean> _function_2 = new Function1<RankingSumFork,Boolean>() {
          public Boolean apply(final RankingSumFork it) {
            EList<Choice> _on = it.getOn();
            Set<Choice> _set = IterableExtensions.<Choice>toSet(_on);
            int _size = _set.size();
            EList<Choice> _on_1 = it.getOn();
            int _size_1 = _on_1.size();
            return Boolean.valueOf((_size == _size_1));
          }
        };
        boolean _forall_2 = IterableExtensions.<RankingSumFork>forall(_fork_2, _function_2);
        _and_1 = _forall_2;
      }
      if (!_and_1) {
        _and = false;
      } else {
        EList<RankingSumFork> _fork_3 = it.getFork();
        final Function1<RankingSumFork,Boolean> _function_3 = new Function1<RankingSumFork,Boolean>() {
          public Boolean apply(final RankingSumFork it) {
            return Boolean.valueOf(Constraints.Constraint(it, choiceCount));
          }
        };
        boolean _forall_3 = IterableExtensions.<RankingSumFork>forall(_fork_3, _function_3);
        _and = _forall_3;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _Constraint(final Rating it) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    int _min = it.getMin();
    boolean _greaterEqualsThan = (_min >= 0);
    if (!_greaterEqualsThan) {
      _and_2 = false;
    } else {
      int _max = it.getMax();
      boolean _greaterThan = (_max > 0);
      _and_2 = _greaterThan;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      EList<RatingFork> _fork = it.getFork();
      final Function1<RatingFork,Boolean> _function = new Function1<RatingFork,Boolean>() {
        public Boolean apply(final RatingFork x) {
          return Boolean.valueOf(Constraints.Constraint(x, it));
        }
      };
      boolean _forall = IterableExtensions.<RatingFork>forall(_fork, _function);
      _and_1 = _forall;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EList<RatingFork> _fork_1 = it.getFork();
      final Function1<RatingFork,Boolean> _function_1 = new Function1<RatingFork,Boolean>() {
        public Boolean apply(final RatingFork it) {
          EList<Question> _questions = it.getQuestions();
          Set<Question> _set = IterableExtensions.<Question>toSet(_questions);
          int _size = _set.size();
          EList<Question> _questions_1 = it.getQuestions();
          int _size_1 = _questions_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_1 = IterableExtensions.<RatingFork>forall(_fork_1, _function_1);
      _and = _forall_1;
    }
    return _and;
  }
  
  protected static boolean _Constraint(final Staple it) {
    boolean _and = false;
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,Boolean> _function = new Function1<RatingFork,Boolean>() {
      public Boolean apply(final RatingFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    boolean _forall = IterableExtensions.<RatingFork>forall(_fork, _function);
    if (!_forall) {
      _and = false;
    } else {
      EList<RatingFork> _fork_1 = it.getFork();
      final Function1<RatingFork,Boolean> _function_1 = new Function1<RatingFork,Boolean>() {
        public Boolean apply(final RatingFork it) {
          EList<Question> _questions = it.getQuestions();
          Set<Question> _set = IterableExtensions.<Question>toSet(_questions);
          int _size = _set.size();
          EList<Question> _questions_1 = it.getQuestions();
          int _size_1 = _questions_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_1 = IterableExtensions.<RatingFork>forall(_fork_1, _function_1);
      _and = _forall_1;
    }
    return _and;
  }
  
  protected static boolean _Constraint(final ConstantSum it) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    int _constant = it.getConstant();
    boolean _greaterEqualsThan = (_constant >= 0);
    if (!_greaterEqualsThan) {
      _and_2 = false;
    } else {
      EList<RankingSumFork> _fork = it.getFork();
      final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
        public Boolean apply(final RankingSumFork x) {
          return Boolean.valueOf(Constraints.Constraint(x, it));
        }
      };
      boolean _forall = IterableExtensions.<RankingSumFork>forall(_fork, _function);
      _and_2 = _forall;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      EList<RankingSumFork> _fork_1 = it.getFork();
      final Function1<RankingSumFork,Boolean> _function_1 = new Function1<RankingSumFork,Boolean>() {
        public Boolean apply(final RankingSumFork it) {
          EList<Question> _questions = it.getQuestions();
          Set<Question> _set = IterableExtensions.<Question>toSet(_questions);
          int _size = _set.size();
          EList<Question> _questions_1 = it.getQuestions();
          int _size_1 = _questions_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_1 = IterableExtensions.<RankingSumFork>forall(_fork_1, _function_1);
      _and_1 = _forall_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EList<RankingSumFork> _fork_2 = it.getFork();
      final Function1<RankingSumFork,Boolean> _function_2 = new Function1<RankingSumFork,Boolean>() {
        public Boolean apply(final RankingSumFork it) {
          EList<Choice> _on = it.getOn();
          Set<Choice> _set = IterableExtensions.<Choice>toSet(_on);
          int _size = _set.size();
          EList<Choice> _on_1 = it.getOn();
          int _size_1 = _on_1.size();
          return Boolean.valueOf((_size == _size_1));
        }
      };
      boolean _forall_2 = IterableExtensions.<RankingSumFork>forall(_fork_2, _function_2);
      _and = _forall_2;
    }
    return _and;
  }
  
  public static boolean Constraint(final Fork it, final Question q) {
    EList<Question> _questions = it.getQuestions();
    boolean _contains = _questions.contains(q);
    return (!_contains);
  }
  
  public static boolean Constraint(final RankingSumFork it, final int choiceCount) {
    boolean _and = false;
    int _max = it.getMax();
    boolean _lessEqualsThan = (_max <= choiceCount);
    if (!_lessEqualsThan) {
      _and = false;
    } else {
      int _min = it.getMin();
      boolean _greaterEqualsThan = (_min >= choiceCount);
      _and = _greaterEqualsThan;
    }
    return _and;
  }
  
  public static boolean Constraint(final EObject it) {
    if (it instanceof Staple) {
      return _Constraint((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _Constraint((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _Constraint((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _Constraint((Open)it);
    } else if (it instanceof Ranking) {
      return _Constraint((Ranking)it);
    } else if (it instanceof Rating) {
      return _Constraint((Rating)it);
    } else if (it instanceof Survey) {
      return _Constraint((Survey)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
