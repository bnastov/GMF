/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp2.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link tp2.Ingredient#getNature <em>Nature</em>}</li>
 *   <li>{@link tp2.Ingredient#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp2.Tp2Package#getIngredient()
 * @model annotation="diagraph node='' label\075name='' style\075n5=''"
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tp2.Tp2Package#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp2.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link tp2.Nature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see tp2.Nature
	 * @see #setNature(Nature)
	 * @see tp2.Tp2Package#getIngredient_Nature()
	 * @model
	 * @generated
	 */
	Nature getNature();

	/**
	 * Sets the value of the '{@link tp2.Ingredient#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see tp2.Nature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(Nature value);

	/**
	 * Returns the value of the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prix</em>' attribute.
	 * @see #setPrix(double)
	 * @see tp2.Tp2Package#getIngredient_Prix()
	 * @model
	 * @generated
	 */
	double getPrix();

	/**
	 * Sets the value of the '{@link tp2.Ingredient#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(double value);

} // Ingredient
