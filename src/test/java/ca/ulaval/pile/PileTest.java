package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {

  @Test
  public void whenCreatingANewStack_thenItShouldBeEmpty() {
    Pile pile = new Pile();
    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void whenPush_thenAddTheElement() {
    Pile pile = new Pile();

    pile.push();
    
    assertFalse(pile.isEmpty());
  }


  @Test
  public void givenAStackWithOneElement_whenPopping_thenStackShouldBeEmpty() {
    Pile pile = new Pile();

    pile.push();

    pile.pop();

    assertTrue(pile.isEmpty());
  }
}