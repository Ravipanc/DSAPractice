public class SumNatural {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(sum(n) + " ");
    }
}
