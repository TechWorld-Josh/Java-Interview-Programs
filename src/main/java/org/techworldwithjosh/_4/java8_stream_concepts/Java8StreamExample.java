package org.techworldwithjosh._4.java8_stream_concepts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    int empNo;
    String eName;
    String job;
    String mgr;
    String hiredate;
    double sal;
    String comm;
    int deptNo;
    Department department;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Department {
    int deptNo;
    String dName;
    String loc;
}

public class Java8StreamExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Hari", "Dev", "100", "2020-01-01", 90000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(2, "Ravi", "Dev", "100", "2020-01-02", 85000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(3, "Kiran", "Dev", "100", "2020-01-03", 80000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(4, "Sita", "Dev", "100", "2020-01-04", 75000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(5, "Anil", "Dev", "100", "2020-01-05", 70000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(6, "Manoj", "Dev", "100", "2020-01-06", 65000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(7, "Suresh", "Dev", "100", "2020-01-07", 60000, "0", 10, new Department(10, "IT", "Hyderabad")),
                new Employee(8, "Rita", "HR", "200", "2020-02-01", 55000, "0", 20, new Department(20, "HR", "Delhi")),
                new Employee(9, "Meena", "HR", "200", "2020-02-02", 50000, "0", 20, new Department(20, "HR", "Delhi")),
                new Employee(10, "Anu", "HR", "200", "2020-02-03", 45000, "0", 20, new Department(20, "HR", "Delhi"))
        );

        // 7th highest salary in each department
        Map<Department, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getSal).reversed())
                                        .skip(6)
                                        .findFirst())));
        result.forEach((dept, emp) -> System.out.println(dept.getDName() + " => " + emp.orElse(null)));
    }
}
