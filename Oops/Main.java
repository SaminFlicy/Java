package Oops;
class Student{
    int id;
    String name;
    int age;
    String city;

    Student( int id, String name, int age, String city)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

public class Main {
    
    public static void main(String[] args) {
        Student s1 = new Student(101, "YODU", 20, "New York");
        Student s2 = new Student(102, "Steve", 22, "Los Angeles");
        s1.display();
        s2.display();
    }
}

