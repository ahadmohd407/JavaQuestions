class Solution
{
    //Function to find two repeated elements.
    public Pair twoRepeated(int arr[], int N)
    {
        int k=0;
        int arr1[]=new int[2];
        int count[]=new int[N];
        for(int i=0;i<N;i++)
        {
            if(count[arr[i]]==1)
            arr1[k++]=arr[i];
            else
            count[arr[i]]++;
        }
        return arr1
    }
}
