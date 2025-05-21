package OOP;

public class It extends Officer {

    String duty;

    public It(String nameLastName, String department, String email, String phoneNumber, String shift, String duty) {
        super(nameLastName, department, email, phoneNumber, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public void NetworkSetup(){
        System.out.println(this.getNameLastName() + " is setting up the network.");
    }
}
