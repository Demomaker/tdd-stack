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
    stack.push(AN_ELEMENT);
    int elementReturned = stack.pop();
    assertEquals(AN_ELEMENT, elementReturned);
  }
}
