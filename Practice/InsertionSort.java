package Practice;

import java.util.Arrays;

public class InsertionSort {
  public void sort(Integer[] rand){
    for(int i = 0;i<rand.length;i++){
      int current = rand[i];
      int j = i-1;

      while((j>=0)&& rand[j]>current){
        rand[j+1] = rand[j];
        j--;

      }
      rand[j+1] = current;

    }
    System.out.println("Insertion Sorted Array \n"+ Arrays.toString(rand));
  }
}