package Lesson1.BubbleSort;

import java.util.Random;

public class BubbleSortRandomArray {
public static void main(String[] args){

  int[] randomArray = new int[10];

  for(int i =0; i< randomArray.length; i++){
    randomArray[i] = (int) (Math.random()*100);
  }

  
    for (int i=0; i<randomArray.length; i++){
      if(i==randomArray.length-1){
        System.out.print(randomArray[i]+"\n");
      }else{
        System.out.print(randomArray[i]+", ");
      }

  }

  BubbleSort.sortIt(randomArray);

}
}