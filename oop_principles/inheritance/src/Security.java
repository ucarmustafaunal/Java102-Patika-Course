public class Security extends Officer{
    private String docs;

    public Security(String name, String phoneNumber, String email, String department, String workHours, String docs) {
        super(name, phoneNumber, email, department, workHours);
        this.docs = docs;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public void onWatch(){
        System.out.println(this.getName()+" is on watch");
    }
}
