package RaghuSir.DataStructure;


public class myQueUsingNode {
    class Node {
        Object data;
        Node next;
        Node (Object data) {
            this.data = data;
        }
    }
    Node font, rear;
    int count = 0;
    public void deque(Object data) {
        Node n = new Node(data);
        count++;
        if (font == null) {
            font = n;
        } else {
            rear.next = n;
        }
        rear = n;
    }
   public String toString() {
        String str = "";
        Node temp = font;
        while (temp  != null) {
            str += temp.data;
            if (temp.next != null) {
                str += "<=";
            }
            temp = temp.next;
        }
        return str;
   }
   public Object enque() {
        if (font == null)
            return "Queue is Empty....";
        Object data = font.data;
        font = font.next;
        if (font == null)
            rear = null;
        count--;
        return data;
   }
   public int size() {
        return count;
   }
}
