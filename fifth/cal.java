import java.util.*;

public class cal{
    public static void main(String[] args) {

    	double num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num:");
        num1 = in.nextDouble();
        System.out.print("Enter second num:");
        num2 = in.nextDouble();

        System.out.print("Enter an operator +, -, *, / ");
        char ope = in.next().charAt(0);

        double output;

        switch(ope)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.printf(" wrong operator");
                return;
        }

        System.out.println(num1+" "+ope+" "+num2+": "+output);
    }
}