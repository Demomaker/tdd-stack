package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {
  int AN_ELEMENT = 5;
  int FIRST_PUSHED = 10;
  int SECOND_PUSHED = 14;

  Stack pile = new Stack();

  @Test
  public void isInitiallyEmpty() {
    assertTrue(pile.isEmpty());
  }

  @Test
  public void whenPush_thenAddTheElement() {
    pile.push(AN_ELEMENT);
    assertFalse(pile.isEmpty());
  }

  @Test
  public void givenOneElement_whenPopping_thenElementIsRemoved() {
    pile.push(AN_ELEMENT);
    pile.pop();
    assertTrue(pile.isEmpty());
  }

  @Test
  public void givenSomeElements_whenPopping_thenReturnThemInReverseOrder() {
    pile.push(FIRST_PUSHED);
    pile.push(SECOND_PUSHED);

    int firstPopped = pile.pop();
    int secondPopped = pile.pop();

    assertEquals(SECOND_PUSHED, firstPopped);
    assertEquals(FIRST_PUSHED, secondPopped);
  }

}
