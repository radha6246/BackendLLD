package oops;

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
        Square S1= new Square();
        S1.side=5;
        S1.getarea();
        Rectangle S3= new Rectangle();
        S3.height=9;
        S3.width=9;
        S3.topLeft=new Point(2,3);
        S3.getArea();
        System.out.println(S3.getBottomright().getX());
        System.out.println(S3.getPerimeter());

    }
}