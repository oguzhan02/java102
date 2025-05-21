package OOP;

public class Officer extends Worker{
    String shift;

    public Officer(String nameLastName, String department, String email, String phoneNumber, String shift) {
        super(nameLastName, department, email, phoneNumber);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public void Work(){
        System.out.println(this.getNameLastName() + " is working.");
    }
}
