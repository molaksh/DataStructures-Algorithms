package Practice;

import java.util.Arrays;

public class GenerateRandomArray {
  public static void main(String[] args){

    new BubbleSort().sort(generateRandArray());
    new SelectionSort().sort(generateRandArray());
    new InsertionSort().sort(generateRandArray());

  }
  static Integer[] generateRandArray(){
    Integer[] randArray = new Integer[5];

    for(int i = 0; i< randArray.length; i++){
      randArray[i] = (int) (Math.random()*100);
    }
    System.out.println("The original array: \n"+Arrays.toString(randArray));
    return randArray;
  }
}