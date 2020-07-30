public class RecursionTowerOfHanoi {

  int step = 0;

  public void move(int numberOfDisc, char from, char to, char inter) {
    step++;

    if (numberOfDisc == 1) {
      System.out.println("moving disc " + numberOfDisc + " from " + from + " to " + to);
    } else {
      move(numberOfDisc - 1, from, inter, to);
      System.out.println("moving disc " + numberOfDisc + " from " + from + " to " + to);
      move(numberOfDisc - 1, inter, to, from);

    }

  }

  public static void main(String[] args) {
    RecursionTowerOfHanoi toh = new RecursionTowerOfHanoi();
    toh.move(3, 'A', 'C', 'B');
    System.out.println("Total number of steps : " + toh.step);

  }

}