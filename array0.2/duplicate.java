public class duplicate {
    public static void main(String[] args) {

    
    }
}

class duplicate1 {
    void swap(int a, int b, int arr[]) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                swap(i - 1, i, arr);
        }
    }

    void find_up_duplicate(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                System.out.println(i);
        }
    }

}
