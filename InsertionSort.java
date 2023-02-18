public class InsertionSort {
    public static void main(String args[]) {

        int arr[]={5,4,65,23,02,8};
//int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            int  min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min=j;
                  //  arr[i]=min;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }

                for(int i=0;i<arr.length;i++){
                    System.out.print(" "+arr[i]);
                }

    }
    
}
