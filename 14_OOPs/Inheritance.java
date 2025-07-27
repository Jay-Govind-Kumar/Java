public class Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.name = "Nemo";
        f1.swim();
        f1.eat();
        f1.sleep();
        System.out.println(f1.name + " is a Fish");
        System.out.println("-------------------------");

        Bird b1 = new Bird();
        b1.name = "Tweety";
        b1.fly();
        b1.eat();
        b1.sleep();
        System.out.println(b1.name + " is a Bird");
        System.out.println("-------------------------");

        Mammal m1 = new Mammal();
        m1.name = "Leo";
        m1.walk();
        m1.eat();
        m1.sleep();
        System.out.println(m1.name + " is a Mammal");
        System.out.println("-------------------------");

        Goldfish g1 = new Goldfish();
        g1.name = "Goldie";
        g1.swim();
        g1.eat();
        g1.sleep();
        System.out.println(g1.name + " is a Goldfish");
        System.out.println("-------------------------");

        Sparrow s1 = new Sparrow();
        s1.name = "Jack";
        s1.chirp();
        s1.fly();
        s1.eat();
        s1.sleep();
        System.out.println(s1.name + " is a Sparrow");
        System.out.println("-------------------------");

        Dog d1 = new Dog();
        d1.name = "Fido";
        d1.bark();
        d1.eat();
        d1.sleep();
        System.out.println(d1.name + " is a Dog");
        System.out.println("-------------------------");

        Cat c1 = new Cat();
        c1.name = "Whiskers";
        c1.meow();
        c1.eat();
        c1.sleep();
        System.out.println(c1.name + " is a Cat");
        System.out.println("-------------------------");
    }
}

// Base class
class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Derived class of Animal
class Fish extends Animal {
    void swim() {
        System.out.println(name + " is swimming");
    }
}

// Derived class of Animal
class Bird extends Animal {
    void fly() {
        System.out.println(name + " is flying");
    }
}

// Derived class of Animal
class Mammal extends Animal {
    void walk() {
        System.out.println(name + " Mammal is walking");
    }
}

// Derived class of Fish
class Goldfish extends Fish {
    void swim() {
        System.out.println("Goldfish is swimming gracefully");
    }
}

// Derived class of Bird
class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow is chirping");
    }
}

// Derived class of Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class of Mammal
class Cat extends Mammal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}