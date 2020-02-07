public class returnMax{
    public static void main(String args[]) {
        int arr[]={1,2,333,45,56};
        System.out.println(maxpr(arr,0,Integer.MIN_VALUE));
        
        
    }
    private static int maxpr(int[]a,int i ,int max) {
        
        if(i==a.length){
            return max;
        }
        if(a[i]>max){
            max=a[i];
        }
        int maxans=maxpr(a, i+1, max);
        return maxans;
    }
}