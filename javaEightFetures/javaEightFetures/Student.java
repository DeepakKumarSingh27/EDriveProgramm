package RaghuSir.javaEightFetures.javaEightFetures;

public class Student {
    int id;
    String name;
    Double prr;

    public Student(int id, String name, Double prr) {
        this.id = id;
        this.name = name;
        this.prr = prr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prr=" + prr +
                '}';
    }
}
