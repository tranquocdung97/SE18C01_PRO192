import java.util.ArrayList;
import java.util.List;

public class PolyLine3 {
    private List<Point3> points;

    public PolyLine3() {
        points = new ArrayList<Point3>();
    }

    public PolyLine3(List<Point3> points) {
        this.points = points;
    }

    public void appendPoint(Point3 point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point3(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}