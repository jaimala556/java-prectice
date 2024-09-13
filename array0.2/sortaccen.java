
public class sortaccen {
    public static void main(String[] args) {
        int arr[] = { 10, 8, 9, 4, 3, 5 };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i ]) {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i : arr) {

            System.out.println(i);
        }
    }

}
