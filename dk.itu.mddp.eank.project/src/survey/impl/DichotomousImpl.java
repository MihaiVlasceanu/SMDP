/**
 */
package survey.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import survey.Dichotomous;
import survey.Question;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dichotomous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.DichotomousImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link survey.impl.DichotomousImpl#getNo <em>No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DichotomousImpl extends QuestionImpl implements Dichotomous {
	/**
	 * The cached value of the '{@link #getYes() <em>Yes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYes()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> yes;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> no;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DichotomousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return surveyPackage.Literals.DICHOTOMOUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getYes() {
		if (yes == null) {
			yes = new EObjectContainmentEList<Question>(Question.class, this, surveyPackage.DICHOTOMOUS__YES);
		}
		return yes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getNo() {
		if (no == null) {
			no = new EObjectContainmentEList<Question>(Question.class, this, surveyPackage.DICHOTOMOUS__NO);
		}
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case surveyPackage.DICHOTOMOUS__YES:
				return ((InternalEList<?>)getYes()).basicRemove(otherEnd, msgs);
			case surveyPackage.DICHOTOMOUS__NO:
				return ((InternalEList<?>)getNo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case surveyPackage.DICHOTOMOUS__YES:
				return getYes();
			case surveyPackage.DICHOTOMOUS__NO:
				return getNo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case surveyPackage.DICHOTOMOUS__YES:
				getYes().clear();
				getYes().addAll((Collection<? extends Question>)newValue);
				return;
			case surveyPackage.DICHOTOMOUS__NO:
				getNo().clear();
				getNo().addAll((Collection<? extends Question>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case surveyPackage.DICHOTOMOUS__YES:
				getYes().clear();
				return;
			case surveyPackage.DICHOTOMOUS__NO:
				getNo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case surveyPackage.DICHOTOMOUS__YES:
				return yes != null && !yes.isEmpty();
			case surveyPackage.DICHOTOMOUS__NO:
				return no != null && !no.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DichotomousImpl
