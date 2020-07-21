package Lesson1.BubbleSort;

import java.util.Arrays;

public class BubbleSortRandomArray {
public static void main(String[] args){

  int[] randomArray = new int[10];

  for(int i =0; i< randomArray.length; i++){
    randomArray[i] = (int) (Math.random()*100);
  }

  System.out.println(Arrays.toString(randomArray));

  BubbleSort.sortIt(randomArray);

}
}