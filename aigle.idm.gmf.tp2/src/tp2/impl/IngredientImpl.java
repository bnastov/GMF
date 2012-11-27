/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import tp2.Ingredient;
import tp2.Nature;
import tp2.Tp2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp2.impl.IngredientImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp2.impl.IngredientImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link tp2.impl.IngredientImpl#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IngredientImpl extends EObjectImpl implements Ingredient {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final Nature NATURE_EDEFAULT = Nature.LEGUME_LITERAL;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected Nature nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected double prix = PRIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp2Package.Literals.INGREDIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.INGREDIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(Nature newNature) {
		Nature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.INGREDIENT__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrix(double newPrix) {
		double oldPrix = prix;
		prix = newPrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.INGREDIENT__PRIX, oldPrix, prix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp2Package.INGREDIENT__NAME:
				return getName();
			case Tp2Package.INGREDIENT__NATURE:
				return getNature();
			case Tp2Package.INGREDIENT__PRIX:
				return new Double(getPrix());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tp2Package.INGREDIENT__NAME:
				setName((String)newValue);
				return;
			case Tp2Package.INGREDIENT__NATURE:
				setNature((Nature)newValue);
				return;
			case Tp2Package.INGREDIENT__PRIX:
				setPrix(((Double)newValue).doubleValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tp2Package.INGREDIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp2Package.INGREDIENT__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case Tp2Package.INGREDIENT__PRIX:
				setPrix(PRIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tp2Package.INGREDIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp2Package.INGREDIENT__NATURE:
				return nature != NATURE_EDEFAULT;
			case Tp2Package.INGREDIENT__PRIX:
				return prix != PRIX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nature: ");
		result.append(nature);
		result.append(", prix: ");
		result.append(prix);
		result.append(')');
		return result.toString();
	}

} //IngredientImpl
