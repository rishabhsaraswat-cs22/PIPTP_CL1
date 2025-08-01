import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(help(n));
    }
    public static int help(int n) {
        if(n<=1){
            return n;
        }
        if(n%2==0){
            return n+help(n/2);
        }
        else{
            return (help(n+1)/2)+(help(n-1)/2);
        }
    }
}
