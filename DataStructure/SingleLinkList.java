package RaghuSir.DataStructure;
public class SingleLinkList {
    class Node {
        public Object data;
        public Node next;
        public Node(Object data) {
            this.data = data;
        }
    }
    Node head;
    public void add(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }
    public String toString() {
        String str = "";
        Node temp = head;
        while (temp != null) {
            str = str + temp.data;
            if (temp.next != null)
                str = str + "->";
            temp = temp.next;
        }
        return str;
    }
}

