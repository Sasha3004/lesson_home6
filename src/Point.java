public class Point {

    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Point() {

    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public double distance(int pointX1,int pointY1,int pointX, int pointY) {
        return (Math.sqrt(Math.pow((pointX1-pointX),2) +Math.pow((pointY1 - pointY),2)));
    }


}
