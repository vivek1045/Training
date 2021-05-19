public class t implements Runnable {  
    public void run() {  
        System.out.println("world");  
    }  
    public static void main(String[] args) {  
        t obj = new t();  
        Thread t1= new Thread(obj);  
        t1.start();  
        System.out.println("Hello");  
    }  
}  