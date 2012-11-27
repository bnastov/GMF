/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp2.Bouteille;
import tp2.Compose;
import tp2.Cout;
import tp2.Localisation;
import tp2.Recette;
import tp2.Tp2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp2.impl.RecetteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tp2.impl.RecetteImpl#getCout <em>Cout</em>}</li>
 *   <li>{@link tp2.impl.RecetteImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link tp2.impl.RecetteImpl#getOrigineRegionale <em>Origine Regionale</em>}</li>
 *   <li>{@link tp2.impl.RecetteImpl#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecetteImpl extends EObjectImpl implements Recette {
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
	 * The default value of the '{@link #getCout() <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCout()
	 * @generated
	 * @ordered
	 */
	protected static final Cout COUT_EDEFAULT = Cout.FAIBLE_LITERAL;

	/**
	 * The cached value of the '{@link #getCout() <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCout()
	 * @generated
	 * @ordered
	 */
	protected Cout cout = COUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected EList composes;

	/**
	 * The cached value of the '{@link #getOrigineRegionale() <em>Origine Regionale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineRegionale()
	 * @generated
	 * @ordered
	 */
	protected Localisation origineRegionale;

	/**
	 * The cached value of the '{@link #getVins() <em>Vins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVins()
	 * @generated
	 * @ordered
	 */
	protected EList vins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp2Package.Literals.RECETTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.RECETTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cout getCout() {
		return cout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCout(Cout newCout) {
		Cout oldCout = cout;
		cout = newCout == null ? COUT_EDEFAULT : newCout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.RECETTE__COUT, oldCout, cout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComposes() {
		if (composes == null) {
			composes = new EObjectContainmentEList(Compose.class, this, Tp2Package.RECETTE__COMPOSES);
		}
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getOrigineRegionale() {
		if (origineRegionale != null && origineRegionale.eIsProxy()) {
			InternalEObject oldOrigineRegionale = (InternalEObject)origineRegionale;
			origineRegionale = (Localisation)eResolveProxy(oldOrigineRegionale);
			if (origineRegionale != oldOrigineRegionale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp2Package.RECETTE__ORIGINE_REGIONALE, oldOrigineRegionale, origineRegionale));
			}
		}
		return origineRegionale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation basicGetOrigineRegionale() {
		return origineRegionale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineRegionale(Localisation newOrigineRegionale) {
		Localisation oldOrigineRegionale = origineRegionale;
		origineRegionale = newOrigineRegionale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp2Package.RECETTE__ORIGINE_REGIONALE, oldOrigineRegionale, origineRegionale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVins() {
		if (vins == null) {
			vins = new EObjectContainmentEList(Bouteille.class, this, Tp2Package.RECETTE__VINS);
		}
		return vins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp2Package.RECETTE__COMPOSES:
				return ((InternalEList)getComposes()).basicRemove(otherEnd, msgs);
			case Tp2Package.RECETTE__VINS:
				return ((InternalEList)getVins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp2Package.RECETTE__NOM:
				return getNom();
			case Tp2Package.RECETTE__COUT:
				return getCout();
			case Tp2Package.RECETTE__COMPOSES:
				return getComposes();
			case Tp2Package.RECETTE__ORIGINE_REGIONALE:
				if (resolve) return getOrigineRegionale();
				return basicGetOrigineRegionale();
			case Tp2Package.RECETTE__VINS:
				return getVins();
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
			case Tp2Package.RECETTE__NOM:
				setNom((String)newValue);
				return;
			case Tp2Package.RECETTE__COUT:
				setCout((Cout)newValue);
				return;
			case Tp2Package.RECETTE__COMPOSES:
				getComposes().clear();
				getComposes().addAll((Collection)newValue);
				return;
			case Tp2Package.RECETTE__ORIGINE_REGIONALE:
				setOrigineRegionale((Localisation)newValue);
				return;
			case Tp2Package.RECETTE__VINS:
				getVins().clear();
				getVins().addAll((Collection)newValue);
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
			case Tp2Package.RECETTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Tp2Package.RECETTE__COUT:
				setCout(COUT_EDEFAULT);
				return;
			case Tp2Package.RECETTE__COMPOSES:
				getComposes().clear();
				return;
			case Tp2Package.RECETTE__ORIGINE_REGIONALE:
				setOrigineRegionale((Localisation)null);
				return;
			case Tp2Package.RECETTE__VINS:
				getVins().clear();
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
			case Tp2Package.RECETTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Tp2Package.RECETTE__COUT:
				return cout != COUT_EDEFAULT;
			case Tp2Package.RECETTE__COMPOSES:
				return composes != null && !composes.isEmpty();
			case Tp2Package.RECETTE__ORIGINE_REGIONALE:
				return origineRegionale != null;
			case Tp2Package.RECETTE__VINS:
				return vins != null && !vins.isEmpty();
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
		result.append(", cout: ");
		result.append(cout);
		result.append(')');
		return result.toString();
	}

} //RecetteImpl
