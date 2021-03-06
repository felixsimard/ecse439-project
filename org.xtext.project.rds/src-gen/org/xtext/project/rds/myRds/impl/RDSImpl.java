/**
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.myRds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.rds.myRds.MyRdsPackage;
import org.xtext.project.rds.myRds.Order;
import org.xtext.project.rds.myRds.RDS;
import org.xtext.project.rds.myRds.Restaurant;
import org.xtext.project.rds.myRds.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.rds.myRds.impl.RDSImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.RDSImpl#getRestaurants <em>Restaurants</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.impl.RDSImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDSImpl extends MinimalEObjectImpl.Container implements RDS
{
  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<User> users;

  /**
   * The cached value of the '{@link #getRestaurants() <em>Restaurants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestaurants()
   * @generated
   * @ordered
   */
  protected EList<Restaurant> restaurants;

  /**
   * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrders()
   * @generated
   * @ordered
   */
  protected EList<Order> orders;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RDSImpl()
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
    return MyRdsPackage.Literals.RDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<User> getUsers()
  {
    if (users == null)
    {
      users = new EObjectContainmentEList<User>(User.class, this, MyRdsPackage.RDS__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Restaurant> getRestaurants()
  {
    if (restaurants == null)
    {
      restaurants = new EObjectContainmentEList<Restaurant>(Restaurant.class, this, MyRdsPackage.RDS__RESTAURANTS);
    }
    return restaurants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Order> getOrders()
  {
    if (orders == null)
    {
      orders = new EObjectContainmentEList<Order>(Order.class, this, MyRdsPackage.RDS__ORDERS);
    }
    return orders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyRdsPackage.RDS__USERS:
        return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
      case MyRdsPackage.RDS__RESTAURANTS:
        return ((InternalEList<?>)getRestaurants()).basicRemove(otherEnd, msgs);
      case MyRdsPackage.RDS__ORDERS:
        return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyRdsPackage.RDS__USERS:
        return getUsers();
      case MyRdsPackage.RDS__RESTAURANTS:
        return getRestaurants();
      case MyRdsPackage.RDS__ORDERS:
        return getOrders();
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
      case MyRdsPackage.RDS__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends User>)newValue);
        return;
      case MyRdsPackage.RDS__RESTAURANTS:
        getRestaurants().clear();
        getRestaurants().addAll((Collection<? extends Restaurant>)newValue);
        return;
      case MyRdsPackage.RDS__ORDERS:
        getOrders().clear();
        getOrders().addAll((Collection<? extends Order>)newValue);
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
      case MyRdsPackage.RDS__USERS:
        getUsers().clear();
        return;
      case MyRdsPackage.RDS__RESTAURANTS:
        getRestaurants().clear();
        return;
      case MyRdsPackage.RDS__ORDERS:
        getOrders().clear();
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
      case MyRdsPackage.RDS__USERS:
        return users != null && !users.isEmpty();
      case MyRdsPackage.RDS__RESTAURANTS:
        return restaurants != null && !restaurants.isEmpty();
      case MyRdsPackage.RDS__ORDERS:
        return orders != null && !orders.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RDSImpl
