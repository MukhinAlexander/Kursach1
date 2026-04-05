import java.util.Objects;

public class EmployeeBook {

    private static Employee[] book = new Employee[10];

    public void showEmployeeBook() {
        for (Employee e : book) {
            if (e != null) {
            }
            System.out.println(e.toString());
        }
    }

    public void averageSalary() {
        short averageSalary = 0;
        for (Employee e : book) {
            System.out.println(averageSalary + (short) e.getSalary());
        }
    }

    public void taxedSalary(String type) {
        switch (type) {
            case "PROPORTIONAL":
                for (Employee e : book) {
                    System.out.println(e.getSalary() * 0.13);
                    break;
                }
            case "PROGRESSIVE":
                for (Employee e : book) {
                    if (e.getSalary() <= 150000) {
                        System.out.println(e.getSalary() * 0.13);
                    } else if (e.getSalary() <= 350000 && e.getSalary() > 150000) {
                        System.out.println(e.getSalary() * 0.17);
                    } else {
                        System.out.println(e.getSalary() * 0.21);
                    }
                    break;
                }
            default:
                System.out.println("Invalid type");
        }
    }

    public void increaseSalaryByIndex(int department, double index){
        for (Employee e : book) {
            if (e.getDepartment() != department) {
                continue;
            } else {
                e.setSalary(e.getSalary() * index);
            }
        }
    }

    public void getEmployeeBySalary (int department, double salary){
        for (Employee e : book){
            if (e.getSalary() == salary){
                e.printShortInfo();
                break;
            }
        }
    }
    public void getListEmployeeBySalary( int wage, int employeeNumber){
        for (Employee e : book){
            int counter = 0;
            while (e.getSalary() < wage && counter < employeeNumber){
                System.out.println(e.getId());
                counter++;
            }
            break;
        }
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true; //проверка на то, что ссылки ссылаются на один и тот же объект
        if (ob == null || getClass() != ob.getClass()) { // проверка на то, что объекта нет, или объекты разных классов
            return false;
        }
        Employee employee = (Employee) ob; // приведение объектов к одному типу

        return ob.getSalary() == Employee.getSalary();
    }
}