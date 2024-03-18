public class Student {
    String name;
    int stuNo;
    Course course1;
    Course course2;
    Course course3;
    double oralNote1;
    double oralNote2;
    double oralNote3;

    Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    void addBulkExamNote(double oralNote1, double examNote1, double oralNote2, double examNote2, double oralNote3, double examNote3) {
        this.oralNote1 = oralNote1;
        this.oralNote2 = oralNote2;
        this.oralNote3 = oralNote3;
        this.course1 = calculateCourseAverage(course1, oralNote1, examNote1);
        this.course2 = calculateCourseAverage(course2, oralNote2, examNote2);
        this.course3 = calculateCourseAverage(course3, oralNote3, examNote3);
    }

    private Course calculateCourseAverage(Course course, double oralNote, double examNote) {
        double finalGrade = oralNote * course.oralEffect + examNote * (1 - course.oralEffect);
        course.averageNote = finalGrade;
        return course;
    }

    void printNote() {
        System.out.println(name + " - " + stuNo);
        if (course1 != null) {
            System.out.println(course1.name + " Notu: " + course1.averageNote);
        }
        if (course2 != null) {
            System.out.println(course2.name + " Notu: " + course2.averageNote);
        }
        if (course3 != null) {
            System.out.println(course3.name + " Notu: " + course3.averageNote);
        }
    }
}