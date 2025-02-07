public class OptimizedGridCount {
    public static int countWays(int n, int m){
        int up=(n+m)-2;
        int down1=n-1;
        int down2=m-1;

        int upfact=factorial(up);
        int down1Fact=factorial(down1);
        int down2Fact=factorial(down2);

        return upfact/(down1Fact * down2Fact);

    }
    public static int factorial(int value){
        if(value==1){
            return 1;
        }
        return value*factorial(value-1);
    }
    public static void main(String []args){
        int n=3,m=3;
        System.out.println(countWays(n,m));
    }
}
