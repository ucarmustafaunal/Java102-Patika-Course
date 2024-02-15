public class Academician extends Employee{
    private String department;
    private String title;
    public Academician(String name, String phoneNumber, String email, String department, String title) {
        super(name, phoneNumber, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void learn(){
        System.out.println(this.getName()+" is entered a class");
    }

    @Override
    public void checkIn(){
        System.out.println("Academician "+this.getName()+" is checked in");
    }
}
