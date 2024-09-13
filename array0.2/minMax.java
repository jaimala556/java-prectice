import java.util.*;

public class minMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("AEnter size");
        int Size=sc.nextInt();
        int arr[]=new int[Size];
        System.out.println("terms are");
        
        for(int i=0;i<Size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<min){
            min=arr[i];
           }
           if(arr[i]>max){
           max=arr[i];
           }
        }
        System.out.println(max);
       System.out.println(min);
    }
}


// import java.util.*;

// public class min{

//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }


//       int max = Integer.MIN_VALUE;
//       int min = Integer.MAX_VALUE;
     
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//             }
//             if(numbers[i] > max) {
//                 max = numbers[i];
//             }
//         }
//         System.out.println(max);
//         System.out.println(min);
//     }}

