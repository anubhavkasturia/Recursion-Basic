public class factorial{
    public static void main(String args[]) {
        int a= factorial1(5);
        System.out.println(a);
    }
    private static int factorial1(int n) {
        
        if(n==0){
            return 1;
        }
        
        int ans=factorial1(n-1);
        int cans=ans*n;
        
        
        return cans;
    }
}