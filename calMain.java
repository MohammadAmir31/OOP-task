import java.util.*;
public class calMain {
    public static void main(String[] args){
        calculator casio = new calculator ();
        casio.solve(15,3,'/');
        casio.contSolve(5,'+');
        casio.contSolve(2,'-');
        casio.display();
    }
}
