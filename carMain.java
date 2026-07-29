public class carMain{
    public static void main(String[] args) {
        car tesla= new car(false, 0, 18);
        tesla.on_off(false);
        tesla.drive();
        tesla.direction("r");
        tesla.display();
    }
}