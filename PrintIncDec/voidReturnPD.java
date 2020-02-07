
public class voidReturnPD{
   public static void main(String args[]) {
       pd(5);
       
   }
    private static void pd(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);
        
        
        }


}

