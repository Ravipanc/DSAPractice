//Print N Natural number in reverse Order using Recursion
public class ReverseNatural {
    static void RevNatural(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        RevNatural(n-1);

    }
    public static  void main(String args[]){
        int n=5;
        RevNatural(5);

    }
}
