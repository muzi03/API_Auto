package mavenDemo.Chapter;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest {
  @Test
  public void test1() {
	  System.out.println("test1用例");
  }
  @Test
  public void test2() {
	  System.out.println("test2用例");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod执行用例时先执行的方法！");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod执行完用例后运行的方法！");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass这是在类运行前执行");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass这是在类运行之后执行");
  }
}
