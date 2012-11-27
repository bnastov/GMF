/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import tp2.Bouteille;
import tp2.Tp2Package;
import tp2.Vin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bouteille</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp2.impl.BouteilleImpl#get_vin <em>vin</em>}</li>
 *   <li>{@link tp2.impl.BouteilleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tp2.impl.BouteilleImpl#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BouteilleImpl extends EObjectImpl implements Bouteille {
	/**
	 * The cached value of the '{@link #get_vin() <em>vin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_vin()
	 * @generated
	 * @ordered
	 */
	protected Vin _vin;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	protected BouteilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp2Package.Literals.BOUTEILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vin get_vin() {
		if (_vin != null && _vin.eIsProxy()) {
			InternalEObject old_vin = (InternalEObject)_vin;
			_vin = (Vin)eResolveProxy(old_vin);
			if (_vin != old_vin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp2Package.BOUTEILLE__VIN, old_vin, _vin));
			}
		}
		return _vin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vin basicGet_vin() {
		return _vin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_vin(Vin new_vin) {
		Vin old_vin = _vin;
		_vin = new_vin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.BOUTEILLE__VIN, old_vin, _vin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.BOUTEILLE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.BOUTEILLE__PRIX, oldPrix, prix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp2Package.BOUTEILLE__VIN:
				if (resolve) return get_vin();
				return basicGet_vin();
			case Tp2Package.BOUTEILLE__NOM:
				return getNom();
			case Tp2Package.BOUTEILLE__PRIX:
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
			case Tp2Package.BOUTEILLE__VIN:
				set_vin((Vin)newValue);
				return;
			case Tp2Package.BOUTEILLE__NOM:
				setNom((String)newValue);
				return;
			case Tp2Package.BOUTEILLE__PRIX:
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
			case Tp2Package.BOUTEILLE__VIN:
				set_vin((Vin)null);
				return;
			case Tp2Package.BOUTEILLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Tp2Package.BOUTEILLE__PRIX:
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
			case Tp2Package.BOUTEILLE__VIN:
				return _vin != null;
			case Tp2Package.BOUTEILLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Tp2Package.BOUTEILLE__PRIX:
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prix: ");
		result.append(prix);
		result.append(')');
		return result.toString();
	}

} //BouteilleImpl
