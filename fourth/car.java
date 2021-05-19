import java.util.*;

public class car {
	String name;
	String model;
	int year;
	float price;
	
	public car(String name, String model, int year, float price) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void sale()
	{
		System.out.print("Please Enter the Year Of sale: ");
		Scanner in = new Scanner(System.in);
		int yos = in.nextInt();
		float price = this.price;
		if(year>yos){
			System.out.println("Please Enter Valid Year");
		}
		else 
		{
			int yot = yos-year;
			for(int i=1;i<=yot;i++)
			{
				  price -=(price*10)/100;
			}
			if(price<=((price*20))/100)
			{
				System.out.println("You Can't Sell The Car");
			}
			else {
			System.out.println("Car Name: "+name);
			System.out.println("Model Of Car: "+model);
			System.out.println("Year Of Purchase: "+year);
			System.out.println("Price Of Car: "+price);
			System.out.println("The Selling Price is: "+price);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("The Car Name: ");
		String name = in.nextLine();
		System.out.print("The Model Of Car: ");
		String model = in.nextLine();
		System.out.print("Year Of Purchase: ");
		int year = in.nextInt();
		System.out.print("Price Of Car: ");
		float price = in.nextFloat();
		car obj = new car(name, model, year, price);
		obj.sale();
		}
}