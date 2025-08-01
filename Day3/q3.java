import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println(help(2,3));
    }
    public static int help(int x,int y){
        if(y==0 || x==y){
            return 1;
        }
        return help(x-1,y-1) + help(x-1,y);
    }
}
