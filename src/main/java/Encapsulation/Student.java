package Encapsulation;

public class Student {
    String name;
    int age;
    int marks;

    public void greet() {
        System.out.println("Hi, my name is " + this.name + " I got " + this.marks + " marks");
    }

    public static void main(String[] args) {
        Student radha = new Student();
        radha.name = "radha";
        radha.age = 12;
        radha.marks = 55;
        radha.greet();
    }
}