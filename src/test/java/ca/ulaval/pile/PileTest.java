package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {

  @Test
  public void shouldBeEmpty() {
    Pile pile = new Pile();
    assertTrue(pile.isEmpty());
  }
  
  @Test
  public void whenPush_shouldAddTheElement() {
    Pile pile = new Pile();
    pile.push();
    assertFalse(pile.isEmpty());
  }

  @Test
  public void givenPushedAnElement_whenPopping_shouldBeEmpty() {
    Pile pile = new Pile();
    pile.push();

    pile.pop();

    assertTrue(pile.isEmpty());
  }
}