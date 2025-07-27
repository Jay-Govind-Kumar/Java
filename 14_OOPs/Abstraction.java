public class Abstraction {
    public static void main(String[] args) {
        Fiction fiction = new Fiction();
        fiction.name();
        System.out.println(fiction.author);
        fiction.changeAuthor();
        System.out.println(fiction.author);
               
    }
}

abstract class Book {
    String author;

    abstract void name();

    Book() {
        author = "Unknown Author";
    }

}

class Fiction extends Book {
    void name() {
        System.out.println("Fiction Book");
    }

    void changeAuthor() {
        author = "New Author";
    }

}