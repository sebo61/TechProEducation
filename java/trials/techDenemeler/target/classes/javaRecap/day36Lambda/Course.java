package day36Lambda;

public class Course {
  /*
  İçinde
  1) private variable lar;
  2) parametreli ve parametresiz constructer lar,
  3) getter lar,
  4) setter lar,
  5) toString() metodu,
    barındıran classlara "POJO" class denir.
   */
  private String season;
  private String courseName;
  private int avarageScore;
  private int numberOfStudents;

  public Course() {
  }

  public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
    this.season = season;
    this.courseName = courseName;
    this.avarageScore = avarageScore;
    this.numberOfStudents = numberOfStudents;
  }

  public String getSeason() {
    return season;
  }

  public String getCourseName() {
    return courseName;
  }

  public int getAvarageScore() {
    return avarageScore;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setAvarageScore(int avarageScore) {
    this.avarageScore = avarageScore;
  }

  public void setNumberOfStudents(int numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }

  @Override
  public String toString() {
    return "Course{" +
            "season='" + season + '\'' +
            ", courseName='" + courseName + '\'' +
            ", avarageScore=" + avarageScore +
            ", numberOfStudents=" + numberOfStudents +
            '}';
  }
}
