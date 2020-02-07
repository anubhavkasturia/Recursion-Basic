public class voidReturnPDPI {
    public static void main(String[] args) {
        pdpi(5);
        
    }
    private static void pdpi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdpi(n-1);
        System.out.println(n);
    }
}