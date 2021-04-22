import java.util.ArrayList;

public class Boss extends Employee {
    private ArrayList<Employee> employeeList = new ArrayList();

    public Boss(int age, String name, double salary) {
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
        for (Employee employee : employeeList) {
            employee.print();
        }
    }
}
