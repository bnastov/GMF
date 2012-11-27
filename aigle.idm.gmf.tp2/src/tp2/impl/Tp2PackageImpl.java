/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tp2.Bouteille;
import tp2.Compose;
import tp2.Cout;
import tp2.Ingredient;
import tp2.LivreRecettes;
import tp2.Localisation;
import tp2.Nature;
import tp2.Recette;
import tp2.Tp2Factory;
import tp2.Tp2Package;
import tp2.Vin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp2PackageImpl extends EPackageImpl implements Tp2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livreRecettesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recetteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bouteilleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coutEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum natureEEnum = null;

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
	 * @see tp2.Tp2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tp2PackageImpl() {
		super(eNS_URI, Tp2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Tp2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tp2Package init() {
		if (isInited) return (Tp2Package)EPackage.Registry.INSTANCE.getEPackage(Tp2Package.eNS_URI);

		// Obtain or create and register package
		Tp2PackageImpl theTp2Package = (Tp2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tp2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tp2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTp2Package.createPackageContents();

		// Initialize created meta-data
		theTp2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTp2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tp2Package.eNS_URI, theTp2Package);
		return theTp2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivreRecettes() {
		return livreRecettesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Recettes() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Ingredients() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Departements() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Vins() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecette() {
		return recetteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_Nom() {
		return (EAttribute)recetteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_Cout() {
		return (EAttribute)recetteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_Composes() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_OrigineRegionale() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_Vins() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Name() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Nature() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Prix() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVin() {
		return vinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVin_Nom() {
		return (EAttribute)vinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompose() {
		return composeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompose_Name() {
		return (EAttribute)composeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompose_Quantite() {
		return (EAttribute)composeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompose__ingredient() {
		return (EReference)composeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalisation() {
		return localisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Name() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBouteille() {
		return bouteilleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBouteille__vin() {
		return (EReference)bouteilleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBouteille_Nom() {
		return (EAttribute)bouteilleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBouteille_Prix() {
		return (EAttribute)bouteilleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCout() {
		return coutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNature() {
		return natureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp2Factory getTp2Factory() {
		return (Tp2Factory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		livreRecettesEClass = createEClass(LIVRE_RECETTES);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__RECETTES);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__INGREDIENTS);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__DEPARTEMENTS);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__VINS);

		recetteEClass = createEClass(RECETTE);
		createEAttribute(recetteEClass, RECETTE__NOM);
		createEAttribute(recetteEClass, RECETTE__COUT);
		createEReference(recetteEClass, RECETTE__COMPOSES);
		createEReference(recetteEClass, RECETTE__ORIGINE_REGIONALE);
		createEReference(recetteEClass, RECETTE__VINS);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__NAME);
		createEAttribute(ingredientEClass, INGREDIENT__NATURE);
		createEAttribute(ingredientEClass, INGREDIENT__PRIX);

		vinEClass = createEClass(VIN);
		createEAttribute(vinEClass, VIN__NOM);

		composeEClass = createEClass(COMPOSE);
		createEAttribute(composeEClass, COMPOSE__NAME);
		createEAttribute(composeEClass, COMPOSE__QUANTITE);
		createEReference(composeEClass, COMPOSE__INGREDIENT);

		localisationEClass = createEClass(LOCALISATION);
		createEAttribute(localisationEClass, LOCALISATION__NAME);

		bouteilleEClass = createEClass(BOUTEILLE);
		createEReference(bouteilleEClass, BOUTEILLE__VIN);
		createEAttribute(bouteilleEClass, BOUTEILLE__NOM);
		createEAttribute(bouteilleEClass, BOUTEILLE__PRIX);

		// Create enums
		coutEEnum = createEEnum(COUT);
		natureEEnum = createEEnum(NATURE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(livreRecettesEClass, LivreRecettes.class, "LivreRecettes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLivreRecettes_Recettes(), this.getRecette(), null, "recettes", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Departements(), this.getLocalisation(), null, "departements", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Vins(), this.getVin(), null, "vins", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recetteEClass, Recette.class, "Recette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecette_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecette_Cout(), this.getCout(), "cout", null, 0, 1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_Composes(), this.getCompose(), null, "composes", null, 0, -1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_OrigineRegionale(), this.getLocalisation(), null, "origineRegionale", null, 0, 1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_Vins(), this.getBouteille(), null, "vins", null, 0, 2, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Nature(), this.getNature(), "nature", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Prix(), ecorePackage.getEDouble(), "prix", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vinEClass, Vin.class, "Vin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVin_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Vin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composeEClass, Compose.class, "Compose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompose_Name(), ecorePackage.getEString(), "name", null, 0, 1, Compose.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompose_Quantite(), ecorePackage.getEInt(), "quantite", null, 0, 1, Compose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompose__ingredient(), this.getIngredient(), null, "_ingredient", null, 0, 1, Compose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localisationEClass, Localisation.class, "Localisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bouteilleEClass, Bouteille.class, "Bouteille", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBouteille__vin(), this.getVin(), null, "_vin", null, 0, 1, Bouteille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBouteille_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Bouteille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBouteille_Prix(), ecorePackage.getEDouble(), "prix", null, 0, 1, Bouteille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coutEEnum, Cout.class, "Cout");
		addEEnumLiteral(coutEEnum, Cout.FAIBLE_LITERAL);
		addEEnumLiteral(coutEEnum, Cout.MOYEN_LITERAL);
		addEEnumLiteral(coutEEnum, Cout.ELEVE_LITERAL);

		initEEnum(natureEEnum, Nature.class, "Nature");
		addEEnumLiteral(natureEEnum, Nature.LEGUME_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.VIANDE_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.POISSON_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.CONDIMENT_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.FRUIT_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.FECULENT_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.OEUF_LITERAL);
		addEEnumLiteral(natureEEnum, Nature.MATIERE_GRASSE_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations() {
		String source = "diagraph";		
		addAnnotation
		  (livreRecettesEClass, 
		   source, 
		   new String[] {
			 "pov", ""
		   });		
		addAnnotation
		  (recetteEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "style=n1", "",
			 "nav:ingredient", null,
			 "label=nom", "",
			 "section=entities", null,
			 "lnk=composes", "",
			 "kref=vins", "",
			 "style.kref.vins=p1", "",
			 "ref=origineRegionale", null
		   });		
		addAnnotation
		  (ingredientEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=name", "",
			 "style=n5", ""
		   });		
		addAnnotation
		  (vinEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=nom", null
		   });		
		addAnnotation
		  (composeEClass, 
		   source, 
		   new String[] {
			 "link", "",
			 "label=quantite", "",
			 "style=e1", ""
		   });		
		addAnnotation
		  (localisationEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=name", "",
			 "style=n3", ""
		   });		
		addAnnotation
		  (bouteilleEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=nom", null
		   });
	}

} //Tp2PackageImpl
