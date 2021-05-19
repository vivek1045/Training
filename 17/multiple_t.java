
class t_m extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
public class multiple_t {
	public static void main(String[] args)
	{
		int n = 3; 
		for (int i = 0; i < n; i++) 
        {
			t_m obj= new t_m();
			obj.start();
		}
	}
}
