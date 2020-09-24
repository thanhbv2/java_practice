package com.spring.annotation;

import com.spring.annotation.TestInfo.Priority;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@TestInfo(
    priority = Priority.HIGH,
    tags = {"test", "high"},
    createdBy = "VN"
)
public class OrderTest {

  @Test
  public void testA() {
    if (true) {
      throw new RuntimeException("This test always failed");
    }
  }

  @Test(enabled = false)
  void testB() {
    if (false) {
      throw new RuntimeException("This test always passed");
    }
  }

  @Test(enabled = true)
  void testC() {
    if (10 > 1) {
      // do nothing, this test always passed.
    }
  }

  public static void main(String[] args) {
    System.out.println("======>> Begin testing");

    int passed = 0, failed = 0, count = 0, ignore = 0;

    Class<OrderTest> obj = OrderTest.class;

    if (obj.isAnnotationPresent(TestInfo.class)) {
      Annotation annotation = obj.getAnnotation(TestInfo.class);
      TestInfo testInfo = (TestInfo) annotation;

      System.out.println(testInfo.priority());
      System.out.println((testInfo.createdBy()));
      int tagLength = testInfo.tags().length;
      for (String tag : testInfo.tags()) {
        if (tagLength > 1) {
          System.out.println(tag + ",");
        } else {
          System.out.println(tag);
        }
        tagLength--;
      }

      Method[] methods = obj.getDeclaredMethods();

      for (Method method : methods) {
        Annotation test = method.getAnnotation(Test.class);

        if (((Test) test).enabled()) {
          try {
            method.invoke(obj.newInstance());
            System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
            passed++;

          } catch (Throwable ex) {
            System.out
                .printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
            failed++;
          }
        } else {
          System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
          ignore++;
        }
      }

    }
    System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);
  }
}
