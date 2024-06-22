package RaghuSir.DataStructure;

public class GFGTESTClass {
    public int cnt = 0;
   public class Node
    {

        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static Node head;
    Node tail;
    public void add(int data) {
        Node n = new Node(data);
        cnt++;
        if (head == null) {
            head = tail = n;
            return;
        }
        n.prev = tail;
        tail.next = n;
        tail = n;
    }
    public String toString() {
        String str ="[";
        int temp = head.data;
        while (temp  == cnt ) {
            str +=temp;
            temp++;
            if (temp==cnt) str +=",";
        }
        return str+']';
    }
public static Node reverse(){
    Node  curr = head;
    Node prev = null;
    while (curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;
}
    public static void main(String[] args) {
        GFGTESTClass dl = new GFGTESTClass();
        dl.add(3);
        dl.add(4);
        dl.add(5);
        System.out.println(dl);
        dl.reverse();
        System.out.println(dl);
    }
}
