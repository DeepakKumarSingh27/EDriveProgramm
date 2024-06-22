package RaghuSir.DataStructure;

public class Stack {
    int capacity,top;
    Object[] obj;
    public Stack(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        top = -1;
    }
    public void push(Object ele) {
        if (top == capacity-1){
            System.out.println("Stack overFlow....");
            return;
        }
         obj[++top] = ele;
    }
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(obj[i]+" ");
        }
        System.out.println();
    }
    public  Object pop() {
        if (top == -1){
            System.out.println("Stack is underFlow....");
            return null;
        }
        return obj[top--];
    }
    public Object peek() {
        if (top == -1) {
            System.out.println("Stack is underFlow....");
            return null;
        }
        return obj[top];
    }
    public int search(Object ele) {
        for (int i = 0; i <= top ; i++) {
            if (obj[i].equals(ele))
            return top - i + 1;
        }
        return -1;
    }
    public int size() {
        return top + 1;
    }
}
