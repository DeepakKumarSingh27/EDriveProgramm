package RaghuSir.DataStructure;

public class StackUsingNode {
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
        }
    }
    Node top;
    int count = 0;
    public void push(Object data) {
      Node n = new Node(data);
      count++;
      n.next = top;
      top = n;
    }
    public int size() {
        return count;
    }
    public String toString() {
        String str = "";
        Node temp = top;
        while (temp != null) {
            str = str+ temp.data;
            if (temp.next != null)
                str += "<=";
            temp = temp.next;
        }
        return str;
    }
    public Object pop() {
        if (top == null)
            return "Stack is underflow..";
        Object data = top.data;
        count--;
        top = top.next;
        return data;
    }
    public Object peek() {
        return top.data;
    }
}
