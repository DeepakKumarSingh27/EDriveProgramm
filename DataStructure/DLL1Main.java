package RaghuSir.DataStructure;

public class DLL1Main {
    public static void main(String[] args) {
        DLL1 dl = new DLL1();
        dl.add(10);
        dl.add(20);
        dl.add(30);
        dl.add("Deepak");
        System.out.println(dl);
        dl.addFirst(5);
        System.out.println(dl);
        dl.add(15,3);
        System.out.println(dl);
        System.out.println(dl.deleteFirst());
        System.out.println(dl.deleteLast());
        System.out.println(dl);
        System.out.println(dl.delete(3));
        dl.reverse();
        System.out.println(dl);
    }
}
