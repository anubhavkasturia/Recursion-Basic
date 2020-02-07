public class lastoccurence{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,4};
        System.out.println(occurenceLast(0, arr, 4));

    }
    private static int occurenceLast(int i,int[]arr,int data) {
        if(i==arr.length){
            return -1;
        }
        
        int found=occurenceLast(i+1, arr, data);
        if(arr[i]==data && found==-1){
            return i;
        }
        else return found;    
    }
}