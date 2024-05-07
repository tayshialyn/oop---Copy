import model.Student;
import model.Course;
import services.CourseService;

public class Main {
    public static void main(String[] args) {

        CourseService courseService = new CourseService();

        String courseId = "biol_01";
        String courseId2 = "phys_01";
        String courseId3 = "art_01";
        String studentId = "778979";

        courseService.enrollStudent(studentId, courseId);
        courseService.enrollStudent(studentId, courseId2);
        courseService.enrollStudent(studentId, courseId3);

        courseService.displayStudentCourseInformation(studentId);

        courseService.displayStudentInformation(studentId);
        courseService.displayCourseInformation(courseId);

        // run printFullName to print student of ID 120120
        Student student = courseService.getStudent(studentId);
        student.printFullName();

        // display the number of students in this program
        System.out.println(courseService.countStudents());

        //display the highest grade from all the students
        System.out.println("Highest Grade is:" + courseService.bestGrade());

        // TODO call overloaded function enrollStudent
        // TODO to store multiple students (as an array)

        String studentId2 = "884545";
        courseService.enrollStudent(studentId2, courseId);
        courseService.enrollStudent(studentId2, courseId2);
        courseService.enrollStudent(studentId2, courseId3);
        courseService.displayStudentCourseInformation(studentId);

        // display students who have taken the course phys_01
        courseService.showEnrolledStudents("phys_01");

        // display students who have taken the course art_01
        courseService.showEnrolledStudents("art_01");

        // display students who have taken the course math_01 (returns no student)
        courseService.showEnrolledStudents("math_01");







        // commented out as can just use CourseService to do the job
//        Student studentA = new Student("John Doe","101");
////        Student studentB = new Student();   // calls upon the overloaded constructor which is empty)
//
//        // create course details
//        Course courseA = new Course("Math", "01", "2");
//        Course courseB = new Course("Science", "02", "3");
//
////        studentB.setName("Sam Smith");
////        studentB.setId("102");
////
////        System.out.println(studentA);  // prints both name and ID of students
////        System.out.println(studentB);
////        System.out.println(studentB.getName()); //  print Student B's name ONLY
//
//        // enroll students into courses
//        studentA.enroll(courseA);
//        studentA.enroll(courseB);
//        System.out.println(studentA.getEnrolledCourses());
//
//        studentA.unEnroll(courseA);
//        System.out.println(studentA.getEnrolledCourses());
    }
}