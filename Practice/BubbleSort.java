package Practice;

import java.util.Arrays;

public class BubbleSort {
  
  public void sort(Integer[] rand){
    for(int i= 0; i< rand.length;i++){
      for(int j=0; j<rand.length-1-i; j++){
        if(rand[j]>rand[j+1]){
          int temp = rand[j];
          rand[j] = rand[j+1];
          rand[j+1] = temp;
        }
      }
    }
    System.out.println("Bubble Sorted Array \n"+ Arrays.toString(rand));

  }
}