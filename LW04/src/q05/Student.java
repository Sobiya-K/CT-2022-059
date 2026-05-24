package q05;

public class Student {
    private String studentName;
    private String degreeName;
    private Course courseFollowing;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public Course getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(Course courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}
