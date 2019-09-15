
class MergeSort {
  public void sorting(int arr[],int l1,int r1, int l2, int r2){
    int r3=0;
    int r4=0;
    int result[] = new int[arr.length];
    for(int i = 0;i<result.length;i++){
      if(l1<=r1 && l2<=r2){
      if (arr[l1] < arr[l2]){
        result[i] = arr[l1];
        l1++;
        r3++;
      }
      else  if(arr[l1]>arr[l2]){
        result[i]=arr[l2];
        l2++;
        r4++;
      }
      }
      else if(r3>r1){
        result[i] = arr[l2];
        l2++;
      }
      else{
        result[i]= arr[l1];
        l1++;
      }

      }
      for (int j=0; j<result.length;j++){
        System.out.print(result[j]);
      }

    }
  
  public static void main(String[] args) {
    MergeSort sorting = new MergeSort();
    int arr[] = {3,5,7,9,12,4,6,10,13};
    int l1 = 0;
    int l2=5;
    int r1=4;
    int r2=8;

    sorting.sorting(arr, l1, r1, l2, r2);
  }
}
