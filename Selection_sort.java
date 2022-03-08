import java.util.Scanner;

public class Selection_sort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
       int arr[]= new int[i];
       for(int j=0;j<arr.length;j++){
           arr[j]=sc.nextInt();
       }


     for(int index=0;index<=(arr.length-2);index++){

           int LOL=min(arr,index);
           int temp=arr[index];
           arr[index]=arr[LOL];
           arr[LOL]=temp;

     }

       for (int k=0;k< arr.length;k++){
           System.out.println(arr[k]);
       }

    }
    public static int min(int arr[],int index){
            int min=arr[index];
        for(int i1=(index+1);i1<=(arr.length-1);i1++){
            if(min>arr[i1]){
                min=arr[i1];
                index=i1;
            }
        }
        return index;
    }


}
