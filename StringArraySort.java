public class StringArraySort {

    public static String[] mergeSort(String arr[],int s,int e){

        if(s==e){

          String [] A = {arr[e]};
            return A;
        }
        int mid = (s+e)/2;

         String arr1[] = mergeSort(arr, s, mid);
         String arr2[] = mergeSort(arr, mid+1, e);
         String arr3[] = merge(arr1, arr2);
         return arr3;

    }
    public static String[] merge(String[] arr1, String arr2[] ){
      
    
      int n = arr2.length;
      int m = arr1.length;
   String arr3[] = new String[m+n];
   int i=0;
   int j = 0;
   int k=0;
      while(i<m && j<n){
        if(compare(arr1[i], arr2[j])){
             arr3[k]=arr1[i];
            i++;
        }
        else{
            arr3[k] = arr2[j];
            j++;
        }
        k++;
      }
      while(i<m)
      {
        arr3[k++] = arr2[i++];
      }
      while(j<n)
      {
        arr3[k++] = arr2[j++];
      }

     return arr3;

    }
   public static boolean compare(String s1,String s2){
     if( s1.compareTo(s2)<0){
        return true;
     }
     
        return false;
     
   }


    public static void main(String args[]){
        String arr[] = { "sun", "earth", "mars", "mercury"};
        int s= 0;
        int e = arr.length;
       
       String[] a = mergeSort(arr,s,e);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+a[i]);
        }

    }
    
}
