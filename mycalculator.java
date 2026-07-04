import java.util.Scanner;
public class mycalculator
{
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=2;
        while(i>1){
        System.out.println("My Calculator App");
        System.out.print("type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter first number: ");
                int a=sc.nextInt();
                System.out.println("Enter second number: ");
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("The sum is: "+sum);
                break;
            case 2:
                System.out.print("Enter first number: ");
                int c=sc.nextInt();
                System.out.print("Enter second number: ");
                int d=sc.nextInt();
                int difference=c-d;
                System.out.println("The difference is: "+difference);
                break;
            case 3:
                System.out.print("Enter first number: ");
                int e=sc.nextInt();
                System.out.print("Enter second number: ");
                int f=sc.nextInt();
                int product=e*f;
                System.out.println("The product is: "+product);
                break;
            case 4:
                System.out.print("Enter first number: ");
                int g=sc.nextInt();
                System.out.print("Enter second number: ");
                int h=sc.nextInt();
                if(h!=0)
                {
                    double quotient=(double)g/h;
                    System.out.println("The quotient is: "+quotient);
                }
                else
                {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        i++;
        sc.close();
    }
    }
    
}
