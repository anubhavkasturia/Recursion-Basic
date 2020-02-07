public class occurences{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        System.out.println(occurenceelem(0, arr, 4));
    
    }
    private static boolean occurenceelem (int i,int[] arr,int data) {
        if(i==arr.length){
            return false;
        }
        if(arr[i]==data){
            return true;
         }
        
            boolean a=occurenceelem(i+1,arr,data);
            return a;

    }

}

