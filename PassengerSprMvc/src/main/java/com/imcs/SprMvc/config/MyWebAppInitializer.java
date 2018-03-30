package com.imcs.SprMvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer
      extends AbstractAnnotationConfigDispatcherServletInitializer {


   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }

@Override
protected Class<?>[] getRootConfigClasses() {
	// TODO Auto-generated method stub
	return null;
}
}
