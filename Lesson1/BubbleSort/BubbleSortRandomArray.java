package Lesson1.Bubble

import java.util.Random;

Sort;

public class BubbleSortRandomArray {
public static void main(String[] args){

  Random rd = new Random();

  int[] randomArray = new int[10];

  for(int i =0; i< randomArray.length; i++){
    randomArray[i] = rd.nextInt();
  }

  
    for (int i=0; i<randomArray.length; i++){
      if(i==randomArray.length-1){
        System.out.print(randomArray[i]);
      }else{
        System.out.print(randomArray[i]+", ");
      }

  }


}
}