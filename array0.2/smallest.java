public class smallest {
    public static void main(String[] args) {
        int arr1[]={32,65,87,98,54,23};
        System.out.println("smallest element : "+small(arr1));
    }
    static int small(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
}
