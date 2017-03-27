package com.michaelhoffmaninc.javasandbox.effectivejava.createanddestroyobjects.builder;

public class NutritionFacts {

   private final int servingSize;
   private final int servings;
   private final int calories;
   private final int fat;
   private final int carbohydrate;
   private final int sodium;

   public static class Builder {
      // Required parameters
      private final int servingSize;
      private final int servings;

      // Optional parameters
      private int calories = 0;
      private int fat = 0;
      private int carbohydrate = 0;
      private int sodium = 0;

      public Builder(int servingSize, int servings) {
         this.servingSize = servingSize;
         this.servings = servings;
      }

      public Builder calories(int val) {
         calories = val;
         return this;
      }

      public Builder fat(int val) {
         fat = val;
         return this;
      }

      public Builder carbohydrate(int val) {
         carbohydrate = val;
         return this;
      }

      public Builder sodium(int val) {
         sodium = val;
         return this;
      }

      public NutritionFacts build() {
         return new NutritionFacts(this);
      }
   }

   private NutritionFacts(Builder builder) {
      servingSize = builder.servingSize;
      servings = builder.servings;
      calories = builder.calories;
      fat = builder.fat;
      carbohydrate = builder.carbohydrate;
      sodium = builder.sodium;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      StringBuilder builder2 = new StringBuilder();
      builder2.append("NutritionFacts [servingSize=").append(servingSize)
            .append(", servings=").append(servings).append(", calories=").append(calories)
            .append(", fat=").append(fat).append(", carbohydrate=").append(carbohydrate)
            .append(", sodium=").append(sodium).append("]");
      return builder2.toString();
   }

}
