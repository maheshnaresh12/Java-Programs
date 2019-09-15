Number Sorting

class Main {
  public void numberSorting(int arr[]){
    int temp =0;
    int temp1 = 0;
    for(int i =1;i<arr.length;i++){
      temp = arr[i];
      for(int j=i-1;j>=0;j--){
        if(temp<arr[j]){
          temp1 = arr[j];
          arr[j]=temp;
          arr[j+1]=temp1;

        }
      }

    }
    for(int i = 0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    int arr[] = {12, 11, 13, 5, 6,2,25};
    Main numberSort = new Main();
    numberSort.numberSorting(arr);
  }
}
