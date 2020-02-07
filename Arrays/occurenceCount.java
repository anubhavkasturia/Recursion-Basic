public class occurenceCount{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,5};
        System.out.println(occurenceelem(0, arr, 5,0));
    
    }
    private static int occurenceelem (int i,int[] arr,int data,int count) {
        if(i==arr.length){
            return count;
        }
        int a;
        if(arr[i]==data){
            a=occurenceelem(i+1,arr,data,count+1);
         }else{
            a=occurenceelem(i+1,arr,data,count);
         }
            
         return a;
    }

}



