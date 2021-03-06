/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inserted Concepts Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.InsertedConceptsEvent#getNconcepts <em>Nconcepts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getInsertedConceptsEvent()
 * @model
 * @generated
 */
public interface InsertedConceptsEvent extends SpeechInputEvent {
	/**
	 * Returns the value of the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nconcepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nconcepts</em>' attribute.
	 * @see #setNconcepts(int)
	 * @see org.mmi.events.EventsPackage#getInsertedConceptsEvent_Nconcepts()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNconcepts();

	/**
	 * Sets the value of the '{@link org.mmi.events.InsertedConceptsEvent#getNconcepts <em>Nconcepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nconcepts</em>' attribute.
	 * @see #getNconcepts()
	 * @generated
	 */
	void setNconcepts(int value);

} // InsertedConceptsEvent
