import java.util.*;
public class GFG {
	public static void main (String[] args) {
	    int arr[]={2,13,4,1,3,6,28};
	    int first=arr[0],second=-1*(int)Math.pow(2,31),third=-1*(int)Math.pow(2,31);
	    for(int i=1;i<7;i++)
	    {
	        if(arr[i]>first)
	        {
	            
	            third=second;
	            second=first;
	            first=arr[i];
	            
	        }
	        else if(arr[i]>second)
	        {
	            third=second;
	            second=arr[i];
	        }
	        else if(arr[i]>third)
	        {
	            third=arr[i];
	        }
	    }
	    System.out.println("FIRST:"+first+"\nSECOND:"+second+"\nTHIRD:"+third);
}
}
