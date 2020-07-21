package Lesson1.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args){

    int[] randomSequence = {23, 76, 15,47,14,38,52};
    System.out.println("The original sequence");
    System.out.println(Arrays.toString(randomSequence));
    sortIt(randomSequence);
  }

  public static void sortIt(int[] rand){

    int temp = 0;
    for(int i = 0 ; i< rand.length; i++){
      for(int j = 0; j < rand.length-1-i; j++){
        if(rand[j] > rand[j+1]){
          temp = rand[j];
          rand[j] = rand[j+1];
          rand[j+1] = temp;
        }
      }
    }

    System.out.println("the sorted list");
    System.out.println(Arrays.toString(rand));
      
    }


  



}