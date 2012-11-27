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
 * A representation of the literals of the enumeration '<em><b>Cout</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tp2.Tp2Package#getCout()
 * @model
 * @generated
 */
public final class Cout extends AbstractEnumerator {
	/**
	 * The '<em><b>Faible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Faible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAIBLE_LITERAL
	 * @model name="faible"
	 * @generated
	 * @ordered
	 */
	public static final int FAIBLE = 0;

	/**
	 * The '<em><b>Moyen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moyen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOYEN_LITERAL
	 * @model name="moyen"
	 * @generated
	 * @ordered
	 */
	public static final int MOYEN = 1;

	/**
	 * The '<em><b>Eleve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eleve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEVE_LITERAL
	 * @model name="eleve"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVE = 2;

	/**
	 * The '<em><b>Faible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIBLE
	 * @generated
	 * @ordered
	 */
	public static final Cout FAIBLE_LITERAL = new Cout(FAIBLE, "faible", "faible");

	/**
	 * The '<em><b>Moyen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOYEN
	 * @generated
	 * @ordered
	 */
	public static final Cout MOYEN_LITERAL = new Cout(MOYEN, "moyen", "moyen");

	/**
	 * The '<em><b>Eleve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVE
	 * @generated
	 * @ordered
	 */
	public static final Cout ELEVE_LITERAL = new Cout(ELEVE, "eleve", "eleve");

	/**
	 * An array of all the '<em><b>Cout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cout[] VALUES_ARRAY =
		new Cout[] {
			FAIBLE_LITERAL,
			MOYEN_LITERAL,
			ELEVE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cout result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cout result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout get(int value) {
		switch (value) {
			case FAIBLE: return FAIBLE_LITERAL;
			case MOYEN: return MOYEN_LITERAL;
			case ELEVE: return ELEVE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Cout(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Cout
