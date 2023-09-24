/*Given an integer array arr of size n, you need to sum the elements of arr.
        Input:
        n = 3
        arr[] = {3 2 1}
        Output: 6       */
public class SumOfArrays {
    static  int sum(int arr[]){
        int Sum=0;
        for(int i=0;i< arr.length;i++){
            Sum+=arr[i];
        }
        return Sum;
    }
    public  static  void main(String args[]){
       int arr[]={2,3,4,5,1};
       int ElementsSum=sum(arr);
       System.out.print(ElementsSum);
    }
}
