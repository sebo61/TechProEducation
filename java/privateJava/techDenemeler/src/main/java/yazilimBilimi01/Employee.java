package yazilimBilimi01;


public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary =salary;
    }
    public void showInfos(){
        System.out.println("Bilgiler...");
        System.out.println("Name..:"+this.name);
        System.out.println("Departmant..:"+this.department);
        System.out.println("Maaşı..:"+this.salary);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
