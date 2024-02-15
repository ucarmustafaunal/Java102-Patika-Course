public class Lecturer extends Academician{
    private String doorNumber;

    public Lecturer(String name, String phoneNumber, String email, String department, String title, String doorNumber) {
        super(name, phoneNumber, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeeting(){
        System.out.println(this.getName()+" is on a Senate Meeting");
    }

    public void makeExam(){
        System.out.println(this.getName()+" is started an exam");
    }
}
