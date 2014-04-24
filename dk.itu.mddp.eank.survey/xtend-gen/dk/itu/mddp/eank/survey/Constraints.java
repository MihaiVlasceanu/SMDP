package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
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
  private final static HashMap<Question,Integer> map = new HashMap<Question, Integer>();
  
  private final static HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
  
  private final static ArrayList<Integer> usedList = new ArrayList<Integer>();
  
  public static boolean CreateMap(final Survey it) {
    boolean _xblockexpression = false;
    {
      EList<Question> _questions = it.getQuestions();
      final Procedure2<Question,Integer> _function = new Procedure2<Question,Integer>() {
        public void apply(final Question question, final Integer iterator) {
          Constraints.map.put(question, iterator);
        }
      };
      IterableExtensions.<Question>forEach(_questions, _function);
      EList<Question> _questions_1 = it.getQuestions();
      final Procedure2<Question,Integer> _function_1 = new Procedure2<Question,Integer>() {
        public void apply(final Question question, final Integer iIterator) {
          boolean _containsKey = Constraints.goToMap.containsKey(question);
          boolean _not = (!_containsKey);
          if (_not) {
            final List<? extends List<Question>> localQuestions = Constraints.forkMap(question);
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(localQuestions, null));
            if (!_notEquals) {
              _and = false;
            } else {
              int _size = localQuestions.size();
              boolean _greaterThan = (_size > 0);
              _and = _greaterThan;
            }
            if (_and) {
              final Procedure2<List<Question>,Integer> _function = new Procedure2<List<Question>,Integer>() {
                public void apply(final List<Question> localFork, final Integer qIterator) {
                  final Procedure2<Question,Integer> _function = new Procedure2<Question,Integer>() {
                    public void apply(final Question localQuestion, final Integer pIterator) {
                      Constraints.goToMap.put(localQuestion, Integer.valueOf(((pIterator).intValue() + 1)));
                      Constraints.usedList.add(Integer.valueOf(((pIterator).intValue() + 1)));
                    }
                  };
                  IterableExtensions.<Question>forEach(localFork, _function);
                }
              };
              IterableExtensions.forEach(localQuestions, _function);
            }
          }
        }
      };
      IterableExtensions.<Question>forEach(_questions_1, _function_1);
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  protected static boolean _Constraint(final Survey it) {
    boolean _xblockexpression = false;
    {
      Constraints.CreateMap(it);
      final HashMap<Question,Integer> map2 = Constraints.map;
      final HashMap<Question,Integer> goToMap2 = Constraints.goToMap;
      final ArrayList<Integer> usedList2 = Constraints.usedList;
      EList<Question> _questions = it.getQuestions();
      final Function1<Question,String> _function = new Function1<Question,String>() {
        public String apply(final Question it) {
          return it.getName();
        }
      };
      final List<String> names = ListExtensions.<Question, String>map(_questions, _function);
      boolean _and = false;
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
      if (!_forall) {
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
  
  protected static List<EList<Question>> _forkMap(final Open it) {
    return null;
  }
  
  protected static List<List<Question>> _forkMap(final MultipleChoice it) {
    EList<ChoiceFork> _fork = it.getFork();
    final Function1<ChoiceFork,List<Question>> _function = new Function1<ChoiceFork,List<Question>>() {
      public List<Question> apply(final ChoiceFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<ChoiceFork, List<Question>>map(_fork, _function);
  }
  
  protected static List<List<Question>> _forkMap(final Ranking it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,List<Question>> _function = new Function1<RankingSumFork,List<Question>>() {
      public List<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, List<Question>>map(_fork, _function);
  }
  
  protected static List<List<Question>> _forkMap(final Rating it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,List<Question>> _function = new Function1<RatingFork,List<Question>>() {
      public List<Question> apply(final RatingFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RatingFork, List<Question>>map(_fork, _function);
  }
  
  protected static List<List<Question>> _forkMap(final Staple it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,List<Question>> _function = new Function1<RatingFork,List<Question>>() {
      public List<Question> apply(final RatingFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RatingFork, List<Question>>map(_fork, _function);
  }
  
  protected static List<List<Question>> _forkMap(final ConstantSum it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,List<Question>> _function = new Function1<RankingSumFork,List<Question>>() {
      public List<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, List<Question>>map(_fork, _function);
  }
  
  public static List<Question> getQuestions(final Fork it) {
    EList<Question> _questions = it.getQuestions();
    final Function1<Question,Question> _function = new Function1<Question,Question>() {
      public Question apply(final Question x) {
        return x;
      }
    };
    return ListExtensions.<Question, Question>map(_questions, _function);
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
  
  public static List<? extends List<Question>> forkMap(final Question it) {
    if (it instanceof Staple) {
      return _forkMap((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _forkMap((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _forkMap((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _forkMap((Open)it);
    } else if (it instanceof Ranking) {
      return _forkMap((Ranking)it);
    } else if (it instanceof Rating) {
      return _forkMap((Rating)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
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
