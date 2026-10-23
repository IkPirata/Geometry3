public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(){
        //Inicializamos atributos en este constructor
        startPoint = new Point();
        endPoint = new Point();//ya tienen el x=0 y y=0
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    public double getModule(){
        int c1, c2;
        c1 = endPoint.getX() - startPoint.getX();
        c2 =  endPoint.getY() - startPoint.getY();
        double module = Math.sqrt(c1 * c1 + c2 * c2);
        return module;
    }

    @Override//le dice al compilador que vamos a redefinir un metodo de la superclase
    public String toString() {
        //otra forma: return startPoint.toString() + "-" + endPoint.toString();
        //return startPoint + "-" + endPoint;
        return "(" + startPoint.getX() + "," + startPoint.getY() + ")" + "-" + "(" + endPoint.getX() + "," + endPoint.getY() + ")";
    }

    public void setOffset(int offX,int offY){
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);
    }
    public void setStartPoint(){

    }
    public void setEndPoint(){

    }
    public Point getStartPoint(){
        return startPoint;
    }
    public Point getEndPoint(){
        return endPoint;
    }//<--click derecho, generate ,getter ,seleccionar start y end
}
