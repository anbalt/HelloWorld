package src.by.itacademy.hw7.Task1;

public class HigSchool {
    public static void main(String[] args) {
        Student student1 = new Student("Lily", "Tyler", "Group_509", 4.5);
        Student student2 = new Student ("Loren", "Johnson", "Group_511", 5);
        Aspirant aspirant1 = new Aspirant("John", "Stone", "Group_120", 5,
                "Sports nutrition");
        Aspirant aspirant2 = new Aspirant("Steven", "Parker", "Group_125", 4.3,
                "Introduction to business management");
        Student[] students = {student1, student2, aspirant1, aspirant2};

        for(Student s:students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + ", " + s.getGroup() + ", "
                    + "average mark: " + s.getAverageMark() + ". " + "The scholarship: " + s.getScholarship() + " $");
        }
    }
}
