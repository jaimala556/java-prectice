public class checkarraysort {
    public static void main(String[] args) {
        int arr1[]={32,76,21,98,65};
        System.out.println(checkarry(arr1));
    }
    static boolean    checkarry(int arr[]){
        for(int i=1;i<arr.length;i++)
        
        {
            if(arr[i]>=arr[i-1])
                return false;
            }
            return true;
        }
    }

