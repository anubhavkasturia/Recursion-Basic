
public class display{
    

public static void main(String[] args) {
    int[]arr={1,2,3,4,5};
    display1(0, arr);
    
}
private static void display1(int i,int[] arr1){
    if(i==arr1.length){
        return ;
    }
    System.out.println(arr1[i]);
    display1(i+1,arr1);
    }
}
