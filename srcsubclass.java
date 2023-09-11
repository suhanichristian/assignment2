package assignment;

class Shape1 {
    public void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle1 extends Shape1 {
    public void printShape() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle1 extends Shape1 {
    public void printShape() {
        System.out.println("This is a circular shape");
    }
}

class Square1 extends Rectangle1 {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class srcsubclass {
    public static void main(String[] args) {
        Square1 square = new Square1();
        square.printShape();
        square.printSquare();
    }
}

