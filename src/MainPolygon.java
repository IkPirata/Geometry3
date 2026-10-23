public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(9,1);
        points[1] = new Point(3,5);
        points[2] = new Point(2,6);
        points[3] = new Point(5,2);
        Polygon p = new Polygon(points);
        p.setOffset(4,4);//el offset sirve para que se desplacen
        System.out.println(p.getLength());
        System.out.println(p);
    }
}
