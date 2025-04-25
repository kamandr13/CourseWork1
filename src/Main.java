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
        findEmployeeWithMinSalary(employees);
        findEmployeeWithMaxSalary(employees);
        System.out.println("Средняя зарплата составляет: " + avgOfSalary(employees) + " руб." + '\n');
        printAllLastnameOfEmployees(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].toString());
        }
    }

    public static int sumOfSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static void findEmployeeWithMinSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[index].getSalary() > employees[i].getSalary()) {
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + '\n' + employees[index].toString());
    }

    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[index].getSalary() < employees[i].getSalary()) {
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + '\n' + employees[index].toString());
    }

    public static double avgOfSalary(Employee[] employees) {
        return sumOfSalary(employees) / getCount(employees);
    }

    public static void printAllLastnameOfEmployees(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].getLastName());
        }
    }

    public static int getCount(Employee[] employees) {
        int count = 0;

        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                count = employees[i].getCount();
                break;
            }
        }
        return count;
    }
}
