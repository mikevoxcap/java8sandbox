package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.serviceproviderframework;

public class DefaultService implements Service {

   @Override
   public double returnANumber() {
      return Math.random();
   }

}
