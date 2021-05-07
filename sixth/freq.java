import java.util.*;

class freq
{
	public static void main(String args[])
	{
		int n;  
        Scanner in=new Scanner(System.in); 
        System.out.println("how many element you want to enter ");    
        n=in.nextInt();   
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {   
            arr[i]=in.nextInt();  
        }  
		
        Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

