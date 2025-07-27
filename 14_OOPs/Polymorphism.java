public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 5 and 10: " + calculator.add(5, 10));
        System.out.println("Sum of 5.5 and 10.5: " + calculator.add(5.5f, 10.5f));
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3));

        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        child.display();
    }
}

// Demonstrating method overloading in Java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method overriding example
class Parent {
    void display() {
        System.out.println("Display from Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display from Child class");
    }
}