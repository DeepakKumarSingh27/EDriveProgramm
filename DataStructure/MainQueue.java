package RaghuSir.DataStructure;

public class MainQueue {
    public static void main(String[] args) {
        myQueue mq = new myQueue(5);
        mq.offer(1);
        mq.offer(2);
        mq.offer(3);
        mq.offer(4);
        mq.offer(5);
        System.out.println(mq);
        System.out.println(mq.remove());
        System.out.println(mq);
    }
}
