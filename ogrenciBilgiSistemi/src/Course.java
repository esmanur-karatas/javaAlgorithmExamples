public class Course {
    String name;
    String code;
    String prefix;
    double oralEffect; // Sözlü notun ortalama üzerindeki etkisi yüzdesi
    Teacher teacher;
    double averageNote; // Dersin ortalama notu

    Course(String name, String code, String prefix, double oralEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralEffect = oralEffect;
    }

    void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println("Course Teacher: " + teacher.name);
        } else {
            System.out.println("No teacher assigned to this course yet.");
        }
    }
}