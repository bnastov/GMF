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
 * A representation of the model object '<em><b>Bouteille</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp2.Bouteille#get_vin <em>vin</em>}</li>
 *   <li>{@link tp2.Bouteille#getNom <em>Nom</em>}</li>
 *   <li>{@link tp2.Bouteille#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp2.Tp2Package#getBouteille()
 * @model annotation="diagraph node='null' label\075nom='null'"
 * @generated
 */
public interface Bouteille extends EObject {
	/**
	 * Returns the value of the '<em><b>vin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>vin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>vin</em>' reference.
	 * @see #set_vin(Vin)
	 * @see tp2.Tp2Package#getBouteille__vin()
	 * @model
	 * @generated
	 */
	Vin get_vin();

	/**
	 * Sets the value of the '{@link tp2.Bouteille#get_vin <em>vin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>vin</em>' reference.
	 * @see #get_vin()
	 * @generated
	 */
	void set_vin(Vin value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tp2.Tp2Package#getBouteille_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tp2.Bouteille#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see tp2.Tp2Package#getBouteille_Prix()
	 * @model
	 * @generated
	 */
	double getPrix();

	/**
	 * Sets the value of the '{@link tp2.Bouteille#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(double value);

} // Bouteille
