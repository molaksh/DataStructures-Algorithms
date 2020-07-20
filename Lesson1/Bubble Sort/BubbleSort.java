package Lesson1;

public class BubbleSort {

  public static void main(String[] args){

    int[] randomSequence = {23, 76, 15,47,14,38,52};
    System.out.println("The original sequence");
    //for (int i : randomSequence) {
      for (int i=0; i<randomSequence.length; i++){
        if(i==randomSequence.length-1){
          System.out.print(randomSequence[i]);
        }else{
          System.out.print(randomSequence[i]+", ");
        }
      
    }
    System.out.println("\n");

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
    for (int j=0; j<rand.length;j++) {
      if(j == rand.length-1){
        System.out.print(rand[j]+"\n");
      }else{
        System.out.print(rand[j]+", ");
      }
      
    }


  }



}