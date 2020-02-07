public class returnMin{
    public static void main(String args[]) {
        int arr[]={1,2,333,45,56};
        System.out.println(minpr(arr,0,Integer.MAX_VALUE));
        
        
    }
    private static int minpr(int[]a,int i ,int min) {
        
        if(i==a.length){
            return min;
        }
        if(a[i]<min){
            min=a[i];
        }
        int minans=minpr(a, i+1, min);
        return minans;
    }
}