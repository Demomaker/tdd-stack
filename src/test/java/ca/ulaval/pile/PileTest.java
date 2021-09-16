package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PileTest {

  private static final int AN_ELEMENT = 32;
  private Pile stack;

  @Before
  public void givenAnEmptyStack() {
    stack = new Pile();
  }

  @Test
  public void shouldBeEmpty() {
    assertTrue(stack.isEmpty());
  }

  @Test
  public void whenPush_shouldAcceptTheElement() {
    stack.push(AN_ELEMENT);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void givenAnElementPushed_whenPopping_shouldRemoveTheElement() {
    stack.push(AN_ELEMENT);
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void givenAnElementPushed_whenPopping_shouldReturnTheElement() {
    int THE_ELEMENT = 42;
    stack.push(THE_ELEMENT);

    int elementReturned = stack.pop();

    assertEquals(THE_ELEMENT, elementReturned);
  }

  @Test
  public void givenMultipleElements_whenPopping_shouldReturnTheLastElement() {
    int THE_ELEMENT = 42;
    stack.push(AN_ELEMENT);
    stack.push(THE_ELEMENT);

    int theElementReturned = stack.pop();

    assertEquals(THE_ELEMENT, theElementReturned);
  }

  @Test
  public void givenTwoElements_whenPoppingTwice_shouldReturnFirstElement() {
    int THE_ELEMENT = 42;
    stack.push(THE_ELEMENT);
    stack.push(AN_ELEMENT);

    stack.pop();
    int theElementReturned = stack.pop();

    assertEquals(THE_ELEMENT, theElementReturned);
  }
}
