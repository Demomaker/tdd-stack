package ca.ulaval.pile;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {

  @Test
  public void whenCreatingANewStack_thenItShouldBeEmpty() {
    Pile pile = new Pile();

    assertTrue(pile.isEmpty());
  }
  
}