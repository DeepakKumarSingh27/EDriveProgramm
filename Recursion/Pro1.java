package RaghuSir.Recursion;

public class Pro1 {
    static int cnt = 1;
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        if (cnt == 5)
        {
            return;
        }
        System.out.println(cnt +" Deepak");
        cnt++;
        print();
    }
}
