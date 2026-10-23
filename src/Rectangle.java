public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    @Override
    public String toString() {
        /*otra forma return super.toString() + " Width: " + width + ", Heigth; " + height;
        es mejor porque ha usado el de la super clase y así solo hay que cambiar 1 cosa en caso de querelo
        */
        return "(" + getX() + ", " + getY() + ") Width: " + width + ", Heigth; " + height;

    }
    public Rectangle(Point point, int newWidth, int newHeight){
        super(point.getX(), point.getY());
        width = newWidth;
        height = newHeight;
    }
    public Rectangle(Segment segment){
        super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (startPoint.getX() < endPoint.getX()){
            x = startPoint.getX();
            width = endPoint.getX() - startPoint.getX();
        } else {
            x = endPoint.getX();
            width = startPoint.getX() - endPoint.getX();
        }
        if (startPoint.getY() < endPoint.getY()){
            y = startPoint.getY();
            height = endPoint.getY() - startPoint.getY();
        } else {
            y = endPoint.getY();
            height = startPoint.getY() - endPoint.getY();
        }
        setX(x);
        setY(y);

        //setX(segment.getStartPoint().getX() < segment.getEndPoint.getX() ? segment.getStartPoint.getX() : segment.getEndPoint.getX());
        //setY(segment.getStartPoint().getY() < segment.getEndPoint.getY() ? segment.getStartPoint.getY() : segment.getEndPoint.getY());


    }
    public Rectangle(Point p1, Point p2){
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }
}
