import java.util.Scanner;

public class Bubble_sort {
    static int i1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        i1= sc.nextInt();
        int arr[]= new int[i1];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Bubble_sort obj= new Bubble_sort();
        obj.sort(arr);
        obj.print(arr);
    }

    public void sort(int A[]){
        for(int round=0;round<(A.length-1);round++){
            for(int i=0;i<(A.length-1-round);i++){
                if(A[i]>A[i+1]){
                    int temp=A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                }
            }
        }
    }

    public void print (int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
