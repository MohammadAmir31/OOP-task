
class trianglePoint {

    private Point p1;
    private Point p2;
    private Point p3;
    private double sideA;
    private double sideB;
    private double sideC;

    //null constructor
    trianglePoint() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    //parametrized constructor
    trianglePoint(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    //copy constructor
    trianglePoint(trianglePoint pt) {
        p1 = new Point(pt.p1);
        p2 = new Point(pt.p2);
        p3 = new Point(pt.p3);
    }

    //setter
    public void set(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //getter
    public Point get_p1() {
        return p1;
    }

    public Point get_p2() {
        return p2;
    }

    public Point get_p3() {
        return p3;
    }

    // form an isosceles triangle
    public void isIsosceles(Point p1, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        double ab = Point.distances(p1, p2);
        double bc = Point.distances(p2, p3);
        double ca = Point.distances(p3, p1);

        if (ab == bc && bc != ca ) {
           this.sideA = ab;
           this.sideB = bc;
           this.sideC = ca;
        } 
        else if (ab == ca && ca != bc ) {
             this.sideA = ab;
           this.sideB = ca;
           this.sideC = bc;
        }
         else if (bc == ca && ca != ab ) {
             this.sideA =ca;
           this.sideB = bc;
           this.sideC = bc;
        }
    }

    // void iso(Point a, Point b, Point c){
    //     double ab = Point.distance( p1 , p2 );
    //     double bc = Point.distance( p2 , p3 );
    //     double ca = Point.distance( p3 , p1 );
    //     System.out.println(ab +" thi"+bc + " "+ca);
    // }
    //Isosceles Triangle
    // public void isIsosceles(){
    //     double ab = Point.distances( p1 , p2 );
    //     double bc = Point.distances( p2 , p3 );
    //     double ca = Point.distances( p3 , p1 );
    //     if(ab==bc || bc==ca || ca==ab){
    //         System.out.println("The triangle is Isosceles");
    //     }else{
    //         System.out.println("The triangle is not Isosceles");
    //     }
    // }
    //Equilateral Triangle
    // public void isEquilateral(){
    //     double ab = Point.distances( p1 , p2 );
    //     double bc = Point.distances( p2 , p3 );
    //     double ca = Point.distances( p3 , p1 );
    //     if(ab==bc && bc==ca){
    //         System.out.println("The triangle is Equilateral ");
    //     }else{
    //         System.out.println("The triangle is not Equilateral ");
    //     }
    // }
    void display() {
        System.out.println("this is p1 " + p1);
        System.out.println("this is p2 " + p2);
        System.out.println("this is p3 " + p3);
        // System.out.println("Isosceles Triangle" + isIsosceles);

    }
}
