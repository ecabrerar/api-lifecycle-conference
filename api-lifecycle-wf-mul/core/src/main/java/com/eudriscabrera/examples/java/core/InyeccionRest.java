package com.eudriscabrera.examples.java.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.logging.Logger;




/**
 * @author eudriscabrera
 *
 */
public final class InyeccionRest {
	private static final Logger LOGGER = Logger.getLogger(InyeccionRest.class.getName());


	public Set<Class<?>> getClasses() {

		LOGGER.info("Cargando clases de servicios rest.");


		Set<Class<?>> classes = new HashSet<Class<?>>();


		ServiceLoader<InyectorModular>  sl = ServiceLoader.load(InyectorModular.class);
		for (InyectorModular i : sl){

			classes.addAll(Arrays.asList(i.getClasesServiciosRest()));
		}
		return classes;
	}
}
