public class Main {
    public static void main(String[] args) {
        System.out.println("Chu vi và diện tích của hình chữ nhật:");
        Rectangle rectangle=new Rectangle(2,2);
        rectangle.getPerimeter(rectangle);
        rectangle.getAcreage(rectangle);
        System.out.println();

        System.out.println("Chu vi và diện tích của hình vuông:");
        Square square=new Square(5);
        square.getPerimeter(square);
        square.getAcreage(square);
        System.out.println();

        System.out.println("Thông tin của các hình là: ");
        System.out.println(rectangle);
        System.out.println(square);
    }
}
