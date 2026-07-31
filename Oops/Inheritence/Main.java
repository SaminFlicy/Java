package Oops.Inheritence;

class Animal {
    // public Animal(){
        
    // }

    void eat(){
           System.out.println("Eat from Animal");
    }
}
class Cat extends Animal {
    String name;
    int age;
    String breed;
    public Cat(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;

    }
    void eat(){
           System.out.println("Eat from Cat");
    }
     void makesound(){
           System.out.println("MEAWWWW");
    }
}

// DOG
class DOG extends Animal {
    String name;
    int age;
    String breed;
    public DOG(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;

    }
    void eat(){
           System.out.println("Eat from DOG");
    }
     void makesound(){
           System.out.println("WOOF");
    }
}

public class Main {
     public static void main(String[] args) {
        Cat cat = new Cat("Garlic", 99, "Hybrid");
        System.out.println(cat.name +" "+ cat.age +" "+ cat.breed);

        
}
}
