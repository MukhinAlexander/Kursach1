public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Мухин Александр Николаевич", 3, 120000);
        Employee person1 = new Employee("Мухин Александр Николаевич", 3, 150000);
        Employee person2 = new Employee();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person.equals(person1));

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.showEmployeeBook();
        employeeBook.averageSalary();
        employeeBook.taxedSalary("PROPORTIONAL");
        employeeBook.taxedSalary("PROGRESSIVE");
    }


}