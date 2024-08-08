import java.util.List;
import java.util.ArrayList;

public class EmployeeBook {
    private final List<Employee> employee;

    public EmployeeBook(List<Employee> employeeList) {
        this.employee = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employee;
    }

    // Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<String> searchEmployeeByExperience(List<Employee> employees, int workExperience) {
        List<String> nameList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getWorkExperience() >= workExperience) {
                nameList.add(employee.getEmployeesName());
            }
        }
        return nameList;
    }

    // Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    public List<String> searchPhoneByName(List<Employee> employees, String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getEmployeesName().equals(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public String searchEmployeeByServiceNumber(List<Employee> employees, int uin) {
        for (Employee employee : employees) {
            if (employee.getServiceNumber() == uin) {
                return employee.toString();
            }
        }
        return "Такого сотрудника нет";
    }

    // Добавить метод добавления нового сотрудника в справочник
    public void addEmployeeToList(List<Employee> employees, Employee employee) {
        employees.add(employee);
    }
}
