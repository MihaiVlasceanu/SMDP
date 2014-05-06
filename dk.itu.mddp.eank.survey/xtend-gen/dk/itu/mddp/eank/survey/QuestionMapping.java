package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import dk.itu.mddp.eank.survey.Transformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import survey.Question;
import survey.Survey;

@SuppressWarnings("all")
public class QuestionMapping {
  public static HashMap<Question,Integer> map = new HashMap<Question, Integer>();
  
  public static HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
  
  private static HashMap<Question,Integer> next = new HashMap<Question, Integer>();
  
  private static ArrayList<Integer> usedList = new ArrayList<Integer>();
  
  public static HashMap<Question,Integer> MapQuestions(final Survey it) {
    final Survey survey = Transformation.changeChoices(it);
    final EList<Question> questions = survey.getQuestions();
    final Procedure2<Question,Integer> _function = new Procedure2<Question,Integer>() {
      public void apply(final Question q, final Integer i) {
        QuestionMapping.map.put(q, i);
      }
    };
    IterableExtensions.<Question>forEach(questions, _function);
    final Procedure1<Question> _function_1 = new Procedure1<Question>() {
      public void apply(final Question q) {
        List<EList<Question>> localQuestions = Transformation.forkMap(q);
        boolean _notEquals = (!Objects.equal(localQuestions, null));
        if (_notEquals) {
          final Procedure1<EList<Question>> _function = new Procedure1<EList<Question>>() {
            public void apply(final EList<Question> localQuestion) {
              int _size = localQuestion.size();
              IntegerRange _upTo = new IntegerRange(0, _size);
              for (final Integer p : _upTo) {
                int _size_1 = localQuestion.size();
                boolean _notEquals = ((p).intValue() != _size_1);
                if (_notEquals) {
                  Question _get = localQuestion.get((p).intValue());
                  Integer _get_1 = QuestionMapping.map.get(_get);
                  QuestionMapping.usedList.add(_get_1);
                }
              }
            }
          };
          IterableExtensions.<EList<Question>>forEach(localQuestions, _function);
        }
      }
    };
    IterableExtensions.<Question>forEach(questions, _function_1);
    final Procedure1<Question> _function_2 = new Procedure1<Question>() {
      public void apply(final Question q) {
        List<EList<Question>> localQuestions = Transformation.forkMap(q);
        boolean _containsKey = QuestionMapping.goToMap.containsKey(q);
        boolean _not = (!_containsKey);
        if (_not) {
          Integer _get = QuestionMapping.map.get(q);
          int to = ((_get).intValue() + 1);
          boolean _contains = QuestionMapping.usedList.contains(Integer.valueOf(to));
          boolean _while = _contains;
          while (_while) {
            to = (to + 1);
            boolean _contains_1 = QuestionMapping.usedList.contains(Integer.valueOf(to));
            _while = _contains_1;
          }
          QuestionMapping.goToMap.put(q, Integer.valueOf(to));
        }
        boolean _notEquals = (!Objects.equal(localQuestions, null));
        if (_notEquals) {
          final Procedure1<EList<Question>> _function = new Procedure1<EList<Question>>() {
            public void apply(final EList<Question> localQuestion) {
              int _size = localQuestion.size();
              IntegerRange _upTo = new IntegerRange(0, _size);
              for (final Integer p : _upTo) {
                int _size_1 = localQuestion.size();
                boolean _notEquals = ((p).intValue() != _size_1);
                if (_notEquals) {
                  int _size_2 = localQuestion.size();
                  int _minus = (_size_2 - 1);
                  boolean _notEquals_1 = ((p).intValue() != _minus);
                  if (_notEquals_1) {
                    Question _get = localQuestion.get((p).intValue());
                    Question _get_1 = localQuestion.get(((p).intValue() + 1));
                    Integer _get_2 = QuestionMapping.map.get(_get_1);
                    QuestionMapping.goToMap.put(_get, _get_2);
                  } else {
                    Question _get_3 = localQuestion.get((p).intValue());
                    Integer _get_4 = QuestionMapping.goToMap.get(q);
                    QuestionMapping.goToMap.put(_get_3, _get_4);
                  }
                }
              }
            }
          };
          IterableExtensions.<EList<Question>>forEach(localQuestions, _function);
        }
      }
    };
    IterableExtensions.<Question>forEach(questions, _function_2);
    return QuestionMapping.goToMap;
  }
}
