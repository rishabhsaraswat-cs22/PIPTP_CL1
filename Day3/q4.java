import java.util.*;
public class q4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println(help(2,7));
    }
    public static int help(int x, int y) {
        if(x==y){
            return x*y;
        }
        return help(x,(x+y)/2)+help((x+y)/2+1,y);
    }
}
