public class q5c {
  public static void main(String[] args) {
    String s = "testing";

    // Assuming the question asks for the second last character
    // e.g. the "l" in "example", then:
    System.out.println(s.charAt(s.length()-2));

    // Assuming the question asks for the String from the start til the second
    // last character, e.g. "exampl" in "example", then:
    System.out.println(s.substring(0, s.length()-1));
  }
}
