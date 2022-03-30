public class MergeSort {
    public static void main(String[] args) {
    int arr[]= new int[]{12,8,24,17,33,71,10,48,4,21,6};
    Merge_Sort obj= new Merge_Sort();
     obj.Sort(arr);
      for (int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
    }
    public void Sort(int arr[]){
        int l=1;
        int B[]=new int[arr.length];
        while(l<arr.length){
               mergePass(arr,l,B);
               mergePass(B,2*l,arr);
               l=l*4;
        }

    }
    public void mergePass(int arr[],int l,int B[]){
        int p=arr.length/(l*2);
        int elements=p*2*l;
        int left= arr.length-elements;
        int lb;

        for(int j=0;j<p;j++){
            lb=(2*j)*l;
            merge(arr,l,lb,arr,l,lb+l,B,lb);
        }
        if(left<=l){
            for(int j=0;j<left;j++){
                B[elements+j]=arr[elements+j];
            }
        }
        else{
            merge(arr,l,elements,arr,left-l,elements+l,B,elements);
        }
    }
    public void merge(int A[],int n1,int index1,int B[],int n2,int index2,int C[],int index){

        while(n1!=0&&n2!=0){
            if(A[index1]<B[index2]){
                C[index]=A[index1];
                index++;
                index1++;
                n1--;
            }
            else {
                C[index]=B[index2];
                index++;
                index2++;
                n2--;
            }
        }
        while(n1!=0){
            C[index]=A[index1];
            index++;
            index1++;
            n1--;
        }
        while (n2!=0){
            C[index]=B[index2];
            index2++;
            index++;
            n2--;
        }



    }

}
