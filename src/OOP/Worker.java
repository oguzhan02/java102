package OOP;

public class Worker {
    private String nameLastName;
    private String phoneNumber;
    private String email;
    private String department;

    public Worker(String nameLastName, String department, String email, String phoneNumber) {
        this.nameLastName = nameLastName;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void Enter(){
        System.out.println(this.nameLastName+" has entered the university");
    }
    public void Exit(){
        System.out.println(this.nameLastName+" has left the university");
    }
    public void DiningHall(){
        System.out.println(this.nameLastName+" has dined in the dining hall");
    }
}
