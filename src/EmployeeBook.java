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
                    if (e.getSalary() <= 150) {
                        System.out.println(e.getSalary() * 0.13);
                    } else if (e.getSalary() <= 350) {
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


}