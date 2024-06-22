package RaghuSir.RevisionDataStructure.Recursion;

public class LCM {
    public static void main(String[] args) {
        System.out.println("LCM is "+LCM(2,8));
    }
    public static int GCD(int a,int b){
        if (a == 0)
            return b;
        return GCD(b % a,a);
    }
    public static int LCM(int a,int b){
        return a * b / GCD(a,b);
    }
}
