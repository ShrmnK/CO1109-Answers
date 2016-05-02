public class q6d {
  static int roll() {
    java.util.Random r = new java.util.Random();
    return r.nextInt(6) + 1;
  }

  // for() loop method
  // While (no pun intended) this method works, we generally use while() loops
  // for when we do not know the exact number of times to run the loop for.
  /*public static void main(String[] args) {
    int consecutive = 0, i = 1;
    for(i = 1; consecutive != 3; i++) {
      if(roll() == 5)
        consecutive++;
      else
        consecutive = 0;
    }
    System.out.println(i);
}*/

  // while() loop method
  public static void main(String[] args) {
      int consecutiveFives = 0, count = 0;
      while(consecutiveFives < 3) {
          if(roll() == 5) {
              consecutiveFives++;
          } else {
              consecutiveFives = 0;
          }
          count++;
      }
      System.out.println(count);
  }
}
