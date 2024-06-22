package RaghuSir.DataStructure;

public class MainStackUsingNode {
    public static void main(String[] args) {
        StackUsingNode stk = new StackUsingNode();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println("Size of Stack is "+stk.size());
        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println("Size of Stack is "+stk.size());
        System.out.println(stk);
        System.out.println(stk.peek());
    }
}
