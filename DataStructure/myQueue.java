package RaghuSir.DataStructure;

public class myQueue {
    Object[] obj;
    int capacity, rear, font;

    public myQueue(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        rear = font = -1;
    }

    public void offer(Object ele) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full....");
            return;
        }
        if (font == -1) {
            font = 0;
        }
        obj[++rear] = ele;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = font; i <= rear && i > 0; i++) {
            str += obj[i];
            if (i < rear) {
                str += ",";
            }
        }
        return str += "]";
    }

    public Object remove() {
        if (font == -1) {
            System.out.println("Queue is Empty....");
            return null;
        }
        Object ele = obj[font++];
        if (font > rear) {
            rear = font = -1;
        }
        return ele;
    }
}
