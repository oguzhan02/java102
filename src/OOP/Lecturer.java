package OOP;

public class Lecturer extends Academician{
    String course;
    public Lecturer(String nameLastName, String department, String email, String phoneNumber, String title) {
        super(nameLastName, department, email, phoneNumber, title);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void SenateMeeting(){
        System.out.println(this.getNameLastName() + " is going to the Senate meeting.");
    }
    public void DoExam(){
        System.out.println(this.getNameLastName() + " is going to make the "+this.course +" exam.");
    }
    public void EnterClass(){
        System.out.println(this.getNameLastName() + " is going to enter the "+this.course +" class.");
    }
}
