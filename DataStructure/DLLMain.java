package RaghuSir.DataStructure;

public class DLLMain {
    public static void main(String[] args) {
        DLL dl = new DLL();
        dl.add(10);
        dl.add(20);
        dl.add(30);
        dl.add(40);
        dl.add("Deepak");
        dl.add(50);
        System.out.println(dl);
        dl.addFirst(5);
        System.out.println(dl);
        dl.add(60,6);
        System.out.println(dl);
        System.out.println(dl.deleteFirst());
        System.out.println(dl);
        System.out.println(dl.deleteLast());
        System.out.println(dl.delete(2));
        System.out.println(dl);
        dl.reverse();
        System.out.println(dl);
    }
}
