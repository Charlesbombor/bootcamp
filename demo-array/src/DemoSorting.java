import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int [] arr =new int[]{100,4,1050,500,-20};

    //1.Bubble Sort
    int temp;
    for (int i=0; i<arr.length-1; i++){ //reset counter
      for(int j=0; j<arr.length -1-j; j++){
        if (arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
        System.out.println("Example " + Arrays.toString(arr));
      }
      
    }
    System.out.println(Arrays.toString(arr));

    // 2.Insertion Sort
    // {4,3,2,10,12,1,5,6}
    int []arr2= new int[]{4,3,2,10,12,1,5,6};
    int x=0; // j
    int y=0; // i
    int key;
    for(y=1; y<arr2.length;y++){  //star from the 2nd element
      key=arr2[y]; // current element
      x=y-1;
      while(x>=0 && arr2[x]>key){
        arr2[x+1]=arr2[x];
        x--;
      }
      arr2[++x]=key;
    //for (x=0; x<arr2.length-1-y; x++){
   // if (arr2[x+1]<arr2[x]){
      //temp=arr2[x];
     // arr2[x]=arr2[x+1];
      //arr2[x+1]=temp;
    
      //System.out.println("Process; " + Arrays.toString(arr2));
    }
    System.out.println("arr2: " + Arrays.toString(arr2));
  }
  
  
  
}

