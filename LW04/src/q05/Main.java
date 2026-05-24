package q05;

public class Main {
    public static void main(String[] args) {
        // Create a Course
        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CTEC22043");

        // Create a Lecturer
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Kumar");
        lecturer.setCourseTeaching(course);

        // Create a Student
        Student student = new Student();
        student.setStudentName("Sandali");
        student.setDegreeName("Bachelor of Information and Communication Technology");
        student.setCourseFollowing(course);

        //add lecturer to course
        course.setLecturer(lecturer);


        // Print information
        System.out.println("Student Information");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing().getCourseName());
        System.out.println();

        System.out.println("Course Information");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());
        System.out.println();

        System.out.println("Lecturer Information");
        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching().getCourseName());
    }

}