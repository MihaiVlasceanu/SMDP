package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import survey.Dichotomous;
import survey.Question;
import survey.Ranking;
import survey.Rating;
import survey.RatingFork;
import survey.Survey;

@SuppressWarnings("all")
public class Constraints {
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
          return Boolean.valueOf((1 == _size));
        }
      };
      boolean _forall = IterableExtensions.<String>forall(names, _function_1);
      if (!_forall) {
        _and = false;
      } else {
        EList<Question> _questions_1 = it.getQuestions();
        final Function1<Question,Boolean> _function_2 = new Function1<Question,Boolean>() {
          public Boolean apply(final Question it) {
            return Boolean.valueOf(Constraints.Constraint(it));
          }
        };
        boolean _forall_1 = IterableExtensions.<Question>forall(_questions_1, _function_2);
        _and = _forall_1;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  protected static boolean _Contstraint(final Dichotomous it) {
    return true;
  }
  
  protected static boolean _Contstraint(final Question it) {
    return true;
  }
  
  protected static boolean _Constraint(final Ranking it) {
    return true;
  }
  
  protected static boolean _Constraint(final Rating s) {
    EList<RatingFork> _fork = s.getFork();
    final Function1<RatingFork,Boolean> _function = new Function1<RatingFork,Boolean>() {
      public Boolean apply(final RatingFork it) {
        EList<Question> _questions = it.getQuestions();
        final Function1<Object,Rating> _function = new Function1<Object,Rating>() {
          public Rating apply(final Object it) {
            return s;
          }
        };
        boolean _contains = _questions.contains(_function);
        return Boolean.valueOf((!_contains));
      }
    };
    return IterableExtensions.<RatingFork>forall(_fork, _function);
  }
  
  public static boolean Constraint(final EObject it) {
    if (it instanceof Ranking) {
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
  
  public static boolean Contstraint(final Question it) {
    if (it instanceof Dichotomous) {
      return _Contstraint((Dichotomous)it);
    } else if (it != null) {
      return _Contstraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
