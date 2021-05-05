import java.util.*;
class square { 

    public static void main(String[] args)  
    { 
		System.out.print("Enter number:");
		Scanner in = new Scanner(System.in);
		int num =in.nextInt(); 
		double temp;

		double s = num / 2;

		do {
			temp = s;
			s = (temp + (num/ temp)) / 2;
		} while ((temp - s) != 0);

		System.out.println("Square root is: "+s);
	} 
}