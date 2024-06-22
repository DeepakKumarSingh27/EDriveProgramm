package RaghuSir.String;

public class Str1 {
    public static void main(String[] args) {
     String str = "Deepak";
        System.out.println(str.length());
        char[] ch = {'a','e','i'};
        System.out.println(ch.length);
        String s = "java";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        String s1 = "java";
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('v'));
        System.out.println(s1.indexOf('t'));
        System.out.println(s1.indexOf('j'));
        String st = "Raghu";
        char ch1[] = st.toCharArray();
        for (int i = 0; i <ch1.length ; i++) {
            System.out.println(ch1[i]);
        }
    }
}
