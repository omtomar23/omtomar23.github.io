/**
 */
package com.self.om.tailerManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Garment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.self.om.tailerManagement.TailerManagementPackage#getGarmentType()
 * @model
 * @generated
 */
public enum GarmentType implements Enumerator {
	/**
	 * The '<em><b>SHIRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIRT_VALUE
	 * @generated
	 * @ordered
	 */
	SHIRT(0, "SHIRT", "SHIRT"),

	/**
	 * The '<em><b>SUIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUIT_VALUE
	 * @generated
	 * @ordered
	 */
	SUIT(1, "SUIT", "SUIT"),

	/**
	 * The '<em><b>KURTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KURTI_VALUE
	 * @generated
	 * @ordered
	 */
	KURTI(2, "KURTI", "KURTI"),

	/**
	 * The '<em><b>BLOUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BLOUSE(3, "BLOUSE", "BLOUSE"),

	/**
	 * The '<em><b>COAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAST_VALUE
	 * @generated
	 * @ordered
	 */
	COAST(4, "COAST", "COAST"),

	/**
	 * The '<em><b>PLAZZO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAZZO_VALUE
	 * @generated
	 * @ordered
	 */
	PLAZZO(5, "PLAZZO", "PLAZZO"),

	/**
	 * The '<em><b>Pant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PANT_VALUE
	 * @generated
	 * @ordered
	 */
	PANT(6, "Pant", "Pant");

	/**
	 * The '<em><b>SHIRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHIRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHIRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHIRT_VALUE = 0;

	/**
	 * The '<em><b>SUIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUIT_VALUE = 1;

	/**
	 * The '<em><b>KURTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KURTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KURTI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KURTI_VALUE = 2;

	/**
	 * The '<em><b>BLOUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOUSE_VALUE = 3;

	/**
	 * The '<em><b>COAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COAST_VALUE = 4;

	/**
	 * The '<em><b>PLAZZO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAZZO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAZZO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAZZO_VALUE = 5;

	/**
	 * The '<em><b>Pant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PANT
	 * @model name="Pant"
	 * @generated
	 * @ordered
	 */
	public static final int PANT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Garment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GarmentType[] VALUES_ARRAY =
		new GarmentType[] {
			SHIRT,
			SUIT,
			KURTI,
			BLOUSE,
			COAST,
			PLAZZO,
			PANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Garment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GarmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Garment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GarmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GarmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Garment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GarmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GarmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Garment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GarmentType get(int value) {
		switch (value) {
			case SHIRT_VALUE: return SHIRT;
			case SUIT_VALUE: return SUIT;
			case KURTI_VALUE: return KURTI;
			case BLOUSE_VALUE: return BLOUSE;
			case COAST_VALUE: return COAST;
			case PLAZZO_VALUE: return PLAZZO;
			case PANT_VALUE: return PANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GarmentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GarmentType
