class pt extends Thread{  
    public void run(){  
      System.out.println("running thread name is:"+Thread.currentThread().getName());  
      System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
     
     }  
    public static void main(String args[]){  
     TestMultiPriority1 t1=new TestMultiPriority1();  
     TestMultiPriority1 t2=new TestMultiPriority1();  
     t1.setPriority(5);  
     t2.setPriority(10);  
     t1.start();  
     t2.start();  
      
    }  
   }     