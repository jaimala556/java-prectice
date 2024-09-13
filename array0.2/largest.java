public class largest {
    public static void main(String[] args) {
        int arr1[]={1,2,9,17,6};
        System.out.println("The largest element in array is : "+largestElement(arr1));
        int arr2[]={5,19,6,7,4};
        System.out.println("The largest element in array is : "+largestElement(arr2));
    }
    static int largestElement(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
{
        if(arr[i]>max)
            max=arr[i];
        
}   
    return max; }

    }

