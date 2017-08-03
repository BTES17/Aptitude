package Testcase;

import org.testng.annotations.Test;

import Actoins.LoginActions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  LoginActions.ExceuteLoginScenario();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
