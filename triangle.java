
class triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private double p;
    private boolean isright;
    private int count;

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
        this.count++;
    }
    // isosceles triangle

    public void isosceles(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        this.count++;

    }
    //sides w.r.t x y z

    public void isosceles(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        this.count++;

    }
    // perimeter

    public double perimeter(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        this.count++;
        return this.p = (this.sideA + this.sideB + this.sideC) / 2;

    }
    // isRightAngled

    public boolean isRightAngled(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.count++;
        if (Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) == Math.pow(this.sideC, 2)) {
            return isright = true;
        } else {
            return isright = false;
        }

    }

    //object count
    int objCount() {
        return this.count;
    }

    // to string
    // @Override
  public String toString() {
    return String.format("side A ==> %s side B ==> %s side C ==> %s",sideA, sideB, sideC);
}
    // display

    public void display() {
        System.out.println("side A ==> " + sideA);
        System.out.println("side B ==> " + sideB);
        System.out.println("side C ==> " + sideC);
        System.out.println("perimeter ==> " + p);
        System.out.println("isRightAngle ==> " + isright);
        System.out.println("object count ==> " + count);

    }
}
