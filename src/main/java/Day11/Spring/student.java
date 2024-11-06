package Day11.Spring;

public class student {
    private String rollno;
    private String name;
    private String marks;

    // Getters and Setters
    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "rollno: " + rollno + "\n" +
               "name: " + name + "\n" +
               "marks: " + marks;
    }

}

