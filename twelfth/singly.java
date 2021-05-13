import java.util.*;

public class singly {   
    class node{  
        int data;  
        node next;  
          
        public node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  

    public int size;
    public node head = null;  
    public node tail = null;  
       
    public void add(int data) {    
        node newNode = new node(data);  
            
        if(head == null) {   
            head = newNode;  
            tail = newNode;  
        }  
        else {   
            tail.next = newNode;  
            tail = newNode;  
        }  
        size++;
    } 
public void addmid(int data){   
    node newNode = new node(data);  
         
    if(head == null) {  
        head = newNode;  
        tail = newNode;  
    }  
    else {  
        node temp, current;  
        int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
        temp = head;  
        current = null;  

        for(int i = 0; i < count; i++) {   
            current = temp;    
            temp = temp.next;  
        }  
        current.next = newNode;  
        newNode.next = temp;  
    }  
    size++;  
}  
public void removedup() {  
    node current = head, index = null, temp = null;  
      
    if(head == null) {  
        return;  
    }  
    else {  
        while(current != null){    
            temp = current;    
            index = current.next;  
            while(index != null) {  
                if(current.data == index.data) {  
             
                    temp.next = index.next;  
                }  
                else {  
                    temp = index;  
                }  
                index = index.next;  
            }  
            current = current.next;  
        }          
    }  
}  
/*public void deleteEnd() {  
        
    if(head == null) {  
        System.out.println("empty");  
        return;  
    }  
    else {   
        if(head != tail ) {  
            node current = head;  
            while(current.next != tail) {  
                current = current.next;  
            }  
            tail = current;  
            tail.next = null;  
        }  
        else {  
            head = tail = null;  
        }  
    } 
    size--; 
}   */
public boolean search(int x)
    {
        node current = head;   
        while (current != null)
        {
            if (current.data == x)
                return true; 
            current = current.next;
        }
        return false; 
    }
public void dis() {   
    node current = head;  
        
    if(head == null) {  
        System.out.println("empty");  
        return;  
    }  
    System.out.println("singly linked list: ");  
    while(current != null) {   
        System.out.print(current.data + " ");  
        current = current.next;  
    }  
    System.out.println();  
}  
      
    public static void main(String[] args) throws Exception {  
          
        singly s = new singly();    
        s.add(11);  
        s.add(22);  
        s.add(33);  
        s.add(44);  
        s.add(55);
        s.add(33);
        s.addmid(66);
        s.removedup();
        //s.deleteEnd();
        boolean a=s.search(22);
        System.out.println(a);
        s.dis();  
    }  
} 