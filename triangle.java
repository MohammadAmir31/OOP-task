
class triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private double p;
    private boolean isright;

    public triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
    }
    // equilater triangle

    public void equilater(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
    }
    // isosceles triangle

    public void isosceles(double x, double y) {
        this.sideA = x;
        this.sideB = x;
    }
    //sides w.r.t x y z

    public void isosceles(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
    }
    // perimeter

    public double perimeter(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        return this.p = (this.sideA + this.sideB + this.sideC) / 2;
    }
    // isRightAngled

    public boolean isRightAngled(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        if(Math.pow(this.sideA , 2) + Math.pow(this.sideB , 2) == Math.pow(this.sideC , 2)){
            return isright = true;
        }
        else{
            return isright = false;
        }

    }
    // display

    public void display() {
        System.out.println("side A ==> " + sideA);
        System.out.println("side B ==> " + sideB);
        System.out.println("side C ==> " + sideC);
        System.out.println("perimeter ==> " + p);
        System.out.println("isRightAngle ==> " + isright);


    }
}
