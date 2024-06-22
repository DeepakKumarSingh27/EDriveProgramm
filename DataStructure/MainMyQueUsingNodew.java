package RaghuSir.DataStructure;

public class MainMyQueUsingNodew {
    public static void main(String[] args) {
        myQueUsingNode mq = new myQueUsingNode();
        mq.deque(1);
        mq.deque(2);
        mq.deque(3);
        mq.deque(4);
        System.out.println(mq);
        System.out.println("Queue size is "+mq.size());
        System.out.println(mq.enque());
        System.out.println("Queue size is "+mq.size());
    }
}
