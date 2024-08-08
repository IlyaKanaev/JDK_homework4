import java.util.ArrayList;
import java.util.List;

/*Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Иван", "89623564523", 102, 3);
        Employee emp2 = new Employee("Марина", "89623564524", 76, 3);
        Employee emp3 = new Employee("Леонид", "89623564525", 29, 4);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);EmployeeBook eBook = new EmployeeBook(employees);

        System.out.println("Со стажем работы от 4-х лет: " + eBook.searchEmployeeByExperience(eBook.getEmployeeList(), 4));
        System.out.println("Телефонный номер Марины: " + eBook.searchPhoneByName(eBook.getEmployeeList(),"Марина"));
        System.out.println("С табельным номером 102: " + eBook.searchEmployeeByServiceNumber(eBook.getEmployeeList(), 102));
        System.out.println("С табельным номером 3: " + eBook.searchEmployeeByServiceNumber(eBook.getEmployeeList(), 3));
    }
}
