package RaghuSir.DataStructure;

public class MainmyTree {
    public static void main(String[] args) {
        myTree mt = new myTree();
        mt.add(29);
        mt.add(35);
        mt.add(25);
        mt.add(28);
        mt.add(43);
        mt.add(32);
        mt.add(23);
        mt.display();
        System.out.println();
        System.out.println("size of Node is "+mt.size());
    }
}
