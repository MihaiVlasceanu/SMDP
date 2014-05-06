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

import survey.RatingFork;
import survey.Staple;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.StapleImpl#getFirst <em>First</em>}</li>
 *   <li>{@link survey.impl.StapleImpl#getMid <em>Mid</em>}</li>
 *   <li>{@link survey.impl.StapleImpl#getLast <em>Last</em>}</li>
 *   <li>{@link survey.impl.StapleImpl#getForks <em>Forks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StapleImpl extends QuestionImpl implements Staple {
	/**
	 * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected String first = FIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMid() <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMid()
	 * @generated
	 * @ordered
	 */
	protected static final String MID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMid() <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMid()
	 * @generated
	 * @ordered
	 */
	protected String mid = MID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast() <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected String last = LAST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForks() <em>Forks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks()
	 * @generated
	 * @ordered
	 */
	protected EList<RatingFork> forks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StapleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.STAPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(String newFirst) {
		String oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.STAPLE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMid() {
		return mid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMid(String newMid) {
		String oldMid = mid;
		mid = newMid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.STAPLE__MID, oldMid, mid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(String newLast) {
		String oldLast = last;
		last = newLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.STAPLE__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RatingFork> getForks() {
		if (forks == null) {
			forks = new EObjectContainmentEList<RatingFork>(RatingFork.class, this, SurveyPackage.STAPLE__FORKS);
		}
		return forks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.STAPLE__FORKS:
				return ((InternalEList<?>)getForks()).basicRemove(otherEnd, msgs);
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
			case SurveyPackage.STAPLE__FIRST:
				return getFirst();
			case SurveyPackage.STAPLE__MID:
				return getMid();
			case SurveyPackage.STAPLE__LAST:
				return getLast();
			case SurveyPackage.STAPLE__FORKS:
				return getForks();
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
			case SurveyPackage.STAPLE__FIRST:
				setFirst((String)newValue);
				return;
			case SurveyPackage.STAPLE__MID:
				setMid((String)newValue);
				return;
			case SurveyPackage.STAPLE__LAST:
				setLast((String)newValue);
				return;
			case SurveyPackage.STAPLE__FORKS:
				getForks().clear();
				getForks().addAll((Collection<? extends RatingFork>)newValue);
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
			case SurveyPackage.STAPLE__FIRST:
				setFirst(FIRST_EDEFAULT);
				return;
			case SurveyPackage.STAPLE__MID:
				setMid(MID_EDEFAULT);
				return;
			case SurveyPackage.STAPLE__LAST:
				setLast(LAST_EDEFAULT);
				return;
			case SurveyPackage.STAPLE__FORKS:
				getForks().clear();
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
			case SurveyPackage.STAPLE__FIRST:
				return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
			case SurveyPackage.STAPLE__MID:
				return MID_EDEFAULT == null ? mid != null : !MID_EDEFAULT.equals(mid);
			case SurveyPackage.STAPLE__LAST:
				return LAST_EDEFAULT == null ? last != null : !LAST_EDEFAULT.equals(last);
			case SurveyPackage.STAPLE__FORKS:
				return forks != null && !forks.isEmpty();
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
		result.append(" (first: ");
		result.append(first);
		result.append(", mid: ");
		result.append(mid);
		result.append(", last: ");
		result.append(last);
		result.append(')');
		return result.toString();
	}

} //StapleImpl
