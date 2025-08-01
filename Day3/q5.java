import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        help(n);
    }
    public static void help(int n) {
        if (n == 1) {
            System.out.print("1 ");
            return;
        }
    
        help(n - 1);
        System.out.print(n + " ");
        help(n - 1);
    }
}
