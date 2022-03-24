/**
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.myRds.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.rds.myRds.MyRdsPackage;
import org.xtext.project.rds.myRds.Order;
import org.xtext.project.rds.myRds.Review;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.rds.myRds.impl.ReviewImpl#getNumStars <em>Num Stars</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.ReviewImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.ReviewImpl#getReviewDatetime <em>Review Datetime</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.ReviewImpl#getReviewedOrder <em>Reviewed Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewImpl extends AbstractElementImpl implements Review
{
  /**
   * The default value of the '{@link #getNumStars() <em>Num Stars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumStars()
   * @generated
   * @ordered
   */
  protected static final int NUM_STARS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumStars() <em>Num Stars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumStars()
   * @generated
   * @ordered
   */
  protected int numStars = NUM_STARS_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getReviewDatetime() <em>Review Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReviewDatetime()
   * @generated
   * @ordered
   */
  protected static final String REVIEW_DATETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReviewDatetime() <em>Review Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReviewDatetime()
   * @generated
   * @ordered
   */
  protected String reviewDatetime = REVIEW_DATETIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReviewedOrder() <em>Reviewed Order</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReviewedOrder()
   * @generated
   * @ordered
   */
  protected Order reviewedOrder;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReviewImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyRdsPackage.Literals.REVIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumStars()
  {
    return numStars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumStars(int newNumStars)
  {
    int oldNumStars = numStars;
    numStars = newNumStars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.REVIEW__NUM_STARS, oldNumStars, numStars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.REVIEW__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReviewDatetime()
  {
    return reviewDatetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReviewDatetime(String newReviewDatetime)
  {
    String oldReviewDatetime = reviewDatetime;
    reviewDatetime = newReviewDatetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.REVIEW__REVIEW_DATETIME, oldReviewDatetime, reviewDatetime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Order getReviewedOrder()
  {
    if (reviewedOrder != null && reviewedOrder.eIsProxy())
    {
      InternalEObject oldReviewedOrder = (InternalEObject)reviewedOrder;
      reviewedOrder = (Order)eResolveProxy(oldReviewedOrder);
      if (reviewedOrder != oldReviewedOrder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyRdsPackage.REVIEW__REVIEWED_ORDER, oldReviewedOrder, reviewedOrder));
      }
    }
    return reviewedOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order basicGetReviewedOrder()
  {
    return reviewedOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReviewedOrder(Order newReviewedOrder)
  {
    Order oldReviewedOrder = reviewedOrder;
    reviewedOrder = newReviewedOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.REVIEW__REVIEWED_ORDER, oldReviewedOrder, reviewedOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyRdsPackage.REVIEW__NUM_STARS:
        return getNumStars();
      case MyRdsPackage.REVIEW__DESCRIPTION:
        return getDescription();
      case MyRdsPackage.REVIEW__REVIEW_DATETIME:
        return getReviewDatetime();
      case MyRdsPackage.REVIEW__REVIEWED_ORDER:
        if (resolve) return getReviewedOrder();
        return basicGetReviewedOrder();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyRdsPackage.REVIEW__NUM_STARS:
        setNumStars((Integer)newValue);
        return;
      case MyRdsPackage.REVIEW__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyRdsPackage.REVIEW__REVIEW_DATETIME:
        setReviewDatetime((String)newValue);
        return;
      case MyRdsPackage.REVIEW__REVIEWED_ORDER:
        setReviewedOrder((Order)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyRdsPackage.REVIEW__NUM_STARS:
        setNumStars(NUM_STARS_EDEFAULT);
        return;
      case MyRdsPackage.REVIEW__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyRdsPackage.REVIEW__REVIEW_DATETIME:
        setReviewDatetime(REVIEW_DATETIME_EDEFAULT);
        return;
      case MyRdsPackage.REVIEW__REVIEWED_ORDER:
        setReviewedOrder((Order)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyRdsPackage.REVIEW__NUM_STARS:
        return numStars != NUM_STARS_EDEFAULT;
      case MyRdsPackage.REVIEW__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyRdsPackage.REVIEW__REVIEW_DATETIME:
        return REVIEW_DATETIME_EDEFAULT == null ? reviewDatetime != null : !REVIEW_DATETIME_EDEFAULT.equals(reviewDatetime);
      case MyRdsPackage.REVIEW__REVIEWED_ORDER:
        return reviewedOrder != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (numStars: ");
    result.append(numStars);
    result.append(", description: ");
    result.append(description);
    result.append(", reviewDatetime: ");
    result.append(reviewDatetime);
    result.append(')');
    return result.toString();
  }

} //ReviewImpl
