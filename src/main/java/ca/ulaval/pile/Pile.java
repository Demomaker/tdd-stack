package ca.ulaval.pile;

public class Pile {

    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public void push() {
      empty = false;
    }

    public void pop() {
      empty = true;
    }
}