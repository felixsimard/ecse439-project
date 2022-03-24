/**
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.myRds;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.rds.myRds.Restaurant#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.Restaurant#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.project.rds.myRds.Restaurant#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.rds.myRds.MyRdsPackage#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.rds.myRds.MyRdsPackage#getRestaurant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.rds.myRds.Restaurant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see org.xtext.project.rds.myRds.MyRdsPackage#getRestaurant_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link org.xtext.project.rds.myRds.Restaurant#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>Menu</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu</em>' reference.
   * @see #setMenu(Menu)
   * @see org.xtext.project.rds.myRds.MyRdsPackage#getRestaurant_Menu()
   * @model
   * @generated
   */
  Menu getMenu();

  /**
   * Sets the value of the '{@link org.xtext.project.rds.myRds.Restaurant#getMenu <em>Menu</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menu</em>' reference.
   * @see #getMenu()
   * @generated
   */
  void setMenu(Menu value);

} // Restaurant
