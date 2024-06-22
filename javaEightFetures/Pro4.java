package RaghuSir.javaEightFetures;

import java.util.Hashtable;

class Student1 {
   public int sid;
    String name;
    double per;
    String address;

    public Student1(double per, String name, String address) {
        this.per = per;
        this.name = name;
        this.address = address;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + per +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

 public class Pro4 {
    public static void main(String[] args) {
        Hashtable<Integer, Student1> mpp = new Hashtable<Integer, Student1>();
        Integer sid = 1;
        mpp.put(sid++, new Student1(55.55, "Deepak", "Bettiah"));
        mpp.put(sid, new Student1(65.55, "Deepu", "Nautan"));
        for (Integer key : mpp.keySet()) {
            Student1 student = mpp.get(key);
            System.out.println("Key: " + key + ", Value: " + student);
        }
    }
}
