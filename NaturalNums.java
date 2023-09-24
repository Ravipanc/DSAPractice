// Print N Natural Numbers using Recursion
public class NaturalNums {
    static void Natural(int n){
        if(n==1){
            System.out.print(1 +" ");
            return;
        }
        Natural(n-1);
        System.out.print(n + " ");
    }
    public static  void main(String args[]){
        int n=5;
        Natural(5);

    }
}
