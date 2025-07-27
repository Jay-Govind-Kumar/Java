public class Interfaces {
    public static void main(String[] args) {
        ChessPlayer king = new King();
        ChessPlayer queen = new Queen();
        ChessPlayer bishop = new Bishop();

        king.localName();
        king.moves();

        queen.localName();
        queen.moves();

        bishop.localName();
        bishop.moves();
    }

}

interface ChessPlayer {
    void localName();

    void moves();
}

class King implements ChessPlayer {
    public void localName() {
        System.out.println("Raja ");
    }

    public void moves() {
        System.out.println("up, down, left, right, diagonally (one square in any direction) ");
    }
}

class Queen implements ChessPlayer {
    public void localName() {
        System.out.println("Rani ");
    }

    public void moves() {
        System.out.println("up, down, left, right, diagonally (any number of squares) ");
    }
}

class Bishop implements ChessPlayer {
    public void localName() {
        System.out.println("Wazir ");
    }

    public void moves() {
        System.out.println("diagonally (any number of squares) ");
    }
}