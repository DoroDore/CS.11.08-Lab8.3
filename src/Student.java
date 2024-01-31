public class Student {
    private final int mID;
    private String mFirstName;
    private String mLastName;
    private int mAge;
    private int mYearLevel;
    private static int mStudentCount = 1;
    public Student (String firstName, String lastName, int age, int yearLevel) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
        mYearLevel = yearLevel;
        mID = mStudentCount;
        mStudentCount += 1;
    }
    public int getID() {
        return mID;
    }
    public String getFirstName() {
        return mFirstName;
    }
    public String getLastName() {
        return mLastName;
    }
    public int getAge() {
        return mAge;
    }
    public int getYearLevel() {
        return mYearLevel;
    }
    public void setYearLevel(int newYear) {
        mYearLevel = newYear;
    }
    public static int getStudentCount() {
        return mStudentCount;
    }
    public void setFirstName(String str) {
        mFirstName = str;
    }
    public void setLastName(String str) {
        mLastName = str;
    }
    public void setAge(int n) {
        mAge = n;
    }
    @Override
    public String toString() {
        return("Student{id=" + mID + ", firstName='"+mFirstName + "', lastName='" + mLastName + "', age=" + mAge + ", yearLevel=" + mYearLevel + "}");
    }
}
