public class SortArrayByUsingDiffSortAlgos {

    // Descending Order

       public static void  Bubble(int arr[]) { // COMPARE ADJACENT ELEMENTS
        // System.out.println();
         System.out.println();
         System.out.println(" Bubble Sort ");
         for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
         if(arr[i]<arr[j]){
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i]= temp;
         }
       }
      }
               for(int i=0;i<arr.length;i++){
                  System.out.print(" "+arr[i]);
               }
    }
    public static void  Insertion(int arr[]) {  // PLAYING CARDS
      System.out.println();
      System.out.println(" Insertion Sort ");
      for(int i=1;i<arr.length;i++){
         for(int j = i-1;j>=0;j--){
            if(arr[j+1]>arr[j]){
               int temp = arr[j];
               arr[j]= arr[j+1];
               arr[j+1] = temp;
            }
            else{
               break;
            }
         }
      }
      for(int i=0;i<arr.length;i++){
         System.out.print(" "+arr[i]);
      }
    }
    public static void  Selection(int arr[]) {  // Similar to BUBBLE SORT
      System.out.println();
      System.out.println(" Selection Sort ");
      for(int i=0;i<arr.length;i++){
         int min =i;
         int d = 0;
       for(int j=i+1;j<arr.length;j++){
         if(arr[min]<arr[j]){
          min= j;
         }
         int temp = arr[i];
         arr[i]= arr[min];
         arr[min]= temp;
       }
      }
     // System.out.println();
               for(int i=0;i<arr.length;i++){
                  System.out.print(" "+arr[i]);
               }   
        
    }
     public static void  Counting(int arr[]) {

      int lar = Integer.MIN_VALUE;

      for(int i=0;i<arr.length;i++){
if(arr[i]>lar){
   lar = arr[i];  
}
//System.out.println(lar);
}
int count []= new int [lar+1];
System.out.println();
for(int i=0;i<arr.length;i++){
count[arr[i]]++;
   }
    
   // int count []= new int [lar];
    for(int i=1;i<=lar;i++){
       
// System.out.print(" " +count[i]);
}
System.out.println("Counting Sort");
for(int i=1;i<=lar;i++){
   for(int j =0;j<count[i];j++){
       arr[j]=i;
       count[i]--;}
  }

  for(int i=0;i<arr.length;i++){
       
   System.out.print(" " +arr[i]);
  }
 
       }
    public static void  main(String args[]) {

        int arr[]={1,2,6,4,3,7,5};
        System.out.println(" UnSorted Array ");
        for(int i=0;i<arr.length;i++){
         System.out.print(" "+arr[i]);
      }   
           Bubble(arr);
        Insertion(arr);
        Selection(arr);
         Counting(arr);

        
    }
    
}
