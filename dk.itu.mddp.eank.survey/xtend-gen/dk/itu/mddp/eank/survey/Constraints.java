package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import dk.itu.mddp.eank.survey.CodeGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
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
                      Integer _get_1 = map.get(forkQuestion);
                      usedList.add(_get_1);
                    } else {
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
      EList<Question> _questions = it.getQuestions();
      final Function1<Question,String> _function = new Function1<Question,String>() {
        public String apply(final Question it) {
          return it.getName();
        }
      };
      final List<String> names = ListExtensions.<Question, String>map(_questions, _function);
      boolean _CheckLoop = Constraints.CheckLoop(it);
      InputOutput.<Boolean>println(Boolean.valueOf(_CheckLoop));
      boolean _and = false;
      boolean _and_1 = false;
      boolean _CheckLoop_1 = Constraints.CheckLoop(it);
      if (!_CheckLoop_1) {
        _and_1 = false;
      } else {
        final Function1<String,Boolean> _function_1 = new Function1<String,Boolean>() {
          public Boolean apply(final String x) {
            final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
              public Boolean apply(final String y) {
                return Boolean.valueOf(Objects.equal(y, x));
              }
            };
            Iterable<String> _filter = IterableExtensions.<String>filter(names, _function);
            int _size = IterableExtensions.size(_filter);
            return Boolean.valueOf((_size == 1));
          }
        };
        boolean _forall = IterableExtensions.<String>forall(names, _function_1);
        _and_1 = _forall;
      }
      if (!_and_1) {
        _and = false;
      } else {
        EList<Question> _questions_1 = it.getQuestions();
        final Function1<Question,Boolean> _function_2 = new Function1<Question,Boolean>() {
          public Boolean apply(final Question x) {
            return Boolean.valueOf(Constraints.qConstraint(x));
          }
        };
        boolean _forall_1 = IterableExtensions.<Question>forall(_questions_1, _function_2);
        _and = _forall_1;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _qConstraint(final Open it) {
    return true;
  }
  
  protected static boolean _qConstraint(final MultipleChoice it) {
    EList<ChoiceFork> _fork = it.getFork();
    final Function1<ChoiceFork,Boolean> _function = new Function1<ChoiceFork,Boolean>() {
      public Boolean apply(final ChoiceFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    return IterableExtensions.<ChoiceFork>forall(_fork, _function);
  }
  
  protected static boolean _qConstraint(final Ranking it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
      public Boolean apply(final RankingSumFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    return IterableExtensions.<RankingSumFork>forall(_fork, _function);
  }
  
  protected static boolean _qConstraint(final Rating it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,Boolean> _function = new Function1<RatingFork,Boolean>() {
      public Boolean apply(final RatingFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    return IterableExtensions.<RatingFork>forall(_fork, _function);
  }
  
  protected static boolean _qConstraint(final Staple it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,Boolean> _function = new Function1<RatingFork,Boolean>() {
      public Boolean apply(final RatingFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    return IterableExtensions.<RatingFork>forall(_fork, _function);
  }
  
  protected static boolean _qConstraint(final ConstantSum it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
      public Boolean apply(final RankingSumFork x) {
        return Boolean.valueOf(Constraints.Constraint(x, it));
      }
    };
    return IterableExtensions.<RankingSumFork>forall(_fork, _function);
  }
  
  public static boolean Constraint(final Fork it, final Question q) {
    EList<Question> _questions = it.getQuestions();
    boolean _contains = _questions.contains(q);
    return (!_contains);
  }
  
  public static boolean CheckForkLoop(final EList<Question> list, final Fork it) {
    return true;
  }
  
  public static boolean Constraint(final Survey it) {
    {
      return _Constraint(it);
    }
  }
  
  public static boolean qConstraint(final Question it) {
    if (it instanceof Staple) {
      return _qConstraint((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _qConstraint((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _qConstraint((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _qConstraint((Open)it);
    } else if (it instanceof Ranking) {
      return _qConstraint((Ranking)it);
    } else if (it instanceof Rating) {
      return _qConstraint((Rating)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
