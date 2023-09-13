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
        emp[5].setSalary(50000);
        emp[4].setDepartment(3);
        Employee.list(emp);
        System.out.println(Employee.sum(emp));
        System.out.println(Employee.minSalary(emp));
        System.out.println(Employee.maxSalary(emp));
        System.out.println(Employee.averageSalary(emp));
        Employee.name(emp);
    }
}