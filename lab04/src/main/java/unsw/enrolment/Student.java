package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments = new ArrayList<Enrolment>();
    private String name;
    private int program;
    private String[] streams;

	public Student(String zid, String name, int program, String[] streams) {
        this.zid = zid;
        this.name = name;
        this.program = program;
        this.streams = streams;
    }

    public boolean isEnrolled(CourseOffering offering) {

        return enrolments
                    .stream()
                    .anyMatch(e -> e.getOffering().equals(offering));

        // for (Enrolment enrolment : enrolments) {
        //     if (enrolment.getOffering().equals(offering)) {
        //         return true;
        //     }
        // }

        // return false;
            

    }

    public void setGrade(Grade grade) {

        enrolments
                .stream()
                .filter(e -> e.getOffering().equals(grade.getOffering()))
                .forEach(e -> e.setGrade(grade));


        // for (Enrolment enrolment : enrolments) {
        //     if (enrolment.getOffering().equals(grade.getOffering())) {
        //         enrolment.setGrade(grade);
        //     }
        // }
    }

    public void addEnrolment(Enrolment enrolment) {
        enrolments.add(enrolment);
    }

    public List<Enrolment> getEnrolments() {
        return enrolments;
    }

    public int getProgram() {
        return program;
    }

    public int getNumStreams() {
        return streams.length;
    }

    public String getName() {
        return name;
    }

    public String getzid() {
        return zid;
    }

}
