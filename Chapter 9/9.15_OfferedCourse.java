/*
Given main(), define a Course base class with methods to set and get the courseNumber and courseTitle. Also define a derived class OfferedCourse with methods to set and get instructorName, term, and classTime.

Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Fall 2018
WF: 2-3:30 pm
the output is:

Course Information: 
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information: 
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Term: Fall 2018
   Class Time: WF: 2-3:30 pm

Dalton Murray
*/

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