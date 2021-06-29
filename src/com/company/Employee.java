package com.company;

public class Employee extends Person  {
    private String company; // создание переменной company типа String
    public Employee(String name, String company) //задаем конструктор класса Employee с параметрами
    {
        super(name);
        this.company=company;
    }
    public void work() //создаем не возвращаемый метод без параметров
    {
        System.out.printf("%s работает в  \n", getName(), company);
    }
    @Override // переопределени метода(это значит внести новые данные в метод родительского класса без ущерба его собственных данных
    public void display(){
        super.display(); // С помощью ключевого слова super мы также можем обратиться к реализации методов базового класса.
        System.out.printf("работает в  \n", company);
    }
}
