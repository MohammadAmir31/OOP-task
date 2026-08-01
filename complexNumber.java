public class complexNumber {
    private double real;
    private double imag;
    private double mod;


     complexNumber() {
        this.real = 0;
        this.imag = 0;
    }
     complexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
 
    }
    complexNumber(complexNumber a) {
        this.real = a.real;
        this.imag = a.imag;
     
    }
    //add
    void add( complexNumber c){
        this.real += c.real ;
        this.imag += c.imag ; 
    }

    void sub( complexNumber c){
        this.real -= c.real;
        this.imag -= c.imag; 
    }
    // void modulus(double real, double imag){
    //     this.real = real; 
    //     this.imag = imag;
    //     this.mod = Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag, 2));  
    // }
     void modulus(){
        this.mod = Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag, 2));  
    }
    // @override
    // String toString(){
    //     retrun "(" + this.real + " " + this.imag + "i )"; 
    // }
    void display(){
        System.out.println("real ==> " + real );
        System.out.println("imaginary ==> " + imag );
        System.out.println("modulus ==> " + mod );


    }
    
}
