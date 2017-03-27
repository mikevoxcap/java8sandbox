package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.serviceproviderframework;

import org.junit.Test;

public class ServiceProviderFrameworkTest {

   @Test
   public void testServiceProviderFramework_defaultProviderAndService() {
      Services.registerDefaultProvider(new DefaultProvider());
      Service service = Services.newInstance();
      double result = service.returnANumber();
      System.err.println("The result is: " + result);
   }

}
