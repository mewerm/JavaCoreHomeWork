package Work5;


public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int payRoll;
    private final int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int payRoll, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payRoll = payRoll;
        this.age = age;
    }


    public void printInfo() {
        System.out.printf("     ФИО: %s%n     Должность: %s%n     Email: %s%n     Номер телефона: %s%n     Зарплата: %d%n     Возраст %d%n", fullName, position, email, phoneNumber, payRoll, age);
    }


    /*    public String toString() {

            return String.format("     ФИО: %s%n     Должность: %s%n     Email: %s%n     Номер телефона: %s%n     Зарплата: %d%n     Возраст %d", fullName, position, email, phoneNumber, payRoll, age);

        }*/
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPayRoll() {
        return payRoll;
    }

    public int getAge() {
        return age;
    }

}






/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
