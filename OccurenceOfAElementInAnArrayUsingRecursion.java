package problems.recursion;

public class OccurrenceOfGivenEelement {
static int countElement(int arr[],int n,int search, int res)
{
	if(n<0)
		return res;
	if(arr[n]==search) 
	 res=res+1; 		
	return countElement(arr, n-1, search,res);
}
public static void main(String[] args) {
	int arr[]= {1000, 10, 2000,90,2000,2000,120};
	int result=countElement(arr,6, 2000,0);
	if(result>=1)
		System.out.println("2000 is Repeated: "+result+" Times");
	else {
		System.out.println("Not Repeated or Found!!");
	}
}
}
