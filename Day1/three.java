public class three {
    public static void main(String[] args) {
        int a=8;
        int b=8;

        System.out.println(fun3(a,b));
    }

    private static int fun3(int a, int b) {
        if(((a & b) & (a+b))>0){
            return a+fun3(a-2,b-2)+b;
        }

        return a^b;
    }
}
