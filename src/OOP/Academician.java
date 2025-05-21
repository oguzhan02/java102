package OOP;

public class Academician extends Worker {
    String title;

    public Academician(String nameLastName, String department, String email, String phoneNumber,String title) {
        super(nameLastName, department, email, phoneNumber);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
