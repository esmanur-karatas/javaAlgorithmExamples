public class Main {
    public static void main(String[] args) {
        // Teachers
        Teacher teacher1 = new Teacher("John Doe", 1234, "Physics");
        Teacher teacher2 = new Teacher("Jane Smith", 5678, "Chemistry");

        // Courses
        Course physicsCourse = new Course("Physics", "PHY101", "PHY", 0.20);
        Course chemistryCourse = new Course("Chemistry", "CHE101", "CHE", 0.15);

        // Assigning teachers to courses
        physicsCourse.addTeacher(teacher1);
        chemistryCourse.addTeacher(teacher2);

        // Students
        Student student1 = new Student("Alice", 1001);
        Student student2 = new Student("Bob", 1002);

        // Adding exam notes and oral notes
        student1.addBulkExamNote(90, 60, 85, 70, 80, 80);
        student2.addBulkExamNote(80, 75, 90, 80, 95, 90);

        // Printing students' course notes
        student1.printNote();
        System.out.println();
        student2.printNote();
    }
}






