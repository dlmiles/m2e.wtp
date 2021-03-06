/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Red Hat, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2e.wtp.internal.conversion;

import org.eclipse.core.resources.IProject;
import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetConstants;
import org.eclipse.m2e.wtp.JEEPackaging;

/**
 * Enables Maven project conversion on Faceted EJB projects, 
 * i.e having the {@link IJ2EEFacetConstants.EJB_FACET} Facet. 
 *
 * @author Fred Bricon
 * @since 0.17.0
 */
public class EjbProjectConversionEnabler extends AbstractProjectFacetConversionEnabler {

  public EjbProjectConversionEnabler() {
    super(IJ2EEFacetConstants.EJB_FACET);
  }
  
  /**
   * Returns the <code>ejb</code> packaging
   */
  public String[] getPackagingTypes(IProject project) {
    return new String[]{JEEPackaging.EJB.getName()};
  }
}
