public class voidReturnPI{
    public static void main(String[] args) {
        pi(5);        
    }
    private static void pi(int n) {
        if(n==0){
            return;
        }
        pi(n-1);
        System.out.println(n);
        
    }
}
