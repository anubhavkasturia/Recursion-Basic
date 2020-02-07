public class firstoccurence{
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,4};
        System.out.println(occurenceFirst(0, arr, 4));

    }
    private static int occurenceFirst(int i,int[]arr,int data) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==data){
            return i;
        }
        int a=occurenceFirst(i+1, arr, data);
        return a;
        }
}