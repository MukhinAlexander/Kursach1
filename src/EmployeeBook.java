public class EmployeeBook {

    private static Employee[] book = new Employee[10];

    public void showEmployeeBook() {

        for (Employee e : book) {
            if (e != null) {
                System.out.println(e.toString());
            }
        }
    }

    public void averageSalary() {
        int averageSalary = 0;
        int count = 0;
        for (Employee e : book) {
            if (e != null){
                averageSalary += e.getSalary();
                count++;
            } else {
                System.out.println((double) averageSalary/count);
                break;
            }

        }
    }

    public void taxedSalary(String type) {
        switch (type) {
            case "PROPORTIONAL":
                for (Employee e : book) {
                    System.out.println(e.getSalary() + e.getSalary() * 0.13);
                }
                break;
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

    public void increaseSalaryByIndex(int department, short index){
        for (Employee e : book) {
            if (e.getDepartment() != department) {
                continue;
            } else {
                e.setSalary((e.getSalary() * index) + e.getSalary());
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


    public boolean hasEmployee(Employee employee) {
        for (Employee e : book) {
            if (e == null){
                break;
            }
            if (e.equals(employee)){
                return true;
            }
        }
        return false;
    }

    public boolean addEmployeeToList(Employee newEmployee){
        for (int i = 0; i < book.length; i++){
            if (book[i] == null){
                book[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public String getEmployeeById(int id){
        for (Employee e : book){
            if (e.getId() == id){
                return e.getFullName();
            }
        }
        return "Сотрудника с таким id нет";
    }
}