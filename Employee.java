import java.time.LocalDate;
public class Employee {
    String name;
    double salary;
    LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
    }
public static void main(String[] args) {
        LocalDate hireDate1 = LocalDate.parse("2021-04-01");
        LocalDate hireDate2 = LocalDate.parse("2015-04-01");
        LocalDate hireDate3 = LocalDate.parse("2011-01-15");

        Employee Employee1 = new Employee("Roberta Petrus",50000,hireDate1);
        Employee Employee2 = new Employee("Loyd Blair",70000,hireDate2);
        Employee Employee3 = new Employee("Magdalena Artemon",50000,hireDate3);

        Employee1.printDetails();
        System.out.println();
        Employee2.printDetails();
        System.out.println();
        Employee3.printDetails();
    }
}