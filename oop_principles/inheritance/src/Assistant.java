public class Assistant extends Academician{
    private String workHours;

    public Assistant(String name, String phoneNumber, String email, String department, String title, String workHours) {
        super(name, phoneNumber, email, department, title);
        this.workHours = workHours;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void makeQuiz(){
        System.out.println(this.getName()+" is started a Quiz");
    }
}
