public class OfferedCourse extends Course {
    private String instructorName;
    private String term;
    private String classTime;

    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public String getTerm() {
        return term;
    }
    public String getClassTime() {
        return classTime;
    }
    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void printInfo() {
        System.out.println("Course Information: ");
        System.out.println("   Course Number: " + super.getCourseNumber());
        System.out.println("   Course Title: " + super.getCourseTitle());
    }
}