package OOP;

public class LabAsistant extends Academician{
    String officeHour;

    public LabAsistant(String nameLastName, String department, String email, String phoneNumber, String title, String officeHour) {
        super(nameLastName, department, email, phoneNumber, title);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }
    public void DoQuiz(){
        System.out.println(this.getNameLastName() + " is going to do the quiz.");
    }
    public void EnterLab(){
        System.out.println(this.getNameLastName() + " is going to enter the lab.");
    }
}
