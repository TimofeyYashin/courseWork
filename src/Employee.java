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
}
