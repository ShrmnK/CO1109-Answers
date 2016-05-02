class q4c {
  // Googling resulted in the following method:
  // Exponentiation by squaring
  // https://en.wikipedia.org/wiki/Exponentiation_by_squaring
  int exponentiation(int x, int n) {
    if(n == 1) return x;
    if(n == 2) return x * x;

    if(x % 2 > 0)
      return x * exponentiation(exponentiation(x, (n - 1) / 2), 2);
    return exponentiation(exponentiation(x, n / 2), 2);
  }

  public static void main(String[] args) {
    q4c go = new q4c();
    System.out.println("Exponentiation by squaring:");
    System.out.println("2^4 = " + go.exponentiation(2, 4));
    System.out.println("---");
    System.out.println("Exponentiation by method overloading:");
    System.out.println("2^4 = " + go.exp(2, 4));
  }

  // However, this question can also be solved by overloading the exp() method
  int exp(int x, int n) {
      return exp(x, n ,1);
  }
  int exp(int x, int n, int result) {
      if(n == 0) return result;
      return exp(x, n-1, result * n);
  }
}
