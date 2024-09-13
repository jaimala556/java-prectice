public class secondsmallest {
    public static void main(String[] args) {
        int arr1[]={65,7,53,43,23,14};
        System.out.println("second minimum value is : "+secmin(arr1));
    }
    static int secmin(int arr[]){
       int min=arr[0];
       int secmin=+1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            secmin=min;
            min=arr[i];
        }
        if(arr[i]<secmin && arr[i]!=min){
            secmin=arr[i];
        }
       }
       return secmin;
    }
}
