package com.michaelhoffmaninc.javasandbox.lambda;

public class Person {
   int age;

   public Person(int age) {
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public static int compareByAge(Person a, Person b) {
      return Integer.compare(a.getAge(), b.getAge());
   }

}
