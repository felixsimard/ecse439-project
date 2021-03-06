/**
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.myRds.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.project.rds.myRds.Customer;
import org.xtext.project.rds.myRds.DeliveryDriver;
import org.xtext.project.rds.myRds.Menu;
import org.xtext.project.rds.myRds.MenuItem;
import org.xtext.project.rds.myRds.MenuItemCategory;
import org.xtext.project.rds.myRds.MyRdsFactory;
import org.xtext.project.rds.myRds.MyRdsPackage;
import org.xtext.project.rds.myRds.Order;
import org.xtext.project.rds.myRds.OrderItem;
import org.xtext.project.rds.myRds.OrderStatus;
import org.xtext.project.rds.myRds.Restaurant;
import org.xtext.project.rds.myRds.Review;
import org.xtext.project.rds.myRds.User;
import org.xtext.project.rds.myRds.UserRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyRdsPackageImpl extends EPackageImpl implements MyRdsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deliveryDriverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restaurantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reviewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum orderStatusEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum menuItemCategoryEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.project.rds.myRds.MyRdsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyRdsPackageImpl()
  {
    super(eNS_URI, MyRdsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MyRdsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyRdsPackage init()
  {
    if (isInited) return (MyRdsPackage)EPackage.Registry.INSTANCE.getEPackage(MyRdsPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMyRdsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MyRdsPackageImpl theMyRdsPackage = registeredMyRdsPackage instanceof MyRdsPackageImpl ? (MyRdsPackageImpl)registeredMyRdsPackage : new MyRdsPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMyRdsPackage.createPackageContents();

    // Initialize created meta-data
    theMyRdsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyRdsPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyRdsPackage.eNS_URI, theMyRdsPackage);
    return theMyRdsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRDS()
  {
    return rdsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRDS_Users()
  {
    return (EReference)rdsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRDS_Restaurants()
  {
    return (EReference)rdsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRDS_Orders()
  {
    return (EReference)rdsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUser_FullName()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUser_Password()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUser_Phone()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUser_Email()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUser_Roles()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUserRole()
  {
    return userRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUserRole_Name()
  {
    return (EAttribute)userRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCustomer()
  {
    return customerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeliveryDriver()
  {
    return deliveryDriverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeliveryDriver_IsAvailable()
  {
    return (EAttribute)deliveryDriverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeliveryDriver_CarLicenceNumber()
  {
    return (EAttribute)deliveryDriverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrder()
  {
    return orderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_OrderNumber()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_Status()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_DeliveryAddress()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrder_Customer()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrder_DeliveryDriver()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_OrderedDatetime()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_DeliveredDatetime()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrder_RequestedDeliveryDatetime()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrder_OrderItems()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrder_Review()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRestaurant()
  {
    return restaurantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRestaurant_Name()
  {
    return (EAttribute)restaurantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRestaurant_Address()
  {
    return (EAttribute)restaurantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRestaurant_Menu()
  {
    return (EReference)restaurantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMenu()
  {
    return menuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMenu_Id()
  {
    return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMenu_MenuItems()
  {
    return (EReference)menuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMenuItem()
  {
    return menuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMenuItem_Name()
  {
    return (EAttribute)menuItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMenuItem_Price()
  {
    return (EAttribute)menuItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMenuItem_Description()
  {
    return (EAttribute)menuItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMenuItem_Category()
  {
    return (EAttribute)menuItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrderItem()
  {
    return orderItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrderItem_Quantity()
  {
    return (EAttribute)orderItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrderItem_MenuItem()
  {
    return (EReference)orderItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReview()
  {
    return reviewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReview_Id()
  {
    return (EAttribute)reviewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReview_NumStars()
  {
    return (EAttribute)reviewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReview_Description()
  {
    return (EAttribute)reviewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReview_ReviewDatetime()
  {
    return (EAttribute)reviewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getOrderStatus()
  {
    return orderStatusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMenuItemCategory()
  {
    return menuItemCategoryEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyRdsFactory getMyRdsFactory()
  {
    return (MyRdsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rdsEClass = createEClass(RDS);
    createEReference(rdsEClass, RDS__USERS);
    createEReference(rdsEClass, RDS__RESTAURANTS);
    createEReference(rdsEClass, RDS__ORDERS);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__FULL_NAME);
    createEAttribute(userEClass, USER__PASSWORD);
    createEAttribute(userEClass, USER__PHONE);
    createEAttribute(userEClass, USER__EMAIL);
    createEReference(userEClass, USER__ROLES);

    userRoleEClass = createEClass(USER_ROLE);
    createEAttribute(userRoleEClass, USER_ROLE__NAME);

    customerEClass = createEClass(CUSTOMER);

    deliveryDriverEClass = createEClass(DELIVERY_DRIVER);
    createEAttribute(deliveryDriverEClass, DELIVERY_DRIVER__IS_AVAILABLE);
    createEAttribute(deliveryDriverEClass, DELIVERY_DRIVER__CAR_LICENCE_NUMBER);

    orderEClass = createEClass(ORDER);
    createEAttribute(orderEClass, ORDER__ORDER_NUMBER);
    createEAttribute(orderEClass, ORDER__STATUS);
    createEAttribute(orderEClass, ORDER__DELIVERY_ADDRESS);
    createEReference(orderEClass, ORDER__CUSTOMER);
    createEReference(orderEClass, ORDER__DELIVERY_DRIVER);
    createEAttribute(orderEClass, ORDER__ORDERED_DATETIME);
    createEAttribute(orderEClass, ORDER__DELIVERED_DATETIME);
    createEAttribute(orderEClass, ORDER__REQUESTED_DELIVERY_DATETIME);
    createEReference(orderEClass, ORDER__ORDER_ITEMS);
    createEReference(orderEClass, ORDER__REVIEW);

    restaurantEClass = createEClass(RESTAURANT);
    createEAttribute(restaurantEClass, RESTAURANT__NAME);
    createEAttribute(restaurantEClass, RESTAURANT__ADDRESS);
    createEReference(restaurantEClass, RESTAURANT__MENU);

    menuEClass = createEClass(MENU);
    createEAttribute(menuEClass, MENU__ID);
    createEReference(menuEClass, MENU__MENU_ITEMS);

    menuItemEClass = createEClass(MENU_ITEM);
    createEAttribute(menuItemEClass, MENU_ITEM__NAME);
    createEAttribute(menuItemEClass, MENU_ITEM__PRICE);
    createEAttribute(menuItemEClass, MENU_ITEM__DESCRIPTION);
    createEAttribute(menuItemEClass, MENU_ITEM__CATEGORY);

    orderItemEClass = createEClass(ORDER_ITEM);
    createEAttribute(orderItemEClass, ORDER_ITEM__QUANTITY);
    createEReference(orderItemEClass, ORDER_ITEM__MENU_ITEM);

    reviewEClass = createEClass(REVIEW);
    createEAttribute(reviewEClass, REVIEW__ID);
    createEAttribute(reviewEClass, REVIEW__NUM_STARS);
    createEAttribute(reviewEClass, REVIEW__DESCRIPTION);
    createEAttribute(reviewEClass, REVIEW__REVIEW_DATETIME);

    // Create enums
    orderStatusEEnum = createEEnum(ORDER_STATUS);
    menuItemCategoryEEnum = createEEnum(MENU_ITEM_CATEGORY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    customerEClass.getESuperTypes().add(this.getUserRole());
    deliveryDriverEClass.getESuperTypes().add(this.getUserRole());

    // Initialize classes and features; add operations and parameters
    initEClass(rdsEClass, org.xtext.project.rds.myRds.RDS.class, "RDS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRDS_Users(), this.getUser(), null, "users", null, 0, -1, org.xtext.project.rds.myRds.RDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDS_Restaurants(), this.getRestaurant(), null, "restaurants", null, 0, -1, org.xtext.project.rds.myRds.RDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDS_Orders(), this.getOrder(), null, "orders", null, 0, -1, org.xtext.project.rds.myRds.RDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_Roles(), this.getUserRole(), null, "roles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userRoleEClass, UserRole.class, "UserRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deliveryDriverEClass, DeliveryDriver.class, "DeliveryDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeliveryDriver_IsAvailable(), ecorePackage.getEBoolean(), "isAvailable", null, 0, 1, DeliveryDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeliveryDriver_CarLicenceNumber(), ecorePackage.getEString(), "carLicenceNumber", null, 0, 1, DeliveryDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrder_OrderNumber(), ecorePackage.getEString(), "orderNumber", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_Status(), this.getOrderStatus(), "status", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_DeliveryAddress(), ecorePackage.getEString(), "deliveryAddress", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_Customer(), this.getCustomer(), null, "customer", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_DeliveryDriver(), this.getDeliveryDriver(), null, "deliveryDriver", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_OrderedDatetime(), ecorePackage.getEString(), "orderedDatetime", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_DeliveredDatetime(), ecorePackage.getEString(), "deliveredDatetime", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_RequestedDeliveryDatetime(), ecorePackage.getEString(), "requestedDeliveryDatetime", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_OrderItems(), this.getOrderItem(), null, "orderItems", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_Review(), this.getReview(), null, "review", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRestaurant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRestaurant_Address(), ecorePackage.getEString(), "address", null, 0, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestaurant_Menu(), this.getMenu(), null, "menu", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenu_Id(), ecorePackage.getEString(), "id", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenu_MenuItems(), this.getMenuItem(), null, "menuItems", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenuItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuItem_Price(), ecorePackage.getEString(), "price", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuItem_Category(), this.getMenuItemCategory(), "category", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderItemEClass, OrderItem.class, "OrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrderItem_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrderItem_MenuItem(), this.getMenuItem(), null, "menuItem", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReview_Id(), ecorePackage.getEString(), "id", null, 0, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReview_NumStars(), ecorePackage.getEInt(), "numStars", null, 0, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReview_Description(), ecorePackage.getEString(), "description", null, 0, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReview_ReviewDatetime(), ecorePackage.getEString(), "reviewDatetime", null, 0, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(orderStatusEEnum, OrderStatus.class, "OrderStatus");
    addEEnumLiteral(orderStatusEEnum, OrderStatus.ACCEPTED);
    addEEnumLiteral(orderStatusEEnum, OrderStatus.PREPARATION);
    addEEnumLiteral(orderStatusEEnum, OrderStatus.READY_PICKUP);
    addEEnumLiteral(orderStatusEEnum, OrderStatus.PICKED_UP);
    addEEnumLiteral(orderStatusEEnum, OrderStatus.DELIVERED);

    initEEnum(menuItemCategoryEEnum, MenuItemCategory.class, "MenuItemCategory");
    addEEnumLiteral(menuItemCategoryEEnum, MenuItemCategory.APPETIZER);
    addEEnumLiteral(menuItemCategoryEEnum, MenuItemCategory.SIDE_DISH);
    addEEnumLiteral(menuItemCategoryEEnum, MenuItemCategory.MAIN_DISH);
    addEEnumLiteral(menuItemCategoryEEnum, MenuItemCategory.DESSERT);
    addEEnumLiteral(menuItemCategoryEEnum, MenuItemCategory.DRINK);

    // Create resource
    createResource(eNS_URI);
  }

} //MyRdsPackageImpl
