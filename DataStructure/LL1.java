package RaghuSir.DataStructure;

public class LL1 {
    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void add(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
       tail.next = n;
        tail = n;
    }
    public void addFirst(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }
    public void add(Object data,int in) {
        if (in == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        while (temp != null && in > 1) {
            in--;
            temp = temp.next;
        }
        if (in == 1) {
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;

        } else {
            System.out.println("index not in range");
        }
    }
    public Object deleteFirst() {
        if (head == null) return "List is Empty..";
        Object data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    }
    public Object deleteLast() {
        if (head == null) return "List is Empty..";
         Node temp = head;
         Node prev = null;
         while (temp.next != null) {
             prev = temp;
             temp = temp.next;
         }
        if (prev != null)
            prev.next = null;
        else
            head = null;
        return temp.data;
    }
    public Object delete(int in) {
        if (in == 0)
            return deleteFirst();
        Node temp = head;
        while (temp.next != null && in > 1) {
            in--;
            temp = temp.next;
        }
        if (temp.next == null)
            return "index not in range";
        else {
            Object data = temp.next.data;
            temp.next = temp.next.next;
            return data;
        }
    }
    public String toString() {
        String str = "[";
        Node temp = head;
        while (temp != null) {
            str += temp.data;
            if (temp.next != null) str += ",";
            temp = temp.next;
        }
        return str+="]";
    }
}
