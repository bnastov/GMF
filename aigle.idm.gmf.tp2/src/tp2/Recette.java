/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp2.Recette#getNom <em>Nom</em>}</li>
 *   <li>{@link tp2.Recette#getCout <em>Cout</em>}</li>
 *   <li>{@link tp2.Recette#getComposes <em>Composes</em>}</li>
 *   <li>{@link tp2.Recette#getOrigineRegionale <em>Origine Regionale</em>}</li>
 *   <li>{@link tp2.Recette#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp2.Tp2Package#getRecette()
 * @model annotation="diagraph node='' style\075n1='' nav:ingredient='null' label\075nom='' section\075entities='null' lnk\075composes='' kref\075vins='' style.kref.vins\075p1='' ref\075origineRegionale='null'"
 * @generated
 */
public interface Recette extends EObject {
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
	 * @see tp2.Tp2Package#getRecette_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tp2.Recette#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Cout</b></em>' attribute.
	 * The literals are from the enumeration {@link tp2.Cout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout</em>' attribute.
	 * @see tp2.Cout
	 * @see #setCout(Cout)
	 * @see tp2.Tp2Package#getRecette_Cout()
	 * @model
	 * @generated
	 */
	Cout getCout();

	/**
	 * Sets the value of the '{@link tp2.Recette#getCout <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout</em>' attribute.
	 * @see tp2.Cout
	 * @see #getCout()
	 * @generated
	 */
	void setCout(Cout value);

	/**
	 * Returns the value of the '<em><b>Composes</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Compose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' containment reference list.
	 * @see tp2.Tp2Package#getRecette_Composes()
	 * @model type="tp2.Compose" containment="true"
	 * @generated
	 */
	EList getComposes();

	/**
	 * Returns the value of the '<em><b>Origine Regionale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Regionale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Regionale</em>' reference.
	 * @see #setOrigineRegionale(Localisation)
	 * @see tp2.Tp2Package#getRecette_OrigineRegionale()
	 * @model
	 * @generated
	 */
	Localisation getOrigineRegionale();

	/**
	 * Sets the value of the '{@link tp2.Recette#getOrigineRegionale <em>Origine Regionale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Regionale</em>' reference.
	 * @see #getOrigineRegionale()
	 * @generated
	 */
	void setOrigineRegionale(Localisation value);

	/**
	 * Returns the value of the '<em><b>Vins</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Bouteille}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vins</em>' containment reference list.
	 * @see tp2.Tp2Package#getRecette_Vins()
	 * @model type="tp2.Bouteille" containment="true" upper="2"
	 * @generated
	 */
	EList getVins();

} // Recette
