public class Kth_Symbol_in_Grammar{
    public static void main(String[] args) {
       int c=solved(4,4);
        System.out.println(c);

    }
    public static int solved(int n,int k){
        if(n==1 && k==1){
            return 0;
        }
        int mid=(power(n-1)/2);
        if(k<=mid){
            return solved(n-1,k);
        }
        else{
            return 1^solved(n-1,k-mid);
        }
    }
    public static int power(int n){
        if(n==0)return 1;
        int a1=1;
       for(int i=1;i<=n;i++){
           a1=2*a1;
       }
       return a1;
    }
}
