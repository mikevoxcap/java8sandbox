package com.michaelhoffmaninc.javasandbox.lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * Tests out Lambda expressions
 * 
 * @author Michael Hoffman
 *
 */
public class LambdaAssertions {

   @Test
   public void testFileFilterExample() throws Exception {

      // Typically, we use anonymous classes to implement logic that can now be
      // replaced with lambda expressions.
      FileFilter oldWay = new FileFilter() {
         @Override
         public boolean accept(File file) {
            // TODO Auto-generated method stub
            return file.getName().endsWith(".java");
         }
      };

      FileFilter newWay = (File file) -> file.getName().endsWith(".java");
      File dir = new File(
            "C:/dev/projects/javasandbox/src/test/java/com/michaelhoffmaninc/javasandbox/lambda");
      File[] filesOldWay = dir.listFiles(oldWay);
      File[] filesNewWay = dir.listFiles(newWay);
      File[] filesNewWayCompact = dir
            .listFiles((File file) -> file.getName().endsWith(".java"));

      assertTrue(filesOldWay.length == 1);
      assertTrue(filesNewWay.length == 1);
      assertTrue(filesNewWayCompact.length == 1);
   }

   @Test
   public void testCollectionComparator() throws Exception {
      Comparator<String> oldComparator = new Comparator<String>() {

         @Override
         public int compare(String s1, String s2) {
            return s1.compareTo(s2);
         }

      };

      List<String> oldElements = Arrays.asList("pig", "apple", "bear", "dog", "cat",
            "otter");
      Collections.sort(oldElements, oldComparator);

      assertEquals("apple", oldElements.get(0));
      assertEquals("bear", oldElements.get(1));
      assertEquals("cat", oldElements.get(2));
      assertEquals("dog", oldElements.get(3));
      assertEquals("otter", oldElements.get(4));
      assertEquals("pig", oldElements.get(5));

      List<String> newElements = Arrays.asList("pig", "apple", "bear", "dog", "cat",
            "otter");
      Collections.sort(newElements, (s1, s2) -> s1.compareTo(s2));

      assertEquals("apple", newElements.get(0));
      assertEquals("bear", newElements.get(1));
      assertEquals("cat", newElements.get(2));
      assertEquals("dog", newElements.get(3));
      assertEquals("otter", newElements.get(4));
      assertEquals("pig", newElements.get(5));
   }

   @Test
   public void testMethodReference() throws Exception {
      Person[] people = { new Person(15), new Person(10), new Person(83),
            new Person(44) };
      Arrays.sort(people, Person::compareByAge);
      assertEquals(10, people[0].getAge());
      assertEquals(15, people[1].getAge());
      assertEquals(44, people[2].getAge());
      assertEquals(83, people[3].getAge());
   }

   @Test
   public void testCollectionLambdas() throws Exception {
      List<String> elems = Arrays.asList("a", "b", "c");
      elems.forEach(System.out::println);
   }

}
