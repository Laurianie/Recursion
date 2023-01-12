public class RunMyProgram {

    public int num;
    public int num1;
    public int num2;
    public int num3;

    public static void main(String[] args) {
            RunMyProgram p = new RunMyProgram();
            p.recursiveMethod(4);
            System.out.println("factorial of 4 = " + p.num);
            System.out.println("fibonacci sequence for the 3rd term starting at 9 is: " + p.fibonacci(9));
            p.chomp(3, 2, 1);

    }

    public void recursiveMethod (int n){
        System.out.println(num);
        num = n;
            if (n == 1) {
               num = 1;
            }
            else{
                recursiveMethod(n-1);
                num = num*n;
            }
        System.out.println(num);
    }

    public int fibonacci (int m){
            if (m == 1 || m == 0){
                return m;
            }
            else{
                return fibonacci(m-1) + fibonacci(m-2);
            }
    }

    public void chomp (int c, int d, int e){
        num1 = c;
        num2 = d;
        num3 = e;

        if (c <= 3){
            if (d <= e){
                if (e <= 0){
                    System.out.println("The CHOMP bards are: " + c + "" + d + "" + e);
                }
            }
        }
        else {
            chomp (c+1, d+1, e+1);
        }

    }
}

