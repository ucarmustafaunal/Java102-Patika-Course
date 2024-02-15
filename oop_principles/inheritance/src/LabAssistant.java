public class LabAssistant extends Assistant{
    public LabAssistant(String name, String phoneNumber, String email, String department, String title, String workHours) {
        super(name, phoneNumber, email, department, title, workHours);
    }

    public void gotoLabs(){
        System.out.println(this.getName()+" is entered to Lab");
    }

    public void gotoClass(){
        System.out.println(this.getName()+" is entered to Class");
    }
}
