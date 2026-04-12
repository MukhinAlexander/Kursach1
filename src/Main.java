public class Main {
    public static void main(String[] args) {

        Employee person = new Employee("Мухин Александр Николаевич", 3, 120000);
        Employee person1 = new Employee("Иванов Иван Иванович", 3, 150000);
        Employee person2 = new Employee();
        Employee person3 = new Employee("Сергеев Сергей Сергеевич", 1, 220000);
        Employee person4 = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 320000);
        Employee person5 = new Employee("Николаев Николай Николаевич", 4, 110000);
        Employee person6 = new Employee("Петров Пётр Петрович", 2, 90000);
        Employee person7 = new Employee("Александров Александр Александрович" , 2, 111111);
        Employee person8 = new Employee("Павлов Павел Павлович" , 4, 222222);


        EmployeeBook employeeBook = new EmployeeBook();


        employeeBook.addEmployeeToList(person);
        employeeBook.addEmployeeToList(person1);
        employeeBook.addEmployeeToList(person2);
        employeeBook.addEmployeeToList(person3);
        employeeBook.addEmployeeToList(person4);
        employeeBook.addEmployeeToList(person5);
        employeeBook.addEmployeeToList(person6);
        employeeBook.addEmployeeToList(person7);
        employeeBook.addEmployeeToList(person8);
        employeeBook.addEmployeeToList(person);


        employeeBook.showEmployeeBook();
        System.out.println();

/*        employeeBook.averageSalary();
        System.out.println();

        employeeBook.taxedSalary("PROPORTIONAL");
        System.out.println();

        employeeBook.taxedSalary("PROGRESSIVE");
        System.out.println();

        /*employeeBook.increaseSalaryByIndex(3, (short) 0.1);*/
        System.out.println();

        /*employeeBook.getEmployeeBySalary(2, 150000);*/
        System.out.println();

        /*employeeBook.getListEmployeeBySalary(250000, 4);*/
        System.out.println();

        /*employeeBook.hasEmployee(person5);*/
        System.out.println();

        /*employeeBook.getEmployeeById(2);*/
    }


}