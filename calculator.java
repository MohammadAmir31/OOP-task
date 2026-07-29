class calculator {
    private double num1;
    private double num2;
    private double result;
    private double ans;
      // null constructor 
     public calculator(){
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
      }   
      // parametrized constructor
      public calculator(double num1, double num2, double result){
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
      }
      // main features
      public double solve(double num1, double num2, char op){
        this.num1 = num1;
        this.num2 = num2;

        if (op == '+'){
            this.result = this.num1 + this.num2;
            this.ans = this.result;
            return this.result ;
        }
        else if (op == '-'){
            this.result = this.num1 - this.num2;
            this.ans = this.result;
            return this.result ;
        }
            
        else if (op == '*'){
           this.result = this.num1 * this.num2;
            this.ans = this.result;
            return this.result ;
        } 
        else if (op == '/') {
            if(this.num2 == 0){
                System.out.println("undefined");
            }
            else{
               this.result = this.num1 / this.num2;
            this.ans = this.result;
            return this.result ;
            }
        }
        else{
                System.out.println("invalid operator");

        }
        return this.result = 0;
        
      }
      public void contSolve(double num2, char op){
        solve(ans,num2,op);
      }
      // display
      public void display(){
        System.out.println("result ==> " + this.result);
      }
}
