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
 * A representation of the model object '<em><b>Livre Recettes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp2.LivreRecettes#getRecettes <em>Recettes</em>}</li>
 *   <li>{@link tp2.LivreRecettes#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link tp2.LivreRecettes#getDepartements <em>Departements</em>}</li>
 *   <li>{@link tp2.LivreRecettes#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp2.Tp2Package#getLivreRecettes()
 * @model annotation="diagraph pov=''"
 * @generated
 */
public interface LivreRecettes extends EObject {
	/**
	 * Returns the value of the '<em><b>Recettes</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Recette}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recettes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recettes</em>' containment reference list.
	 * @see tp2.Tp2Package#getLivreRecettes_Recettes()
	 * @model type="tp2.Recette" containment="true"
	 * @generated
	 */
	EList getRecettes();

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see tp2.Tp2Package#getLivreRecettes_Ingredients()
	 * @model type="tp2.Ingredient" containment="true"
	 * @generated
	 */
	EList getIngredients();

	/**
	 * Returns the value of the '<em><b>Departements</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Localisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departements</em>' containment reference list.
	 * @see tp2.Tp2Package#getLivreRecettes_Departements()
	 * @model type="tp2.Localisation" containment="true"
	 * @generated
	 */
	EList getDepartements();

	/**
	 * Returns the value of the '<em><b>Vins</b></em>' containment reference list.
	 * The list contents are of type {@link tp2.Vin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vins</em>' containment reference list.
	 * @see tp2.Tp2Package#getLivreRecettes_Vins()
	 * @model type="tp2.Vin" containment="true"
	 * @generated
	 */
	EList getVins();

} // LivreRecettes
