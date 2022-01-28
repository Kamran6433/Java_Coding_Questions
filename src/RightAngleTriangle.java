public class RightAngleTriangle {
    public double opposite; // = 0.0
    public double adjacent; // = 0.0
    public double hypotenuse; // = 0.0
    public double rightAngle = 90;  // = 90.0
    private static int numberOfTriangles;

    private static void RightAngleTriangle() {
        numberOfTriangles++;
    }

    public static void getNumberOfTriangles() {
        System.out.println(numberOfTriangles);
    }

//    RightAngleTriangle(double opposite, double adjacent, double hypotenuse) {
//        this.opposite = opposite;
//        this.adjacent = adjacent;
//        this.hypotenuse = hypotenuse;
//    }

    public double getArea() {
        return (this.opposite * this.adjacent) / 2;
    }

    public double getOpposite() {
        return opposite;
    }

    public void setOpposite(double opposite) {
        this.opposite = (opposite > 0) ? opposite : 0;
        System.out.println("The Opposite has been assigned the length 0. Adjacent needs to be greater than 0");
    }

    public double getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(double adjacent) {
        this.adjacent = (adjacent > 0) ? adjacent : 0;
        System.out.println("The Adjacent has been assigned the length 0. Adjacent needs to be greater than 0");
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = (hypotenuse > 0 && hypotenuse > adjacent && hypotenuse > opposite) ? hypotenuse : 0;
        System.out.println("The Hypotenuse has been assigned the length 0. Hypotenuse needs to be greater than Adjacent and Opposite and greater than 0");
    }
}