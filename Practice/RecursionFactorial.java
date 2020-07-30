public class RecursionFactorial {

  public static void main(String[] args) {

    int num = (int) (10 * Math.random());

    System.out.println("Factorial of " + num + " is " + new RecursionFactorial().factorial(num));

  }

  public int factorial(int n) {

    if (n == 0)
      return 1;
    return n * (factorial(n - 1));
  }

}