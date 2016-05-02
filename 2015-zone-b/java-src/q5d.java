import java.io.*;

public class q5d {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    // We are assuming that we are to perform case-sensitive comparisons
    // Since the question literally quotes lower-case characters
    while(t != -1) {
      if(t == (int)'a')
        System.out.print('x');
      else if(t == (int)'b')
        System.out.print('y');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
