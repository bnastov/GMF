/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tp2.Tp2Package#getNature()
 * @model
 * @generated
 */
public final class Nature extends AbstractEnumerator {
	/**
	 * The '<em><b>Legume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Legume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGUME_LITERAL
	 * @model name="legume"
	 * @generated
	 * @ordered
	 */
	public static final int LEGUME = 0;

	/**
	 * The '<em><b>Viande</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Viande</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIANDE_LITERAL
	 * @model name="viande"
	 * @generated
	 * @ordered
	 */
	public static final int VIANDE = 1;

	/**
	 * The '<em><b>Poisson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poisson</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISSON_LITERAL
	 * @model name="poisson"
	 * @generated
	 * @ordered
	 */
	public static final int POISSON = 2;

	/**
	 * The '<em><b>Condiment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Condiment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDIMENT_LITERAL
	 * @model name="condiment"
	 * @generated
	 * @ordered
	 */
	public static final int CONDIMENT = 3;

	/**
	 * The '<em><b>Fruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fruit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRUIT_LITERAL
	 * @model name="fruit"
	 * @generated
	 * @ordered
	 */
	public static final int FRUIT = 4;

	/**
	 * The '<em><b>Feculent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Feculent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECULENT_LITERAL
	 * @model name="feculent"
	 * @generated
	 * @ordered
	 */
	public static final int FECULENT = 5;

	/**
	 * The '<em><b>Oeuf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oeuf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OEUF_LITERAL
	 * @model name="oeuf"
	 * @generated
	 * @ordered
	 */
	public static final int OEUF = 6;

	/**
	 * The '<em><b>Matiere Grasse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Matiere Grasse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATIERE_GRASSE_LITERAL
	 * @model name="matiereGrasse"
	 * @generated
	 * @ordered
	 */
	public static final int MATIERE_GRASSE = 7;

	/**
	 * The '<em><b>Legume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGUME
	 * @generated
	 * @ordered
	 */
	public static final Nature LEGUME_LITERAL = new Nature(LEGUME, "legume", "legume");

	/**
	 * The '<em><b>Viande</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIANDE
	 * @generated
	 * @ordered
	 */
	public static final Nature VIANDE_LITERAL = new Nature(VIANDE, "viande", "viande");

	/**
	 * The '<em><b>Poisson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSON
	 * @generated
	 * @ordered
	 */
	public static final Nature POISSON_LITERAL = new Nature(POISSON, "poisson", "poisson");

	/**
	 * The '<em><b>Condiment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDIMENT
	 * @generated
	 * @ordered
	 */
	public static final Nature CONDIMENT_LITERAL = new Nature(CONDIMENT, "condiment", "condiment");

	/**
	 * The '<em><b>Fruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT
	 * @generated
	 * @ordered
	 */
	public static final Nature FRUIT_LITERAL = new Nature(FRUIT, "fruit", "fruit");

	/**
	 * The '<em><b>Feculent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECULENT
	 * @generated
	 * @ordered
	 */
	public static final Nature FECULENT_LITERAL = new Nature(FECULENT, "feculent", "feculent");

	/**
	 * The '<em><b>Oeuf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OEUF
	 * @generated
	 * @ordered
	 */
	public static final Nature OEUF_LITERAL = new Nature(OEUF, "oeuf", "oeuf");

	/**
	 * The '<em><b>Matiere Grasse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATIERE_GRASSE
	 * @generated
	 * @ordered
	 */
	public static final Nature MATIERE_GRASSE_LITERAL = new Nature(MATIERE_GRASSE, "matiereGrasse", "matiereGrasse");

	/**
	 * An array of all the '<em><b>Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Nature[] VALUES_ARRAY =
		new Nature[] {
			LEGUME_LITERAL,
			VIANDE_LITERAL,
			POISSON_LITERAL,
			CONDIMENT_LITERAL,
			FRUIT_LITERAL,
			FECULENT_LITERAL,
			OEUF_LITERAL,
			MATIERE_GRASSE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature get(int value) {
		switch (value) {
			case LEGUME: return LEGUME_LITERAL;
			case VIANDE: return VIANDE_LITERAL;
			case POISSON: return POISSON_LITERAL;
			case CONDIMENT: return CONDIMENT_LITERAL;
			case FRUIT: return FRUIT_LITERAL;
			case FECULENT: return FECULENT_LITERAL;
			case OEUF: return OEUF_LITERAL;
			case MATIERE_GRASSE: return MATIERE_GRASSE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Nature(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Nature
