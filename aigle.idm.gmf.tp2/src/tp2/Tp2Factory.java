/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tp2.Tp2Package
 * @generated
 */
public interface Tp2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp2Factory eINSTANCE = tp2.impl.Tp2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Livre Recettes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livre Recettes</em>'.
	 * @generated
	 */
	LivreRecettes createLivreRecettes();

	/**
	 * Returns a new object of class '<em>Recette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recette</em>'.
	 * @generated
	 */
	Recette createRecette();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Vin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vin</em>'.
	 * @generated
	 */
	Vin createVin();

	/**
	 * Returns a new object of class '<em>Compose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compose</em>'.
	 * @generated
	 */
	Compose createCompose();

	/**
	 * Returns a new object of class '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localisation</em>'.
	 * @generated
	 */
	Localisation createLocalisation();

	/**
	 * Returns a new object of class '<em>Bouteille</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouteille</em>'.
	 * @generated
	 */
	Bouteille createBouteille();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tp2Package getTp2Package();

} //Tp2Factory
