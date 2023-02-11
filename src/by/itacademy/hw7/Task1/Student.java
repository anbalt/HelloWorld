package src.by.itacademy.hw7.Task1;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName() {
        this.lastName = lastName;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup() {
        this.group = group;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark() {
        this.averageMark = averageMark;
    }
    public double getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }
}
