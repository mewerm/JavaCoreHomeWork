package Work5;

public class Main {
    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[5];

        employeesArr[0] = new Employee("Иванов Федор Михайлович ", "Слесарь", "222/7@mail.ru", "+78282232882", 33000, 40);
        employeesArr[1] = new Employee("Потряйкин Анатолий Всегдатович", "Повар", "265рр/7@mail.ru", "+79992232882", 45000, 41);
        employeesArr[2] = new Employee("Сулейманов Эдуард Игоревич", "Самый главный", "7bond007@mail.ru", "+77775431234", 330000, 53);
        employeesArr[3] = new Employee("Всевозможнов Дмитрий Эмплоевич", "Менджер по персоналу", "blaBla5533@mail.ru", "+78282237766", 150000, 39);
        employeesArr[4] = new Employee("Незабудина Ирина Павловна", "Преподаватель математики", "seatDownTwo@mail.ru", "+78282223322", 25000, 64);

        System.out.println("  Данные сотрудников старше 40 лет: ");
        System.out.println();

        for (Employee employee : employeesArr) {
            if (employee.getAge() > 40) {
                employee.printInfo();
                System.out.println("-----------------------------------------");


            }
        }


    }
}
