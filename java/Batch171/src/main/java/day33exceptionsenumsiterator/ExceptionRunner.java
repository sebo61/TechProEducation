package day33exceptionsenumsiterator;

public class ExceptionRunner {
    /*
        garbage Collector memory yi temiz turmak için sürekli memory yi tarar ve silinmesi gereknleri siler.
        Garbage Collector silmeden önce sileceği dataları finalize eder. sonra siler.
     */
    public static void main(String[] args) throws InvalidStudentGradeException {
        getStudentGrade(50);
        // getStudentGrade(-50);InvalidStudentGradeException
        getTheNumberOfStudents(-50); //InvalidNumberException

    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(numOfStudents);

        }


    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidStudentGradeException("Student's grade cannot be less than zero or greater than 100");

        } else {
            System.out.println(grade);
        }
    }
}
