package RaghuSir.DataStructure;

public class LL1Main {
    public static void main(String[] args) {
        LL1 l = new LL1();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        l.addFirst(5);
        System.out.println(l);
        l.add(60,2);
        System.out.println(l);
        System.out.println(l.deleteFirst());
        System.out.println(l);
        System.out.println(l.deleteLast());
        System.out.println(l);
        System.out.println(l.delete(2));
    }
}
