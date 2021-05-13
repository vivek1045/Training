import java.io.*;
import java.util.*;

class copy {
	public static void main (String[] args) {
	Vector<Integer> v1=new Vector<>();
	
	v1.add(11);
	v1.add(22);
	v1.add(24);
	v1.add(39);
	
	Vector<Integer> v2=new Vector<>(v1);
		
	for(Integer value: v2){
	System.out.println(value);
	}						
	}
}
