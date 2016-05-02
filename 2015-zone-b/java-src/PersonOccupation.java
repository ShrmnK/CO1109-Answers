public class PersonOccupation extends Person {
  private String occupation;

  public PersonOccupation(String firstName, String lastName, Date d, String occupation) {
      super(firstName, lastName, d);
      this.occupation = occupation;
  }
}
