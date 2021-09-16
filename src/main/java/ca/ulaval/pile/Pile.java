package ca.ulaval.pile;

import java.util.ArrayList;
import java.util.List;

public class Pile {

  private boolean empty = true;
  private List<Integer> list = new ArrayList();

  public boolean isEmpty() {
    return empty;
  }

  public void push(int element) {
    list.add(element);
    empty = false;
  }

  public int pop() {
    empty = true;
    return list.remove(list.size() - 1);
  }
}