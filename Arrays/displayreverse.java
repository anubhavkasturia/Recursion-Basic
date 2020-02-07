
public class displayreverse{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        displayrev1(0,arr);
        
    }
    private static void displayrev1(int i,int[]arr) {

        if(i==arr.length){
            return;
        }

        displayrev1(i+1, arr);
        System.out.println(arr[i]);
        
    }
}