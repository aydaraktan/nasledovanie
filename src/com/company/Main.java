package com.company;
public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom"); //создание объекта tom типа класса Person, выделение памяти для tom,
        // вызов конструктора Person и задаем параметр "Tom"
        tom.display(); // вызов метода display(), что в классе Person
        Person sam = new Employee("Sam", "Oracle"); // создание еще одного объекта sam, выделяем память,
        // но здесь объект sam ссылается на конструктор класса Employee (а объект класса Person может ссылаться
        // на данные класса Employee т.к. класс Employee является подклассом Person)
        sam.display(); // здесь вызывается перезаписанный метод display() в классе Employee, потому что
        // вверху мы  объекту sam указали ссылку на метод display, который находитсья в классе Employee
     }
}






