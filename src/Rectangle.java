public class Rectangle {

    private Point leftTop;
    private Point rightLower;

    public Rectangle() {
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public void setRightLower(Point rightLower) {
        this.rightLower = rightLower;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightLower() {
        return rightLower;
    }

    public Rectangle(Point leftTop, Point rightLower) {
        this.leftTop = leftTop;
        this.rightLower = rightLower;
    }

    public void areaRectangl() {
        System.out.println("Площадь прямоугольника = "
                + ((rightLower.getPointX() - leftTop.getPointX()) * (leftTop.getPointY() - rightLower.getPointY())));
    }

    public void diagonalRectangle1() {
        System.out.println("Диагональ прямоугольника = "
                +(int) Math.sqrt(Math.pow((rightLower.getPointX() - leftTop.getPointX()), 2)
                + Math.pow((leftTop.getPointY() - rightLower.getPointY()), 2)));
    }
}
