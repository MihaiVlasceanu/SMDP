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
import survey.surveyPackage;

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
 *   <li>{@link survey.impl.RatingImpl#getRatingForks <em>Rating Forks</em>}</li>
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
	 * The cached value of the '{@link #getRatingForks() <em>Rating Forks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingForks()
	 * @generated
	 * @ordered
	 */
	protected EList<RatingFork> ratingForks;

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
		return surveyPackage.Literals.RATING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RATING__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RATING__MAX, oldMax, max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RATING__FIRST, oldFirst, first));
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RATING__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RatingFork> getRatingForks() {
		if (ratingForks == null) {
			ratingForks = new EObjectContainmentEList<RatingFork>(RatingFork.class, this, surveyPackage.RATING__RATING_FORKS);
		}
		return ratingForks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case surveyPackage.RATING__RATING_FORKS:
				return ((InternalEList<?>)getRatingForks()).basicRemove(otherEnd, msgs);
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
			case surveyPackage.RATING__MIN:
				return getMin();
			case surveyPackage.RATING__MAX:
				return getMax();
			case surveyPackage.RATING__FIRST:
				return getFirst();
			case surveyPackage.RATING__LAST:
				return getLast();
			case surveyPackage.RATING__RATING_FORKS:
				return getRatingForks();
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
			case surveyPackage.RATING__MIN:
				setMin((Integer)newValue);
				return;
			case surveyPackage.RATING__MAX:
				setMax((Integer)newValue);
				return;
			case surveyPackage.RATING__FIRST:
				setFirst((String)newValue);
				return;
			case surveyPackage.RATING__LAST:
				setLast((String)newValue);
				return;
			case surveyPackage.RATING__RATING_FORKS:
				getRatingForks().clear();
				getRatingForks().addAll((Collection<? extends RatingFork>)newValue);
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
			case surveyPackage.RATING__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case surveyPackage.RATING__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case surveyPackage.RATING__FIRST:
				setFirst(FIRST_EDEFAULT);
				return;
			case surveyPackage.RATING__LAST:
				setLast(LAST_EDEFAULT);
				return;
			case surveyPackage.RATING__RATING_FORKS:
				getRatingForks().clear();
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
			case surveyPackage.RATING__MIN:
				return min != MIN_EDEFAULT;
			case surveyPackage.RATING__MAX:
				return max != MAX_EDEFAULT;
			case surveyPackage.RATING__FIRST:
				return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
			case surveyPackage.RATING__LAST:
				return LAST_EDEFAULT == null ? last != null : !LAST_EDEFAULT.equals(last);
			case surveyPackage.RATING__RATING_FORKS:
				return ratingForks != null && !ratingForks.isEmpty();
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
		result.append(" (Min: ");
		result.append(min);
		result.append(", Max: ");
		result.append(max);
		result.append(", first: ");
		result.append(first);
		result.append(", last: ");
		result.append(last);
		result.append(')');
		return result.toString();
	}

} //RatingImpl
