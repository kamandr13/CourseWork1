public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 10000);
        employees[1] = new Employee("Петров", "Дарт", "Вейдерович", 1, 20000);
        employees[2] = new Employee("Шишкин", "Михаил", "Валентинович", 2, 30000);
        employees[3] = new Employee("Травинова", "Ирина", "Семеновна", 2, 40000);
        employees[4] = new Employee("Сидорова", "Кристина", "Дмитриевна", 3, 50000);
        employees[5] = new Employee("Тушкевич", "Максим", "Николаевич", 3, 60000);
        employees[6] = new Employee("Крутов", "Дмитрий", "Григорьевич", 4, 70000);
        employees[7] = new Employee("Потапкина", "Анна", "Николаевна", 5, 80000);
        employees[8] = new Employee("Исаев", "Петр", "Семенович", 5, 90000);
        employees[9] = new Employee("Чапаев", "Василий", "Иванович", 5, 100000);
        printAllEmployees(employees);
        System.out.println("Сумма всех зарплат в месяц: " + sumOfSalary(employees) + " руб." + '\n');
        System.out.println("Сотрудник с минимальной зарплатой: " + '\n' + findEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + '\n' + findEmployeeWithMaxSalary(employees));
        System.out.println("Средняя зарплата составляет: " + avgOfSalary(employees) + " руб." + '\n');
        printAllLastnameOfEmployees(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public static double sumOfSalary(Employee[] employees) {
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee empWithMinSalary = null;
        for (Employee emp : employees) {
            if (emp != null && (empWithMinSalary == null || (empWithMinSalary != null && emp.getSalary() < empWithMinSalary.getSalary()))) {
                empWithMinSalary = emp;
            }
        }
        return empWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee empWithMaxSalary = null;
        for (Employee emp : employees) {
            if (emp != null && (empWithMaxSalary == null || (empWithMaxSalary != null && emp.getSalary() > empWithMaxSalary.getSalary()))) {
                empWithMaxSalary = emp;
            }
        }
        return empWithMaxSalary;
    }

    public static double avgOfSalary(Employee[] employees) {
        int amount = getAmount(employees);
        if (amount != 0) {
            return sumOfSalary(employees) / amount;
        }
        return 0;
    }

    public static void printAllLastnameOfEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getLastName());
            }
        }
    }

    public static int getAmount(Employee[] employees) {
        int amount = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                amount = emp.getCount();
                break;
            }
        }
        return amount;
    }
}
