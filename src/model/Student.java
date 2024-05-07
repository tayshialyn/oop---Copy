package model;

import java.util.ArrayList;

public class Student {
    // properties of Student
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    String id;

    // student can enroll in one OR more courses - thus a List or ArrayList is required

    ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    // default constructor of Student

    public Student(String firstName, String lastName, int registration, int grade, int year, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
        this.id = id;
    }


    // overloaded constructor of Student

    public Student(String firstName, String lastName, int grade, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = 1;
        this.grade = grade;
        this.year = 1;
        this.id = id;
    }

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
        this.id = "";
    }


    // getters() for Student to return name or id

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRegistration() {
        return registration;
    }

    public int getGrade() {
        return grade;
    }

    public int getYear() {
        return year;
    }

    public String getId() {
        return id;
    }

    // setters() for student to store the name and id


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "Student{" + "firstName='" + firstName + "\' " + "lastName='" + lastName + "\'" + ", id='" + id + "\'" + "}";
    }

    // public method to enroll student to a course
    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    // public method to un-enroll student from a course
    public void unEnroll(Course course) {
        enrolledCourses.remove(course);
    }

    // public method to return the number of courses student enrolled
    public int totalEnrolledCourses() {
        // returns the number of courses student is enrolled into
        return enrolledCourses.size();
    }

    // public method to return the enrolled courses' info

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void printFullName(){
        System.out.println(firstName + " " + lastName);
        //TODO implement
    }

    public boolean isApproved(){
        return grade >= 60;
        //TODO implement: should return true if grade >= 60
    }

    public int changeYearIfApproved(){
        if(isApproved()) {
            return year++;
        }
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        return year;
    }
}
