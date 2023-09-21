import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];
        emp[0] = new Employee("Корнилова Валерия Даниловна", 3, 45000);
        emp[1] = new Employee("Карпов Мирослав Эминович", 2, 50000);
        emp[2] = new Employee("Жданова Агния Львовна", 1, 46500);
        emp[3] = new Employee("Сычев Ярослав Константинович", 1, 40000);
        emp[4] = new Employee("Зайцев Максим Артемович", 2, 56700);
        emp[5] = new Employee("Смирнова Алена Сергеевна", 4, 49000);
        emp[6] = new Employee("Орлов Михаил Миронович", 5, 52000);
        emp[7] = new Employee("Cорокин Дмитрий Русланович", 3, 49000);
        emp[8] = new Employee("Львов Павел Дмитриевич", 4, 51000);
        emp[9] = new Employee("Журавлев Елисей Богданович", 5, 43000);
        // emp[5].setSalary(50000);
        //  emp[4].setDepartment(3);
        list(emp);
        System.out.println(sum(emp));
        System.out.println(minSalary(emp));
        System.out.println(maxSalary(emp));
        System.out.println(averageSalary(emp));
        name(emp);
        System.out.println(minimumSalary(4, emp));
        System.out.println(maximumSalary(3, emp));
        System.out.println(amountOfCosts(2, emp));
        System.out.println(averageSalaryByDepartment(2, emp));
        indexingEmployeesByDepartment(1.2, 3, emp);
        departmentEmployees(1, emp);
        lessNumber(50000, emp);
        moreNumber(50000, emp);
        indexing(emp);
    }

    public static void list(Employee[] emp) {
        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }

    public static String sum(Employee[] emp) {
        int sum = 0;
        for (Employee employee : emp) {
            sum = sum + employee.getSalary();
        }
        return "Cуммa затрат на зарплаты в месяц - " + sum;
    }

    public static String minSalary(Employee[] emp) {
        Employee minEmployee = emp[0];
        for (Employee employee : emp) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return "Сотрудник с минимальной зарплатой: " + minEmployee;
    }

    public static String maxSalary(Employee[] emp) {
        Employee maxEmployee = emp[0];
        for (Employee employee : emp) {
            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return "Cотрудник с максимальной зарплатой: " + maxEmployee;
    }

    public static String averageSalary(Employee[] emp) {
        double sum = 0;
        double average;
        for (Employee employee : emp) {
            sum = sum + employee.getSalary();
        }
        average = sum / emp.length;
        return "Cреднее значение зарплат: " + average;
    }

    public static void name(Employee[] emp) {
        for (Employee employee : emp) {
            System.out.println(employee.getNick());
        }
    }

    public static void indexing(Employee[] emp) {
        //индексация зарплаты на 20%
        for (Employee employee : emp) {
            employee.setSalary((int) (employee.getSalary() * 1.2));
            System.out.println(employee);
        }
    }

    public static String minimumSalary(int department, Employee[] emp) {
        Employee minEmployee = null;
        for (Employee employee : emp) {
            if (employee.getDepartment() == department) {
                if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                    minEmployee = employee;
                }
            }
        }
        return "Cотрудник с минимальной зарплатой - " + minEmployee;
    }

    public static String maximumSalary(int department, Employee[] emp) {
        Employee maxEmployee = null;
        for (Employee employee : emp) {
            if (employee.getDepartment() == department) {
                if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                    maxEmployee = employee;
                }
            }
        }
        return "Сотрудник с максимальной зарплатой - " + maxEmployee;
    }

    public static String amountOfCosts(int department, Employee[] emp) {
        int sum = 0;
        for (Employee employee : emp) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return "Сумма затрат по отделу - " + sum;
    }

    public static String averageSalaryByDepartment(int department, Employee[] emp) {
        double sum = 0;
        double average;
        int count = 0;
        for (Employee employee : emp) {
            if (employee.getDepartment() == department) {
                count++;
                sum = sum + employee.getSalary();
            }
        }
        average = sum / count;
        return "Среднее значение зарплат по отделу - " + average;
    }

    public static void indexingEmployeesByDepartment(double percent, int department, Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percent));
                System.out.println("Индексация сотрудников в отделе - " + employee);
            }
        }
    }

    public static void departmentEmployees (int department, Employee[] emp) {
        for (Employee employee : emp) {
            if(employee.getDepartment() == department) {
                System.out.println("id " + employee.getId() + " "+ employee.getNick()+ ", зарплата - " + employee.getSalary());
            }
        }

    }
    public static void lessNumber(int x, Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getSalary() < x) {
                System.out.println("id " + employee.getId() + ", " + employee.getNick() + " - " + employee.getSalary());
            }
        }
    }

    public static void moreNumber(int x, Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getSalary() >= x) {
                System.out.println("id " + employee.getId() + ", " + employee.getNick() + " - " + employee.getSalary());
            }
        }
    }
}