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
 * A representation of the model object '<em><b>Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp2.Compose#getName <em>Name</em>}</li>
 *   <li>{@link tp2.Compose#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link tp2.Compose#get_ingredient <em>ingredient</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp2.Tp2Package#getCompose()
 * @model annotation="diagraph link='' label\075quantite='' style\075e1=''"
 * @generated
 */
public interface Compose extends EObject {
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
	 * @see tp2.Tp2Package#getCompose_Name()
	 * @model transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp2.Compose#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see tp2.Tp2Package#getCompose_Quantite()
	 * @model
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link tp2.Compose#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

	/**
	 * Returns the value of the '<em><b>ingredient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ingredient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ingredient</em>' reference.
	 * @see #set_ingredient(Ingredient)
	 * @see tp2.Tp2Package#getCompose__ingredient()
	 * @model
	 * @generated
	 */
	Ingredient get_ingredient();

	/**
	 * Sets the value of the '{@link tp2.Compose#get_ingredient <em>ingredient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ingredient</em>' reference.
	 * @see #get_ingredient()
	 * @generated
	 */
	void set_ingredient(Ingredient value);

} // Compose
