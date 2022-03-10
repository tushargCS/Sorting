public class Quick_sort {
    public static void main(String[] args) {
            int arr[]= new int[]{44,33,11,55,77,90,40,60,99,22,88,66};
        Quick_sort obj= new Quick_sort();
        obj.Quicksort(arr);
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }
    public static int procedure(int arr[],int left,int right,int loc){
             loc=left;

             while(true){
             while(arr[loc]<=arr[right] && loc!=right){
                 right--;
             }
             if(loc==right){
                 return loc;
             }
             if(arr[loc]>arr[right]){
                 int temp=arr[right];
                 arr[right]=arr[loc];
                 arr[loc]=temp;
                 loc=right;

             }
             while(arr[loc]>=arr[left] && loc!=left){
                 left++;
             }
             if(loc==left){
                 return loc;
             }
             if(arr[loc]<arr[left]){
                 int temp=arr[loc];
                 arr[loc]=arr[left];
                 arr[left]=temp;
                 loc=left;

             }

             }
    }

        public void  Quicksort(int arr[]){
                        int left,right,loc=0;
                        int top=-1;
                        int LOWER[]=new int[10];
                        int UPPER[]=new int[10];

                        if(arr.length>1){
                            top++;
                            LOWER[top]=0;
                            UPPER[top]=(arr.length-1);

                        }
                        while(top!=-1){
                            left=LOWER[top];
                            right=UPPER[top];
                            top--;
                            loc=procedure(arr,left,right,loc);
                            if(left<loc-1){
                                top++;
                                LOWER[top]=left;
                                UPPER[top]=loc-1;
                            }
                            if(loc+1<right){
                                top++;
                                LOWER[top]=loc+1;
                                UPPER[top]=right;
                            }
                        }


          }




}

