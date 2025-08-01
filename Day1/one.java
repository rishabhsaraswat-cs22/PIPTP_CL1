import java.util.*;
public class one {
     public static void fun(int w,int x){
        if(w%x==0 || x%w==0){
            System.out.println(1);
            // System.out.println(1);
        }
        else{
            System.out.println(10);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();

        fun(w,x);
    }
}
