package com.michaelhoffmaninc.javasandbox.generics;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

/**
 * Acts as a cookbook or FAQ asserting what is possible and not possible for
 * Generics
 * 
 * @author Michael Hoffman, Michael Hoffman Tech
 *
 */
public class GenericsAssertions {

   /**
    * This is perfectly legal to do.
    */
   @Test
   public void test_CanIAddAStringToAGenericObjectList() {
      List<Object> strings = new ArrayList<Object>();
      strings.add(new String("Test"));
      String myTest = (String) strings.get(0);
      assertEquals("Test", myTest);
      Object myTestObj = strings.get(0);
      assertTrue(myTestObj instanceof String);
   }

   /**
    * This is not possible as it will result in a compiler error
    */
   @Test
   public void test_CanICastAGenericList() {
      // List<String> strings = new ArrayList<String>();
      // The line below will result in a compile error.
      // List<Object> objs = strings;
      assertTrue(true);
   }

}
