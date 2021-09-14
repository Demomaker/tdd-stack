package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

  @Test
  public void isIntiallyEmpty() {
    Stack pile = new Stack();
    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void whenPush_thenAddTheElement() {
    Stack pile = new Stack();
    pile.push(5);
    assertFalse(pile.isEmpty());
  }


  @Test
  public void givenOneElement_whenPopping_thenElementIsRemoved() {
    Stack pile = new Stack();
    pile.push(5);

    pile.pop();

    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void givenOneElement_whenPopping_thenReturnTheElement() {
    Stack pile = new Stack();
    pile.push(5);
    
    int elementReturned = pile.pop();
    
    assertEquals(5, elementReturned);
  }
}











