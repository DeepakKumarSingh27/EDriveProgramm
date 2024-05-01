package RaghuSir.javaEightFetures;


interface  StudentDetails {
    Student getStudent(Integer id,String name,Double per);
}
public class MainRunner8 {
    public static void main(String[] args) {
        StudentDetails sd = Student::new;
        Student std = sd.getStudent(123,"Deepak",56.89);
        System.out.println(std);
        
    }
}
