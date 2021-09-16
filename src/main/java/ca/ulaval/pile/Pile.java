package ca.ulaval.pile;

public class Pile {

  private boolean empty = true;
  private int element;

  public boolean isEmpty() {
    return empty;
  }

  public void push(int element) {
    this.element = element;
    empty = false;
  }

  public int pop() {
    empty = true;
    return element;
  }
}