package academics;

public class Students {
    protected String name;
    protected int rollNo;

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        
    }

    public void displayStudent() {
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
    }
}
