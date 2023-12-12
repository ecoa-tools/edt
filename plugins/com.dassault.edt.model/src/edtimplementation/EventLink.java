/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Event
 * Link</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EventLink extends OperationLink {

	/**
	 * 
	 * @param eventLink
	 * @return
	 */
	public static EventLinkSender getEventLinkSender(EventLink eventLink) {

		try {
			Method declaredMethod = eventLink.getClass().getDeclaredMethod("getSender");
			return (EventLinkSender) declaredMethod.invoke(eventLink);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			System.out.println("No getSender() function for " + eventLink.eClass().getName());
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param eventLink
	 * @return
	 */
	public static EventLinkReceiver getEventLinkReceiver(EventLink eventLink) {

		try {
			Method declaredMethod = eventLink.getClass().getDeclaredMethod("getReceiver");
			return (EventLinkReceiver) declaredMethod.invoke(eventLink);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			System.out.println("No getReceiver() function for " + eventLink.eClass().getName());
			e.printStackTrace();
		}
		return null;
	}

} // EventLink
