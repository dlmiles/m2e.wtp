/*************************************************************************************
 * Copyright (c) 2011-2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Snjezana Peco (Red Hat, Inc.) - initial API and implementation
 ************************************************************************************/
package org.eclipse.m2e.wtp.jaxrs.internal;

import org.eclipse.osgi.util.NLS;

/**
 * I18N messages
 * 
 * @author snjeza
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.m2e.wtp.jaxrs.internal.messages"; //$NON-NLS-1$
	public static String JaxrsProjectConfigurator_facet_cannot_be_installed;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
