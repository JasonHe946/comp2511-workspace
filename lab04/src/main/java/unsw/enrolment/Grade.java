package unsw.enrolment;

public class Grade {

    private int mark;
    private String grade;
    private CourseOffering offering;

    public Grade(CourseOffering offering, int mark, String grade) {
        this.offering = offering;
        this.mark = mark;
        this.grade = grade;
    }

	public int getMark() {
		return mark;
	}

	public String getGrade() {
		return grade;
	}

    public CourseOffering getOffering() {
        return offering;
    }

    public boolean hasPassedCourse() {
        if (grade == null) {
            return false;
        }

        return getMark() >= 50 && getGrade() != "FL" && getGrade() != "UF";
    }
}
