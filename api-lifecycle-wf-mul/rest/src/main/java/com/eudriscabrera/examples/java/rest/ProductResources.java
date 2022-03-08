
package com.eudriscabrera.examples.java.rest;

import com.eudriscabrera.examples.java.core.InyectorModular;
import com.eudriscabrera.examples.java.core.ServicioRest;

/**
 * @author eudriscabrera
 *
 */
public class ProductResources implements InyectorModular {

	@Override
	public Class<? extends ServicioRest>[] getClasesServiciosRest() {
		
		return new Class[]{WSProduct.class};
	}

}
