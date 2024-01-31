import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    ArrayList<Student> students = new ArrayList<>();
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String str) {
        subject = str;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int n) {
        capacity = n;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public void setYearLevel(int n) {
        yearLevel = n;
    }
    public void addStudent(Student student) {
        if (student.getYearLevel() == yearLevel && !students.contains(student)) {
            students.add(student);
        }
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public boolean isStudentEnrolled(Student student) {
        return students.contains(student);
    }
    @Override
    public String toString() {
        return ("ClassSection{subject='"+subject+"', capacity=" + capacity+", yearLevel="+yearLevel+", students="+students.toString()+"}");
    }
}
