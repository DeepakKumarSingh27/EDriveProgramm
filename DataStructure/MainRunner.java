package RaghuSir.DataStructure;

public class MainRunner {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(24);
        stk.push(56);
        stk.push(34);
        stk.push(26);
        stk.push(48);
        stk.display();
        System.out.println(stk.pop());
        stk.display();
        System.out.println(stk.peek());
        System.out.println(stk.size());
        System.out.println(stk.search(24));
    }
}
