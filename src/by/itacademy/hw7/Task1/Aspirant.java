package src.by.itacademy.hw7.Task1;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    public String getScienceWork() {
        return scienceWork;
    }
    public void setScienceWork() {
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 200 : 120;
    }
}
