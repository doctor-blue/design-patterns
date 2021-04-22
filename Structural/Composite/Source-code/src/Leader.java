import java.util.ArrayList;
import java.util.List;

public class Leader extends Employee {

    private ArrayList<Employee> employeeList = new ArrayList();

    public Leader(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("==================");
        System.out.println("Name : " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("==================");
        for (Employee employee: employeeList) {
            employee.print();
        }
    }
}
