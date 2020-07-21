package Lesson1;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args){

        int[] randomArray = new int[10];

        for(int i =0; i< randomArray.length; i++){
          randomArray[i] = (int) (Math.random()*100);
        }

        System.out.println("original Array");
        System.out.println(Arrays.toString(randomArray));

        new SelectionSort().sort(randomArray);
  }
  
  public void sort(int[] rand){

    for(int i =0; i< rand.length-1;i++){
      int minIndex = i;

      for(int j= i+1; j<rand.length; j++){
            if(rand[j]< rand[minIndex]){
              int temp = rand[j];
              rand[j] = rand[minIndex];
              rand[minIndex] = temp;
            }
          }
          //System.out.println(Arrays.toString(rand));
      }
      System.out.println("Sorted array");
      System.out.println(Arrays.toString(rand));
    }
}