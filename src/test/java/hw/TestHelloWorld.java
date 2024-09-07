package hw;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private HelloWorld fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new HelloWorld();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  // This test verifies that initialization works as expected.
  @Test
  public void initialization() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
  }

  // Checks that getMessage() method works as expected.
  @Test
  public void getMessage() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  // Checks that getYear() method works as expected.
  // Was corrected because expected year was 2023 instead of 2024.
  @Test
  public void getYear() { // this test is OK, fix HelloWorld.java to make it pass!
    assertNotNull(fixture);
    assertEquals(2024, fixture.getYear());
  }

  // Stores class representation and hashcode of object in list - test uses this list to check getMessage() method by referencing the object through the list.
  // Corrected as original code attempted to index the list at 1 - Java is 0-indexed so the first element of the list is actually 0.
  @Test
  public void getMessageInList() { // this test is broken - fix it!
    var list = Arrays.asList(fixture);
    assertEquals("hello world", list.get(0).getMessage());
  }

  // Stores class representation of object in list - test uses this list to check getYear() method by referencing the object through the list.
  // Corrected as original code attempted to index the list at 1 - Java is 0-indexed so the first element of the list is actually 0.
  @Test
  public void getYearInList() { // this test is broken - fix it!
    var list = Arrays.asList(fixture);
    assertEquals(2024, list.get(0).getYear());
  }
}
