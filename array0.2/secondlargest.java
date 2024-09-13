public class secondlargest {
    public static void main(String[] args) {
        int arr1[]={54,6,78,9,82,43};
        System.out.println("second largest elesment is :"+seclargest(arr1));
    }
    static int seclargest(int arr[]){
       int  largest=arr[0];
       int seclarge=-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            seclarge=largest;
            largest=arr[i];            
        }
        if(arr[i]>seclarge && arr[i]!=largest)
        {
            seclarge=arr[i];
        }
       }
       return seclarge;
    }
}



