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

import survey.Rating;
import survey.RatingFork;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.RatingImpl#getMin <em>Min</em>}</li>
 *   <li>{@link survey.impl.RatingImpl#getMax <em>Max</em>}</li>
 *   <li>{@link survey.impl.RatingImpl#getFirst <em>First</em>}</li>
 *   <li>{@link survey.impl.RatingImpl#getLast <em>Last</em>}</li>
 *   <li>{@link survey.impl.RatingImpl#getForks <em>Forks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatingImpl extends QuestionImpl implements Rating {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

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
	protected RatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.RATING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.RATING__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.RATING__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.RATING__FIRST, oldFirst, first));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.RATING__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RatingFork> getForks() {
		if (forks == null) {
			forks = new EObjectContainmentEList<RatingFork>(RatingFork.class, this, SurveyPackage.RATING__FORKS);
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
			case SurveyPackage.RATING__FORKS:
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
			case SurveyPackage.RATING__MIN:
				return getMin();
			case SurveyPackage.RATING__MAX:
				return getMax();
			case SurveyPackage.RATING__FIRST:
				return getFirst();
			case SurveyPackage.RATING__LAST:
				return getLast();
			case SurveyPackage.RATING__FORKS:
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
			case SurveyPackage.RATING__MIN:
				setMin((Integer)newValue);
				return;
			case SurveyPackage.RATING__MAX:
				setMax((Integer)newValue);
				return;
			case SurveyPackage.RATING__FIRST:
				setFirst((String)newValue);
				return;
			case SurveyPackage.RATING__LAST:
				setLast((String)newValue);
				return;
			case SurveyPackage.RATING__FORKS:
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
			case SurveyPackage.RATING__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SurveyPackage.RATING__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case SurveyPackage.RATING__FIRST:
				setFirst(FIRST_EDEFAULT);
				return;
			case SurveyPackage.RATING__LAST:
				setLast(LAST_EDEFAULT);
				return;
			case SurveyPackage.RATING__FORKS:
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
			case SurveyPackage.RATING__MIN:
				return min != MIN_EDEFAULT;
			case SurveyPackage.RATING__MAX:
				return max != MAX_EDEFAULT;
			case SurveyPackage.RATING__FIRST:
				return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
			case SurveyPackage.RATING__LAST:
				return LAST_EDEFAULT == null ? last != null : !LAST_EDEFAULT.equals(last);
			case SurveyPackage.RATING__FORKS:
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", first: ");
		result.append(first);
		result.append(", last: ");
		result.append(last);
		result.append(')');
		return result.toString();
	}

} //RatingImpl
