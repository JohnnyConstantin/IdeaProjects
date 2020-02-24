package com.company;

abstract class Person {

    public int age;
    public String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public void setAge (int age){
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString () {
            return ("(" + name + ", " + age + ")");
        }

    public String work() {
        return ("None");
    }
}
class Employee extends Person {
    public String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public String toString() {
        return ("(" + name + ", " + age + ", " + company + ")");
    }
    @Override
    public String work(){
        return ("Manager");
    }
}


public class  Main {
    public static void main(String[] args) {
        Person p = new Person("Test", 3);
        System.out.println(p);
        p.setAge(5);
        p.setName("Vasya");
        System.out.println(p);
        System.out.println(p.work());
        Employee e = new Employee("1", 2, "3");
        System.out.println(e);
        System.out.println(e.work());

        Amount amount1 = new Amount();

    }
}