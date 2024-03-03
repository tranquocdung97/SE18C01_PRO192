
public class Bt7 {

    private double x;
    private double y;

    public Bt7() {
    }

    public Bt7(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Bt7 another) {
        return distance(another.getX(), another.getY());
    }
}

class Entry7 {

    public static void main(String[] args) {
        Bt7 p1 = new Bt7(1.5, 6.7);
        Bt7 p2 = new Bt7(2.8, 3.2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.34, 7.8));
    }
}
