package RaghuSir.javaEightFetures.javaEightFetures;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainRunner16 {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId()));
        employees.add(new Employee(123, "ramesh", 345.56, "Development"));
        employees.add(new Employee(124, "Deepak", 445.56, "test"));
        employees.add(new Employee(125, "Roshan", 545.56, "Devel"));
        employees.forEach(System.out::println);
        employees.stream().filter((e1) -> e1.getEmpSalary() >= 3000 && e1.getEmpSalary() <= 5000).forEach(System.out::println);
        Employee he = employees.stream()
                .max(Comparator.comparing(Employee::getEmpSalary)).orElse(null);
        System.out.println(he);
        Employee le = employees.stream()
                .min(Comparator.comparingDouble(Employee::getEmpSalary)).orElse(null);
        System.out.println(le);
        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpSalary))
                .forEach(System.out::println);
        Map<String, List<Employee>> demps = employees.stream().collect(Collectors.groupingBy(Employee::getEmpDegination));

       demps.forEach((k,v)->{System.out.println(k+" : ");
            v.forEach(System.out::println);
       });


        demps.forEach((k, v) -> {
            System.out.println(k + " : ");
            v.forEach(System.out::println);
        });
    }
}

