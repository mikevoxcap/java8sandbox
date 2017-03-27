package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.serviceproviderframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

   private Services() {
   }

   private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
   public static final String DEFAULT_PROVIDER_NAME = "<def>";

   public static void registerDefaultProvider(Provider p) {
      registerProvider(DEFAULT_PROVIDER_NAME, p);
   }

   public static void registerProvider(String name, Provider p) {
      providers.put(name, p);
   }

   public static Service newInstance() {
      return newInstance(DEFAULT_PROVIDER_NAME);
   }

   public static Service newInstance(String name) {
      Provider p = providers.get(name);
      if (p == null) {
         throw new IllegalArgumentException(
               "No provider registered with the name " + name);
      }
      return p.newService();
   }
}
