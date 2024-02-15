public class InformationTechnologies extends Officer{
    private String task;

    public InformationTechnologies(String name, String phoneNumber, String email, String department, String workHours, String task) {
        super(name, phoneNumber, email, department, workHours);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void buildNetwork(){
        System.out.println(this.getName()+" is building network");
    }
}
