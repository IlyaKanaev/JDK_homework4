/* каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
 */
public class Employee {
    private final String employeesName;
    private final String phoneNumber;
    private final int serviceNumber;
    private final int workExperience;

    public Employee(String employeesName, String phoneNumber, int serviceNumber, int workExperience) {
        this.employeesName = employeesName;
        this.phoneNumber = phoneNumber;
        this.serviceNumber = serviceNumber;
        this.workExperience = workExperience;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmployeesName() {
        return employeesName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeesName='" + employeesName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", serviceNumber=" + serviceNumber +
                ", workExperience=" + workExperience +
                '}';
    }
}
