/**
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.myRds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.project.rds.myRds.Customer;
import org.xtext.project.rds.myRds.DeliveryDriver;
import org.xtext.project.rds.myRds.MyRdsPackage;
import org.xtext.project.rds.myRds.Order;
import org.xtext.project.rds.myRds.OrderItem;
import org.xtext.project.rds.myRds.OrderStatus;
import org.xtext.project.rds.myRds.Review;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getOrderedDatetime <em>Ordered Datetime</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getDeliveredDatetime <em>Delivered Datetime</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getRequestedDeliveryDatetime <em>Requested Delivery Datetime</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.OrderImpl#getDeliveryDriver <em>Delivery Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends AbstractElementImpl implements Order
{
  /**
   * The default value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderNumber()
   * @generated
   * @ordered
   */
  protected static final int ORDER_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderNumber()
   * @generated
   * @ordered
   */
  protected int orderNumber = ORDER_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final OrderStatus STATUS_EDEFAULT = OrderStatus.ACCEPTED;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected OrderStatus status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getDeliveryAddress() <em>Delivery Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeliveryAddress()
   * @generated
   * @ordered
   */
  protected static final String DELIVERY_ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeliveryAddress() <em>Delivery Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeliveryAddress()
   * @generated
   * @ordered
   */
  protected String deliveryAddress = DELIVERY_ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getOrderedDatetime() <em>Ordered Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderedDatetime()
   * @generated
   * @ordered
   */
  protected static final String ORDERED_DATETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrderedDatetime() <em>Ordered Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderedDatetime()
   * @generated
   * @ordered
   */
  protected String orderedDatetime = ORDERED_DATETIME_EDEFAULT;

  /**
   * The default value of the '{@link #getDeliveredDatetime() <em>Delivered Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeliveredDatetime()
   * @generated
   * @ordered
   */
  protected static final String DELIVERED_DATETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeliveredDatetime() <em>Delivered Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeliveredDatetime()
   * @generated
   * @ordered
   */
  protected String deliveredDatetime = DELIVERED_DATETIME_EDEFAULT;

  /**
   * The default value of the '{@link #getRequestedDeliveryDatetime() <em>Requested Delivery Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestedDeliveryDatetime()
   * @generated
   * @ordered
   */
  protected static final String REQUESTED_DELIVERY_DATETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequestedDeliveryDatetime() <em>Requested Delivery Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestedDeliveryDatetime()
   * @generated
   * @ordered
   */
  protected String requestedDeliveryDatetime = REQUESTED_DELIVERY_DATETIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrderItems() <em>Order Items</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderItems()
   * @generated
   * @ordered
   */
  protected EList<OrderItem> orderItems;

  /**
   * The cached value of the '{@link #getReview() <em>Review</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReview()
   * @generated
   * @ordered
   */
  protected Review review;

  /**
   * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer()
   * @generated
   * @ordered
   */
  protected Customer customer;

  /**
   * The cached value of the '{@link #getDeliveryDriver() <em>Delivery Driver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeliveryDriver()
   * @generated
   * @ordered
   */
  protected DeliveryDriver deliveryDriver;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderImpl()
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
    return MyRdsPackage.Literals.ORDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOrderNumber()
  {
    return orderNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrderNumber(int newOrderNumber)
  {
    int oldOrderNumber = orderNumber;
    orderNumber = newOrderNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__ORDER_NUMBER, oldOrderNumber, orderNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrderStatus getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatus(OrderStatus newStatus)
  {
    OrderStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDeliveryAddress()
  {
    return deliveryAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeliveryAddress(String newDeliveryAddress)
  {
    String oldDeliveryAddress = deliveryAddress;
    deliveryAddress = newDeliveryAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__DELIVERY_ADDRESS, oldDeliveryAddress, deliveryAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOrderedDatetime()
  {
    return orderedDatetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrderedDatetime(String newOrderedDatetime)
  {
    String oldOrderedDatetime = orderedDatetime;
    orderedDatetime = newOrderedDatetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__ORDERED_DATETIME, oldOrderedDatetime, orderedDatetime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDeliveredDatetime()
  {
    return deliveredDatetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeliveredDatetime(String newDeliveredDatetime)
  {
    String oldDeliveredDatetime = deliveredDatetime;
    deliveredDatetime = newDeliveredDatetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__DELIVERED_DATETIME, oldDeliveredDatetime, deliveredDatetime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRequestedDeliveryDatetime()
  {
    return requestedDeliveryDatetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequestedDeliveryDatetime(String newRequestedDeliveryDatetime)
  {
    String oldRequestedDeliveryDatetime = requestedDeliveryDatetime;
    requestedDeliveryDatetime = newRequestedDeliveryDatetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__REQUESTED_DELIVERY_DATETIME, oldRequestedDeliveryDatetime, requestedDeliveryDatetime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OrderItem> getOrderItems()
  {
    if (orderItems == null)
    {
      orderItems = new EObjectResolvingEList<OrderItem>(OrderItem.class, this, MyRdsPackage.ORDER__ORDER_ITEMS);
    }
    return orderItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Review getReview()
  {
    if (review != null && review.eIsProxy())
    {
      InternalEObject oldReview = (InternalEObject)review;
      review = (Review)eResolveProxy(oldReview);
      if (review != oldReview)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyRdsPackage.ORDER__REVIEW, oldReview, review));
      }
    }
    return review;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Review basicGetReview()
  {
    return review;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReview(Review newReview)
  {
    Review oldReview = review;
    review = newReview;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__REVIEW, oldReview, review));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Customer getCustomer()
  {
    if (customer != null && customer.eIsProxy())
    {
      InternalEObject oldCustomer = (InternalEObject)customer;
      customer = (Customer)eResolveProxy(oldCustomer);
      if (customer != oldCustomer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyRdsPackage.ORDER__CUSTOMER, oldCustomer, customer));
      }
    }
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer basicGetCustomer()
  {
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomer(Customer newCustomer)
  {
    Customer oldCustomer = customer;
    customer = newCustomer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__CUSTOMER, oldCustomer, customer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeliveryDriver getDeliveryDriver()
  {
    if (deliveryDriver != null && deliveryDriver.eIsProxy())
    {
      InternalEObject oldDeliveryDriver = (InternalEObject)deliveryDriver;
      deliveryDriver = (DeliveryDriver)eResolveProxy(oldDeliveryDriver);
      if (deliveryDriver != oldDeliveryDriver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyRdsPackage.ORDER__DELIVERY_DRIVER, oldDeliveryDriver, deliveryDriver));
      }
    }
    return deliveryDriver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeliveryDriver basicGetDeliveryDriver()
  {
    return deliveryDriver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeliveryDriver(DeliveryDriver newDeliveryDriver)
  {
    DeliveryDriver oldDeliveryDriver = deliveryDriver;
    deliveryDriver = newDeliveryDriver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyRdsPackage.ORDER__DELIVERY_DRIVER, oldDeliveryDriver, deliveryDriver));
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
      case MyRdsPackage.ORDER__ORDER_NUMBER:
        return getOrderNumber();
      case MyRdsPackage.ORDER__STATUS:
        return getStatus();
      case MyRdsPackage.ORDER__DELIVERY_ADDRESS:
        return getDeliveryAddress();
      case MyRdsPackage.ORDER__ORDERED_DATETIME:
        return getOrderedDatetime();
      case MyRdsPackage.ORDER__DELIVERED_DATETIME:
        return getDeliveredDatetime();
      case MyRdsPackage.ORDER__REQUESTED_DELIVERY_DATETIME:
        return getRequestedDeliveryDatetime();
      case MyRdsPackage.ORDER__ORDER_ITEMS:
        return getOrderItems();
      case MyRdsPackage.ORDER__REVIEW:
        if (resolve) return getReview();
        return basicGetReview();
      case MyRdsPackage.ORDER__CUSTOMER:
        if (resolve) return getCustomer();
        return basicGetCustomer();
      case MyRdsPackage.ORDER__DELIVERY_DRIVER:
        if (resolve) return getDeliveryDriver();
        return basicGetDeliveryDriver();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyRdsPackage.ORDER__ORDER_NUMBER:
        setOrderNumber((Integer)newValue);
        return;
      case MyRdsPackage.ORDER__STATUS:
        setStatus((OrderStatus)newValue);
        return;
      case MyRdsPackage.ORDER__DELIVERY_ADDRESS:
        setDeliveryAddress((String)newValue);
        return;
      case MyRdsPackage.ORDER__ORDERED_DATETIME:
        setOrderedDatetime((String)newValue);
        return;
      case MyRdsPackage.ORDER__DELIVERED_DATETIME:
        setDeliveredDatetime((String)newValue);
        return;
      case MyRdsPackage.ORDER__REQUESTED_DELIVERY_DATETIME:
        setRequestedDeliveryDatetime((String)newValue);
        return;
      case MyRdsPackage.ORDER__ORDER_ITEMS:
        getOrderItems().clear();
        getOrderItems().addAll((Collection<? extends OrderItem>)newValue);
        return;
      case MyRdsPackage.ORDER__REVIEW:
        setReview((Review)newValue);
        return;
      case MyRdsPackage.ORDER__CUSTOMER:
        setCustomer((Customer)newValue);
        return;
      case MyRdsPackage.ORDER__DELIVERY_DRIVER:
        setDeliveryDriver((DeliveryDriver)newValue);
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
      case MyRdsPackage.ORDER__ORDER_NUMBER:
        setOrderNumber(ORDER_NUMBER_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__DELIVERY_ADDRESS:
        setDeliveryAddress(DELIVERY_ADDRESS_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__ORDERED_DATETIME:
        setOrderedDatetime(ORDERED_DATETIME_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__DELIVERED_DATETIME:
        setDeliveredDatetime(DELIVERED_DATETIME_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__REQUESTED_DELIVERY_DATETIME:
        setRequestedDeliveryDatetime(REQUESTED_DELIVERY_DATETIME_EDEFAULT);
        return;
      case MyRdsPackage.ORDER__ORDER_ITEMS:
        getOrderItems().clear();
        return;
      case MyRdsPackage.ORDER__REVIEW:
        setReview((Review)null);
        return;
      case MyRdsPackage.ORDER__CUSTOMER:
        setCustomer((Customer)null);
        return;
      case MyRdsPackage.ORDER__DELIVERY_DRIVER:
        setDeliveryDriver((DeliveryDriver)null);
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
      case MyRdsPackage.ORDER__ORDER_NUMBER:
        return orderNumber != ORDER_NUMBER_EDEFAULT;
      case MyRdsPackage.ORDER__STATUS:
        return status != STATUS_EDEFAULT;
      case MyRdsPackage.ORDER__DELIVERY_ADDRESS:
        return DELIVERY_ADDRESS_EDEFAULT == null ? deliveryAddress != null : !DELIVERY_ADDRESS_EDEFAULT.equals(deliveryAddress);
      case MyRdsPackage.ORDER__ORDERED_DATETIME:
        return ORDERED_DATETIME_EDEFAULT == null ? orderedDatetime != null : !ORDERED_DATETIME_EDEFAULT.equals(orderedDatetime);
      case MyRdsPackage.ORDER__DELIVERED_DATETIME:
        return DELIVERED_DATETIME_EDEFAULT == null ? deliveredDatetime != null : !DELIVERED_DATETIME_EDEFAULT.equals(deliveredDatetime);
      case MyRdsPackage.ORDER__REQUESTED_DELIVERY_DATETIME:
        return REQUESTED_DELIVERY_DATETIME_EDEFAULT == null ? requestedDeliveryDatetime != null : !REQUESTED_DELIVERY_DATETIME_EDEFAULT.equals(requestedDeliveryDatetime);
      case MyRdsPackage.ORDER__ORDER_ITEMS:
        return orderItems != null && !orderItems.isEmpty();
      case MyRdsPackage.ORDER__REVIEW:
        return review != null;
      case MyRdsPackage.ORDER__CUSTOMER:
        return customer != null;
      case MyRdsPackage.ORDER__DELIVERY_DRIVER:
        return deliveryDriver != null;
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
    result.append(" (orderNumber: ");
    result.append(orderNumber);
    result.append(", status: ");
    result.append(status);
    result.append(", deliveryAddress: ");
    result.append(deliveryAddress);
    result.append(", orderedDatetime: ");
    result.append(orderedDatetime);
    result.append(", deliveredDatetime: ");
    result.append(deliveredDatetime);
    result.append(", requestedDeliveryDatetime: ");
    result.append(requestedDeliveryDatetime);
    result.append(')');
    return result.toString();
  }

} //OrderImpl
