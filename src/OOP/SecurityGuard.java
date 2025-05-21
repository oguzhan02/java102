package OOP;

public class SecurityGuard extends Officer{
    private String certificate;

    public SecurityGuard(String nameLastName, String department, String email, String phoneNumber, String shift, String certificate) {
        super(nameLastName, department, email, phoneNumber, shift);
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    public void Watch(){
        System.out.println(this.getNameLastName() + " is watching.");
    }
}
