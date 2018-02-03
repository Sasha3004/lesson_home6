public class PointDemo {

    public static void main(String[] args) {
        Point point = new Point(1, 1);
        int x = point.getPointX();
        int y = point.getPointY();
        point.setPointX(10);
        point.setPointY(15);

        System.out.println("Растояние до точки = " + (int) point.distance(x, y, point.getPointX(), point.getPointY()));
    }
}
