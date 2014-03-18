/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import survey.Staple;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.StapleImpl#getMid <em>Mid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StapleImpl extends RatingImpl implements Staple {
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
		return surveyPackage.Literals.STAPLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.STAPLE__MID, oldMid, mid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case surveyPackage.STAPLE__MID:
				return getMid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case surveyPackage.STAPLE__MID:
				setMid((String)newValue);
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
			case surveyPackage.STAPLE__MID:
				setMid(MID_EDEFAULT);
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
			case surveyPackage.STAPLE__MID:
				return MID_EDEFAULT == null ? mid != null : !MID_EDEFAULT.equals(mid);
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
		result.append(" (mid: ");
		result.append(mid);
		result.append(')');
		return result.toString();
	}

} //StapleImpl
