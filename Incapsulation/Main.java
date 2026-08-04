package Incapsulation;
class Student{
     private int id;
     private String name;
     private int age;
     private String city;
     
     public Student(int id, String name, int age, String city) {
          this.id = id;
          this.name = name;
          this.age = age;
          this.city = city;
     }
     
     public int getId() {
          return id;
     }
     
     public void setId(int id) {
          this.id = id;
     }
     
     public String getName() {
          return name;
     }
     
     public void setName(String name) {
          this.name = name;
     }
     
     public int getAge() {
          return age;
     }
     
     public void setAge(int age) {
          this.age = age;
     }
     
     public String getCity() {
          return city;
     }
     
     public void setCity(String city) {
          this.city = city;
     }
 
}
public class Main {
     public static void main(String[] args) {
          Student s1 = new Student(101, "YODU", 20, "New York");
          Student s2 = new Student(102, "Steve", 22, "Los Angeles");
          
          System.out.println("Student 1: ID: " + s1.getId() + ", Name: " + s1.getName() + ", Age: " + s1.getAge() + ", City: " + s1.getCity());
          System.out.println("Student 2: ID: " + s2.getId() + ", Name: " + s2.getName() + ", Age: " + s2.getAge() + ", City: " + s2.getCity());

}
}