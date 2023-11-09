package day36lambda;
/*
İçinde ;
1) private variable'lar
2) parametreli ve parametresi constructor'lar
3) Getter'lar
4) Setter'lar
5) toString methodu
    barındıran classlara "POJO Class" " Plain OLd Java Object" denir.
 */


public class Course {

        private String seoson;
        private String courseName;
        private int avarageScore;
        private int numberOfStudents;

    public Course() {

    }

    public Course(String seoson, String courseName, int avarageScore, int numberOfStudents) {
        this.seoson = seoson;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeoson() {
        return seoson;
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

    public void setSeoson(String seoson) {
        this.seoson = seoson;
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
                "seoson='" + seoson + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}

