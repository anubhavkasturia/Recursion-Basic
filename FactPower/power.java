public class power{
    public static void main(String args[]) {
        int a=power1(2,3);
        System.out.println(a);
    }
    private static int power1(int n,int p) {

        if(p==0){
            return 1;
        }
        
        
        int pownm1=power1(n,p-1);
        int ans=pownm1*n;
        
        return ans;

        
        
        
    }
}