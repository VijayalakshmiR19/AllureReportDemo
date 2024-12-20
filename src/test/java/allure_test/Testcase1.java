package allure_test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {
  @Test
  public void testmethod1() {
	  Assert.assertTrue(false);
	  System.out.println("testmethod1 is not working as expected");
  }
}
