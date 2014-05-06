package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
public class Transformation {
  public static Survey changeChoices(final Survey it) {
    EList<Question> _questions = it.getQuestions();
    final Procedure1<Question> _function = new Procedure1<Question>() {
      public void apply(final Question it) {
        Transformation.change(it);
      }
    };
    IterableExtensions.<Question>forEach(_questions, _function);
    return it;
  }
  
  protected static void _change(final Open it) {
  }
  
  protected static void _change(final Rating it) {
  }
  
  protected static void _change(final Staple it) {
  }
  
  protected static void _change(final MultipleChoice it) {
    EList<ChoiceFork> _forks = it.getForks();
    final Procedure1<ChoiceFork> _function = new Procedure1<ChoiceFork>() {
      public void apply(final ChoiceFork f) {
        EList<Choice> _choice = it.getChoice();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choice, _function);
      }
    };
    IterableExtensions.<ChoiceFork>forEach(_forks, _function);
  }
  
  protected static void _change(final ConstantSum it) {
    EList<RankingSumFork> _forks = it.getForks();
    final Procedure1<RankingSumFork> _function = new Procedure1<RankingSumFork>() {
      public void apply(final RankingSumFork f) {
        EList<Choice> _choices = it.getChoices();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choices, _function);
      }
    };
    IterableExtensions.<RankingSumFork>forEach(_forks, _function);
  }
  
  protected static void _change(final Ranking it) {
    EList<RankingSumFork> _forks = it.getForks();
    final Procedure1<RankingSumFork> _function = new Procedure1<RankingSumFork>() {
      public void apply(final RankingSumFork f) {
        EList<Choice> _choices = it.getChoices();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choices, _function);
      }
    };
    IterableExtensions.<RankingSumFork>forEach(_forks, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Open it) {
    return null;
  }
  
  protected static List<EList<Question>> _forkMap(final MultipleChoice it) {
    EList<ChoiceFork> _forks = it.getForks();
    final Function1<ChoiceFork,EList<Question>> _function = new Function1<ChoiceFork,EList<Question>>() {
      public EList<Question> apply(final ChoiceFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<ChoiceFork, EList<Question>>map(_forks, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Ranking it) {
    EList<RankingSumFork> _forks = it.getForks();
    final Function1<RankingSumFork,EList<Question>> _function = new Function1<RankingSumFork,EList<Question>>() {
      public EList<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, EList<Question>>map(_forks, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Rating it) {
    EList<RatingFork> _forks = it.getForks();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RatingFork, EList<Question>>map(_forks, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final ConstantSum it) {
    EList<RankingSumFork> _forks = it.getForks();
    final Function1<RankingSumFork,EList<Question>> _function = new Function1<RankingSumFork,EList<Question>>() {
      public EList<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, EList<Question>>map(_forks, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Staple it) {
    EList<RatingFork> _forks = it.getForks();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RatingFork, EList<Question>>map(_forks, _function);
  }
  
  public static List<EList<Question>> getQuestions(final Fork it) {
    EList<Question> _questions = it.getQuestions();
    final Function1<Question,EList<Question>> _function = new Function1<Question,EList<Question>>() {
      public EList<Question> apply(final Question it) {
        return null;
      }
    };
    return ListExtensions.<Question, EList<Question>>map(_questions, _function);
  }
  
  public static void change(final Question it) {
    if (it instanceof ConstantSum) {
      _change((ConstantSum)it);
      return;
    } else if (it instanceof MultipleChoice) {
      _change((MultipleChoice)it);
      return;
    } else if (it instanceof Open) {
      _change((Open)it);
      return;
    } else if (it instanceof Ranking) {
      _change((Ranking)it);
      return;
    } else if (it instanceof Rating) {
      _change((Rating)it);
      return;
    } else if (it instanceof Staple) {
      _change((Staple)it);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static List<EList<Question>> forkMap(final Question it) {
    if (it instanceof ConstantSum) {
      return _forkMap((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _forkMap((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _forkMap((Open)it);
    } else if (it instanceof Ranking) {
      return _forkMap((Ranking)it);
    } else if (it instanceof Rating) {
      return _forkMap((Rating)it);
    } else if (it instanceof Staple) {
      return _forkMap((Staple)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
