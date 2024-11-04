/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 02 18:04:59 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.LinkedList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedList_ESTest extends LinkedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      linkedList0.add(".k");
      boolean boolean0 = linkedList0.remove("YrQSaQv");
      assertEquals(1, linkedList0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      int int0 = linkedList0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add((Object) null);
      // Undeclared exception!
      try { 
        linkedList0.remove(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        linkedList0.contains(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.example.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      boolean boolean0 = linkedList0.isEmpty();
      assertEquals(1, linkedList0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("k{a;_ePW)fvs(");
      boolean boolean0 = linkedList0.contains("k{a;_ePW)fvs(");
      assertEquals(1, linkedList0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      boolean boolean0 = linkedList0.contains("k{a;_ePW)fvs(");
      assertEquals(1, linkedList0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      linkedList0.add("k{a;_ePW)fvs(");
      boolean boolean0 = linkedList0.remove("k{a;_ePW)fvs(");
      assertEquals(1, linkedList0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      linkedList0.add(".k");
      boolean boolean0 = linkedList0.remove("k{a;_ePW)fvs(");
      assertEquals(2, linkedList0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.remove("YrQSaQv");
      assertEquals(0, linkedList0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("YrQSaQv");
      linkedList0.add(".k");
      linkedList0.add("k{a;_ePW)fvs(");
      assertEquals(3, linkedList0.getSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      int int0 = linkedList0.getSize();
      assertEquals(0, int0);
  }
}