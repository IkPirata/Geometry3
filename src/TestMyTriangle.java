public class TestMyTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(new Point(2,3), new Point(3,5), new Point(5,6));
        Triangle t2 = new Triangle(1,1,1,1,1,1);
        Triangle t3 = new Triangle(1,1,1,1,2,1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t1.getPerimeter());
        System.out.println(t2.getPerimeter());
        System.out.println(t3.getPerimeter());
        t2.printType();
        t1.printType();
        t3.printType();
    }
}
