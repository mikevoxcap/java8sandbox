package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.serviceproviderframework;

public class DefaultProvider implements Provider {

   @Override
   public Service newService() {
      return new DefaultService();
   }

}
