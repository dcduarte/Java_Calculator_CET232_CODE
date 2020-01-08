import java.util.Scanner;
import java.math.MathContext;
public class JAVA_Second_POO {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x,y,total;
        int operation=8,fat=1,cont=1;
        do {
            System.out.println("Choose an operation");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Divide");
            System.out.println("4.Multiply");
            System.out.println("5.Power");
            System.out.println("6.Factorial");
            System.out.println("7.Square Root");
            System.out.println("8.Remainder");
            operation = read.nextInt();


            if(operation==1) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();

                total=x+y;
                System.out.println("The total is "+total);
            }
            else if(operation==2){
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();

                total=x-y;
                System.out.println("The total is "+total);
            }
            else if(operation==3) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();

                total=x/y;
                System.out.println("The total is "+total);
            }
            else if(operation==4) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();

                total=x*y;
                System.out.println("The total is "+total);
            }
            else if(operation==5) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();
                total=Math.pow(x,y);
                System.out.println("The total is "+total);
            }
            else if(operation==6) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                for(int i = 1;i <= x; i++){
                    fat = fat * i;
                }
                System.out.println("The total is "+fat);
            }
            else if(operation==7) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                total=Math.sqrt(x);
                System.out.println("The total is "+total);

            }
            else if(operation==8) {
                System.out.println("Input the first value");
                x = read.nextDouble();
                System.out.println("Input the second value");
                y = read.nextDouble();
                total=x%y;
                System.out.println("The total is "+total);
            }

        }while(operation!=0);
        System.out.println("The program has finished ");
    }

}

