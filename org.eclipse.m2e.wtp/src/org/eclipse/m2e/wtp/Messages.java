/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Red Hat, Inc. - Initial implementation.
 ************************************************************************************/
package org.eclipse.m2e.wtp;

import org.eclipse.osgi.util.NLS;

/**
 * m2E-wtp i18n messages.
 * 
 * @provisional This class has been added as part of a work in progress. 
 * It is not guaranteed to work or remain the same in future releases. 
 * For more information contact <a href="mailto:m2e-wtp-dev@eclipse.org">m2e-wtp-dev@eclipse.org</a>.
 * 
 * @author Fred Bricon
 */
public class Messages extends NLS {
	
  public static final String BUNDLE_NAME = "org.eclipse.m2e.wtp.messages";
  
  public static String markers_inclusion_patterns_problem;
  
  public static String markers_unsupported_dependencies_warning;

  public static String markers_mavenarchiver_output_settings_ignored_warning;
	
  static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
