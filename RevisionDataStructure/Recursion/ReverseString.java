package RaghuSir.RevisionDataStructure.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reversed String is "+ reverseString("Deepak"));
    }
    public static String reverseString(String st){
        return reverseString(0,st);
    }
    public static String reverseString(int in,String str){
        if (in == str.length() - 1)
            return str.charAt(in) + "";
        return reverseString(in + 1,str) + str.charAt(in);
    }
}
