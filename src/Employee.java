public class Employee {
    private final String nick;
    private int department;
    private int salary;
    private final int id;
    private static int countId;

    public Employee(String nick, int department, int salary) {
        this.nick = nick;
        this.department = department;
        this.salary = salary;
        id = ++countId;
    }

    public String getNick() {
        return nick;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return countId;
    }

    @Override
    public String toString() {
        return "id " + id + " Ф.И.О. " + this.nick + " Отдел " + this.department + " Зарплата - " + this.salary;
    }

    public static void list(Employee[] emp) {
        for (Employee e : emp) {
            System.out.println(e);
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
        int sum = 0;
        int average = 0;
        for (Employee employee : emp) {
            sum = sum + employee.getSalary();
            average = sum / emp.length;
        }
        return "Cреднее значение зарплат: " + average;
    }

    public static void name(Employee[] emp) {
        for (Employee employee : emp) {
            System.out.println(employee.nick);
        }
    }
}
