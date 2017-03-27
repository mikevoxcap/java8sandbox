package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.builder;

import org.junit.Test;

public class NutritionFactsTest {

   @Test
   public void testNutritionFactsBuilder() {
      NutritionFacts coke = new NutritionFacts.Builder(240, 8).calories(100).sodium(35)
            .carbohydrate(27).build();
      System.err.println(coke);
   }

}
