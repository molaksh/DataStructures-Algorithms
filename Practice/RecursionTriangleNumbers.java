public class RecursionTriangleNumbers {
    public int triangleNumber(int n){
      if(n==0) {return 0;}
      return n+triangleNumber(n-1);

      

    }
    
    public static void main(String[] args)
{
  int randNum = (int) (100*(Math.random()));

  System.out.println("Triangle Number "+ randNum +"th element ="+ new RecursionTriangleNumbers().triangleNumber(randNum));
}

}