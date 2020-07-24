package Practice;

import java.util.Arrays;

public class SelectionSort {
  public void sort(Integer[] rand){
    for(int i = 0 ; i< rand.length-1;i++){
      int minIndex = i;

      for(int j= i+1; j<rand.length;j++){
        if(rand[j] < rand[minIndex]){
          int temp = rand[j];
          rand[j] = rand[minIndex];
          rand[minIndex] = temp;

        }
      }
    }
    System.out.println("Selection Sorted Array \n"+ Arrays.toString(rand));

  }
}