/**
 */
package survey.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import survey.Choice;
import survey.ConstantSum;
import survey.RankingSumFork;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.ConstantSumImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link survey.impl.ConstantSumImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link survey.impl.ConstantSumImpl#getFork <em>Fork</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantSumImpl extends QuestionImpl implements ConstantSum {
	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choices;

	/**
	 * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSTANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected int constant = CONSTANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFork() <em>Fork</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingSumFork> fork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantSumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.CONSTANT_SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<Choice>(Choice.class, this, SurveyPackage.CONSTANT_SUM__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(int newConstant) {
		int oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.CONSTANT_SUM__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingSumFork> getFork() {
		if (fork == null) {
			fork = new EObjectContainmentEList<RankingSumFork>(RankingSumFork.class, this, SurveyPackage.CONSTANT_SUM__FORK);
		}
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.CONSTANT_SUM__CHOICES:
				return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
			case SurveyPackage.CONSTANT_SUM__FORK:
				return ((InternalEList<?>)getFork()).basicRemove(otherEnd, msgs);
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
			case SurveyPackage.CONSTANT_SUM__CHOICES:
				return getChoices();
			case SurveyPackage.CONSTANT_SUM__CONSTANT:
				return getConstant();
			case SurveyPackage.CONSTANT_SUM__FORK:
				return getFork();
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
			case SurveyPackage.CONSTANT_SUM__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends Choice>)newValue);
				return;
			case SurveyPackage.CONSTANT_SUM__CONSTANT:
				setConstant((Integer)newValue);
				return;
			case SurveyPackage.CONSTANT_SUM__FORK:
				getFork().clear();
				getFork().addAll((Collection<? extends RankingSumFork>)newValue);
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
			case SurveyPackage.CONSTANT_SUM__CHOICES:
				getChoices().clear();
				return;
			case SurveyPackage.CONSTANT_SUM__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case SurveyPackage.CONSTANT_SUM__FORK:
				getFork().clear();
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
			case SurveyPackage.CONSTANT_SUM__CHOICES:
				return choices != null && !choices.isEmpty();
			case SurveyPackage.CONSTANT_SUM__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case SurveyPackage.CONSTANT_SUM__FORK:
				return fork != null && !fork.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //ConstantSumImpl
