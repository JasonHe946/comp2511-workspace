package unsw.enrolment;
import java.util.List;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

    public Enrolment(CourseOffering offering, Student student) {
        this.offering = offering;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public CourseOffering getOffering() {
        return offering;
    }

    public boolean hasPassedCourse() {
        return grade.hasPassedCourse();
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean checkValidEnrolment(Course prereq, boolean valid) {
        if (getCourse().equals(prereq) && getGrade() != null) {
            if (getGrade().getMark() >= 50 && getGrade().getGrade() != "FL"
                && getGrade().getGrade() != "UF") {
                    valid = true;
                }
        }
        return valid;
    }
}