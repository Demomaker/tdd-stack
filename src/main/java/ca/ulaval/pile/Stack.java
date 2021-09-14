package ca.ulaval.pile;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private boolean empty = true;
    private List<Integer> list = new ArrayList<Integer>();

    public boolean isEmpty() {
        return empty;
    }

    public void push(int element) {
      this.list.add(element);
      empty = false;
    }

    public int pop() {
      empty = true;
      return this.list.remove(this.list.size() - 1);
    }
}