package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {
  int AN_ELEMENT = 5;

  @Test
  public void isInitiallyEmpty() {
    Stack pile = new Stack();
    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void whenPush_thenAddTheElement() {
    Stack pile = new Stack();
    pile.push(AN_ELEMENT);
    assertFalse(pile.isEmpty());
  }


  @Test
  public void givenOneElement_whenPopping_thenElementIsRemoved() {
    Stack pile = new Stack();
    pile.push(AN_ELEMENT);

    pile.pop();

    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void givenOneElement_whenPopping_thenReturnTheElement() {
    int THE_ELEMENT = 5;
    Stack pile = new Stack();
    pile.push(THE_ELEMENT);
    
    int elementReturned = pile.pop();
    
    assertEquals(THE_ELEMENT, elementReturned);
  }

  @Test
  public void givenMultipleElements_whenPopping_thenReturnLastElementPushed() {
    int THE_ELEMENT = 10;
    Stack pile = new Stack();
    pile.push(AN_ELEMENT);
    pile.push(THE_ELEMENT);

    int elementReturned = pile.pop();

    assertEquals(THE_ELEMENT, elementReturned);
  }

  @Test
  public void givenTwoElements_whenPoppingTwice_thenReturnFirstElementPushed() {
    int THE_ELEMENT = 10;
    Stack pile = new Stack();
    pile.push(THE_ELEMENT);
    pile.push(AN_ELEMENT);

    pile.pop();
    int elementReturned = pile.pop();

    assertEquals(THE_ELEMENT, elementReturned);
  }
}











