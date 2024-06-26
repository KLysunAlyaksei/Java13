package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Aleksei");

        Tester tester1 = new Tester("Иван", "Иваныч");
        Tester tester2 = new Tester("Амир", "Ахохов", 3);
        Tester tester3 = new Tester("Дим", "Димович", 5, "Вумник", 50000.0);

        tester1.printDetails();
        System.out.println("------------------------");
        tester2.printDetails("Дополнительная информация для tester2");
        System.out.println("------------------------");
        tester3.printDetails("Дополнительная информация для tester3", 2);

        Tester.staticMethodExample();
    }
}