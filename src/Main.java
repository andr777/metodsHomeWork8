import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* ### Задание 1
Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным,
и выводит результат в консоль.
*Эту проверку вы уже реализовывали в задании по условным операторам.*
Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то должно быть выведено
“*номер года —* високосный год”. Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.                 */

        System.out.println("Задание 1");
        double year;
        //System.out.println("enter the year here -> "); //  ввод с консоли
        //Scanner input = new Scanner(System.in);        //  ввод с консоли
        //year=input.nextDouble();                       //  ввод с консоли
        //year = 2020;
        //year = 2021;
        year = LocalDate.now().getYear();

        System.out.println(visokosnyiGod(year)); // visokosnyiGod() метод для определения високосности года, см.ниже.
        System.out.println(" ");

        /* ### Задание 2
Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
- Текст прошлого задания
    К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона, но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
    Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
    Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
    Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий — операционной системы телефона (iOS или Android) и года производства.
    Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
    Например, для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
    А для Android так:     «Установите облегченную версию приложения для Android по ссылке».
    При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
    Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
    Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
Текущий год можно получить таким способом: int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную, введя в переменную числовое значение.
В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.             */

        System.out.println("Задание 2");
        int clientDeviceYear = 2022;
        int typeOS = 0;

        System.out.println(metodOpredeleniyaOS(typeOS, clientDeviceYear)); // metodOpredeleniyaOS() метод для определения что ставить
        System.out.println(" ");

        /* ### Задание 3
Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
- Текст прошлого задания
    Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
    Правила доставки такие:
    Доставка в пределах 20 км занимает сутки.
    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    Напишите программу, которая выдает сообщение в консоль:
    "Потребуется дней: " + срок доставки
    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
Наша задача — доработать код, а именно написать метод,
который на вход принимает дистанцию и возвращает итоговое количество дней доставки.                 */

        System.out.println("Задание 3");
        int deliveryDistance = 95;

        System.out.println("Потребуется дней: " + deliveryDays(deliveryDistance)); // deliveryDays() метод для определения  количество дней доставки
        System.out.println(" ");


    }  // конец метода main


    /* ### Задание 1 */
    // visokosnyiGod() метод для определения високосности года
    public static String visokosnyiGod(Double year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return "" + (String.format("%.0f", year)) + " - високосный год";
        } else {
            return "" + (String.format("%.0f", year)) + " - не високосный год";
        }
    }

    /* ### Задание 2  */
    // metodOpredeleniyaOS() метод для определения что ставить
    // 0 — iOS, 1 — Android
// Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
    public static String metodOpredeleniyaOS(int typeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear(); // узнаём год для сравнения

        if (typeOS == 0 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (typeOS == 1 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (typeOS == 0 && clientDeviceYear >= currentYear) {
            return "Установите версию приложения для iOS по ссылке";
        }
        if (typeOS == 1 && clientDeviceYear >= currentYear) {
            return "Установите версию приложения для Android по ссылке";
        }
        return "";

    }


    /* ### Задание 3                       */
    // deliveryDays() метод для определения  количество дней доставки
    /*       Доставка в пределах 20 км занимает сутки.
    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    Доставка в пределах 60 км до 100 км добавляет еще одни сутки.     */
    public static int deliveryDays(int deliveryDistance) {
        int deliveryTime = 999999999;
        if (deliveryDistance <= 100) {
            deliveryTime = 3;
        }
        if (deliveryDistance < 60) {
            deliveryTime = 2;
        }
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        }
        return deliveryTime;
    }


}