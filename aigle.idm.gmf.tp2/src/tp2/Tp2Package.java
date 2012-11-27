/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tp2.Tp2Factory
 * @model kind="package"
 * @generated
 */
public interface Tp2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tp2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///recette1-tp2-v0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp2Package eINSTANCE = tp2.impl.Tp2PackageImpl.init();

	/**
	 * The meta object id for the '{@link tp2.impl.LivreRecettesImpl <em>Livre Recettes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.LivreRecettesImpl
	 * @see tp2.impl.Tp2PackageImpl#getLivreRecettes()
	 * @generated
	 */
	int LIVRE_RECETTES = 0;

	/**
	 * The feature id for the '<em><b>Recettes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__RECETTES = 0;

	/**
	 * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__INGREDIENTS = 1;

	/**
	 * The feature id for the '<em><b>Departements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__DEPARTEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Vins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__VINS = 3;

	/**
	 * The number of structural features of the '<em>Livre Recettes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link tp2.impl.RecetteImpl <em>Recette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.RecetteImpl
	 * @see tp2.impl.Tp2PackageImpl#getRecette()
	 * @generated
	 */
	int RECETTE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Cout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__COUT = 1;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__COMPOSES = 2;

	/**
	 * The feature id for the '<em><b>Origine Regionale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__ORIGINE_REGIONALE = 3;

	/**
	 * The feature id for the '<em><b>Vins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__VINS = 4;

	/**
	 * The number of structural features of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link tp2.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.IngredientImpl
	 * @see tp2.impl.Tp2PackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NATURE = 1;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__PRIX = 2;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp2.impl.VinImpl <em>Vin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.VinImpl
	 * @see tp2.impl.Tp2PackageImpl#getVin()
	 * @generated
	 */
	int VIN = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN__NOM = 0;

	/**
	 * The number of structural features of the '<em>Vin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tp2.impl.ComposeImpl <em>Compose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.ComposeImpl
	 * @see tp2.impl.Tp2PackageImpl#getCompose()
	 * @generated
	 */
	int COMPOSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__QUANTITE = 1;

	/**
	 * The feature id for the '<em><b>ingredient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__INGREDIENT = 2;

	/**
	 * The number of structural features of the '<em>Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp2.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.LocalisationImpl
	 * @see tp2.impl.Tp2PackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tp2.impl.BouteilleImpl <em>Bouteille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.impl.BouteilleImpl
	 * @see tp2.impl.Tp2PackageImpl#getBouteille()
	 * @generated
	 */
	int BOUTEILLE = 6;

	/**
	 * The feature id for the '<em><b>vin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__VIN = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__PRIX = 2;

	/**
	 * The number of structural features of the '<em>Bouteille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp2.Cout <em>Cout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.Cout
	 * @see tp2.impl.Tp2PackageImpl#getCout()
	 * @generated
	 */
	int COUT = 7;

	/**
	 * The meta object id for the '{@link tp2.Nature <em>Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp2.Nature
	 * @see tp2.impl.Tp2PackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 8;


	/**
	 * Returns the meta object for class '{@link tp2.LivreRecettes <em>Livre Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livre Recettes</em>'.
	 * @see tp2.LivreRecettes
	 * @generated
	 */
	EClass getLivreRecettes();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.LivreRecettes#getRecettes <em>Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recettes</em>'.
	 * @see tp2.LivreRecettes#getRecettes()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Recettes();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.LivreRecettes#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredients</em>'.
	 * @see tp2.LivreRecettes#getIngredients()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Ingredients();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.LivreRecettes#getDepartements <em>Departements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departements</em>'.
	 * @see tp2.LivreRecettes#getDepartements()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Departements();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.LivreRecettes#getVins <em>Vins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vins</em>'.
	 * @see tp2.LivreRecettes#getVins()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Vins();

	/**
	 * Returns the meta object for class '{@link tp2.Recette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recette</em>'.
	 * @see tp2.Recette
	 * @generated
	 */
	EClass getRecette();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Recette#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tp2.Recette#getNom()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Recette#getCout <em>Cout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cout</em>'.
	 * @see tp2.Recette#getCout()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Cout();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.Recette#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composes</em>'.
	 * @see tp2.Recette#getComposes()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Composes();

	/**
	 * Returns the meta object for the reference '{@link tp2.Recette#getOrigineRegionale <em>Origine Regionale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origine Regionale</em>'.
	 * @see tp2.Recette#getOrigineRegionale()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_OrigineRegionale();

	/**
	 * Returns the meta object for the containment reference list '{@link tp2.Recette#getVins <em>Vins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vins</em>'.
	 * @see tp2.Recette#getVins()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Vins();

	/**
	 * Returns the meta object for class '{@link tp2.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see tp2.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp2.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Ingredient#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see tp2.Ingredient#getNature()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Nature();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Ingredient#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see tp2.Ingredient#getPrix()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Prix();

	/**
	 * Returns the meta object for class '{@link tp2.Vin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vin</em>'.
	 * @see tp2.Vin
	 * @generated
	 */
	EClass getVin();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Vin#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tp2.Vin#getNom()
	 * @see #getVin()
	 * @generated
	 */
	EAttribute getVin_Nom();

	/**
	 * Returns the meta object for class '{@link tp2.Compose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compose</em>'.
	 * @see tp2.Compose
	 * @generated
	 */
	EClass getCompose();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Compose#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp2.Compose#getName()
	 * @see #getCompose()
	 * @generated
	 */
	EAttribute getCompose_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Compose#getQuantite <em>Quantite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantite</em>'.
	 * @see tp2.Compose#getQuantite()
	 * @see #getCompose()
	 * @generated
	 */
	EAttribute getCompose_Quantite();

	/**
	 * Returns the meta object for the reference '{@link tp2.Compose#get_ingredient <em>ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ingredient</em>'.
	 * @see tp2.Compose#get_ingredient()
	 * @see #getCompose()
	 * @generated
	 */
	EReference getCompose__ingredient();

	/**
	 * Returns the meta object for class '{@link tp2.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see tp2.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Localisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp2.Localisation#getName()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Name();

	/**
	 * Returns the meta object for class '{@link tp2.Bouteille <em>Bouteille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouteille</em>'.
	 * @see tp2.Bouteille
	 * @generated
	 */
	EClass getBouteille();

	/**
	 * Returns the meta object for the reference '{@link tp2.Bouteille#get_vin <em>vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>vin</em>'.
	 * @see tp2.Bouteille#get_vin()
	 * @see #getBouteille()
	 * @generated
	 */
	EReference getBouteille__vin();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Bouteille#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tp2.Bouteille#getNom()
	 * @see #getBouteille()
	 * @generated
	 */
	EAttribute getBouteille_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tp2.Bouteille#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see tp2.Bouteille#getPrix()
	 * @see #getBouteille()
	 * @generated
	 */
	EAttribute getBouteille_Prix();

	/**
	 * Returns the meta object for enum '{@link tp2.Cout <em>Cout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cout</em>'.
	 * @see tp2.Cout
	 * @generated
	 */
	EEnum getCout();

	/**
	 * Returns the meta object for enum '{@link tp2.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nature</em>'.
	 * @see tp2.Nature
	 * @generated
	 */
	EEnum getNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tp2Factory getTp2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tp2.impl.LivreRecettesImpl <em>Livre Recettes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.LivreRecettesImpl
		 * @see tp2.impl.Tp2PackageImpl#getLivreRecettes()
		 * @generated
		 */
		EClass LIVRE_RECETTES = eINSTANCE.getLivreRecettes();

		/**
		 * The meta object literal for the '<em><b>Recettes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__RECETTES = eINSTANCE.getLivreRecettes_Recettes();

		/**
		 * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__INGREDIENTS = eINSTANCE.getLivreRecettes_Ingredients();

		/**
		 * The meta object literal for the '<em><b>Departements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__DEPARTEMENTS = eINSTANCE.getLivreRecettes_Departements();

		/**
		 * The meta object literal for the '<em><b>Vins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__VINS = eINSTANCE.getLivreRecettes_Vins();

		/**
		 * The meta object literal for the '{@link tp2.impl.RecetteImpl <em>Recette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.RecetteImpl
		 * @see tp2.impl.Tp2PackageImpl#getRecette()
		 * @generated
		 */
		EClass RECETTE = eINSTANCE.getRecette();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__NOM = eINSTANCE.getRecette_Nom();

		/**
		 * The meta object literal for the '<em><b>Cout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__COUT = eINSTANCE.getRecette_Cout();

		/**
		 * The meta object literal for the '<em><b>Composes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__COMPOSES = eINSTANCE.getRecette_Composes();

		/**
		 * The meta object literal for the '<em><b>Origine Regionale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__ORIGINE_REGIONALE = eINSTANCE.getRecette_OrigineRegionale();

		/**
		 * The meta object literal for the '<em><b>Vins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__VINS = eINSTANCE.getRecette_Vins();

		/**
		 * The meta object literal for the '{@link tp2.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.IngredientImpl
		 * @see tp2.impl.Tp2PackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NATURE = eINSTANCE.getIngredient_Nature();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__PRIX = eINSTANCE.getIngredient_Prix();

		/**
		 * The meta object literal for the '{@link tp2.impl.VinImpl <em>Vin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.VinImpl
		 * @see tp2.impl.Tp2PackageImpl#getVin()
		 * @generated
		 */
		EClass VIN = eINSTANCE.getVin();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIN__NOM = eINSTANCE.getVin_Nom();

		/**
		 * The meta object literal for the '{@link tp2.impl.ComposeImpl <em>Compose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.ComposeImpl
		 * @see tp2.impl.Tp2PackageImpl#getCompose()
		 * @generated
		 */
		EClass COMPOSE = eINSTANCE.getCompose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSE__NAME = eINSTANCE.getCompose_Name();

		/**
		 * The meta object literal for the '<em><b>Quantite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSE__QUANTITE = eINSTANCE.getCompose_Quantite();

		/**
		 * The meta object literal for the '<em><b>ingredient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSE__INGREDIENT = eINSTANCE.getCompose__ingredient();

		/**
		 * The meta object literal for the '{@link tp2.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.LocalisationImpl
		 * @see tp2.impl.Tp2PackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__NAME = eINSTANCE.getLocalisation_Name();

		/**
		 * The meta object literal for the '{@link tp2.impl.BouteilleImpl <em>Bouteille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.impl.BouteilleImpl
		 * @see tp2.impl.Tp2PackageImpl#getBouteille()
		 * @generated
		 */
		EClass BOUTEILLE = eINSTANCE.getBouteille();

		/**
		 * The meta object literal for the '<em><b>vin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUTEILLE__VIN = eINSTANCE.getBouteille__vin();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUTEILLE__NOM = eINSTANCE.getBouteille_Nom();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUTEILLE__PRIX = eINSTANCE.getBouteille_Prix();

		/**
		 * The meta object literal for the '{@link tp2.Cout <em>Cout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.Cout
		 * @see tp2.impl.Tp2PackageImpl#getCout()
		 * @generated
		 */
		EEnum COUT = eINSTANCE.getCout();

		/**
		 * The meta object literal for the '{@link tp2.Nature <em>Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp2.Nature
		 * @see tp2.impl.Tp2PackageImpl#getNature()
		 * @generated
		 */
		EEnum NATURE = eINSTANCE.getNature();

	}

} //Tp2Package
