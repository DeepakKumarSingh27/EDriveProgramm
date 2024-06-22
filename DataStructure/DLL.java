package RaghuSir.DataStructure;

public class DLL {
    class Node {
        Object data;
        Node next;
        Node prev;

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
        n.prev = tail;
        tail.next = n;
        tail = n;
    }

    public void addFirst(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        head.prev = n;
        n.next = head;
        head = n;
    }
    public void add(Object data , int in) {
        if (in == 0) addFirst(data);
        Node temp = head;
        while (in>1 && temp != null) {
            in--;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index not in range..");
            return;
        }
       Node n = new Node(data);
        n.next = temp.next;
        n.prev = temp;
        temp.next = n;
        if (n.next != null) {
            n.next.prev = n;
        }
    }
    public Object deleteFirst()
    {
        if (head == null)
            return "List is Empty..";
        Object data = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        return data;

    }
    public Object deleteLast() {
        if (head == null) return "List is Empty..";
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.prev != null) {
            temp.prev.next = null;
        } else {
            head = null;
        }
        return temp.data;
    }
    public Object delete(int in) {
        if (in == 0) return deleteFirst();
        Node temp = head;
        while (in>1 && temp != null) {
            temp = temp.next;
            in--;
        }
        if (temp == null) return "Index not in range..";
        temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        return temp.data;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public String toString() {
        String str = "[";
        Node temp = head;
        while (temp != null) {
            str += temp.data;
            if (temp.next != null) str += ",";
            temp = temp.next;
        }
        return str + "]";
    }
}
