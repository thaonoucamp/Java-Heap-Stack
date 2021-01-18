package heap;

public class Square {
    public void area() {
        System.out.println("Chu vi");
    }

    public static void hello(Square square) {
        String s = "Hello";
        System.out.println(s);

        square.area();
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        Square square = new Square();
        hello(square);
    }
}
