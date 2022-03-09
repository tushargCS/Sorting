import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Insertion_sort obj= new Insertion_sort();
        obj.sort(arr);

    }


    public void sort(int arr[]){
        int temp,j;
        for(int i=1;i<=arr.length-1;i++){
            temp=arr[i];
            for(j=i-1;j>=0 && temp<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
