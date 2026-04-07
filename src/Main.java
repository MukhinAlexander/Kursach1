public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Мухин Александр Николаевич", 3, 120000);
        Employee person1 = new Employee("Иванов Иван Иванович", 3, 150000);
        Employee person2 = new Employee();
        Employee person3 = new Employee("Сергеев Сергей Сергеевич", 1, 220000);
        Employee person4 = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 320000);
        Employee person5 = new Employee("Николаев Николай Николаевич", 4, 110000);
        Employee person6 = new Employee("Петров Пётр Петрович", 2, 90000);


        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployeeToList(person);
        employeeBook.addEmployeeToList(person1);
        employeeBook.addEmployeeToList(person2);
        employeeBook.addEmployeeToList(person3);
        employeeBook.addEmployeeToList(person4);
        employeeBook.addEmployeeToList(person5);
        employeeBook.addEmployeeToList(person6);


        employeeBook.showEmployeeBook();
        employeeBook.averageSalary();
        employeeBook.taxedSalary("PROPORTIONAL");
        employeeBook.taxedSalary("PROGRESSIVE");
        employeeBook.increaseSalaryByIndex(3, (short) 0.1);
        employeeBook.getEmployeeBySalary(2, 150000);
        employeeBook.getListEmployeeBySalary(250000, 4);

        employeeBook.hasEmployee(person5);
    }


}