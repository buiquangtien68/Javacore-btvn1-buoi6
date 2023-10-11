public class Square extends Rectangle {
    private double side;

    public Square() {
    }
    public Square( double side) {
        length=width=this.side=side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
