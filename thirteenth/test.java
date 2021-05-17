import java.io.*;

 class Employee implements java.io.Serializable {
	 String name;
	 int age;

	public Employee(String n,int a) {
		this.name = n;
		this.age = a;
	}
}

class test{
	public static void main(String[] args) {
		Employee emp = new Employee("vivek",21);

		try {
			FileOutputStream fos = new FileOutputStream("a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Done");
	
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Employee emp1=null;
		try{
			FileInputStream file = new FileInputStream("a.txt");
            ObjectInputStream in = new ObjectInputStream(file);  
		emp1=(Employee)in.readObject();  
	   
		System.out.println(emp1.name+" "+emp1.age);  
	  
		in.close(); }
		catch(IOException e){
			e.printStackTrace();
		} 
	}
}
