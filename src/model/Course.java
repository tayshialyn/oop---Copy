package model;

public class Course {

    // properties of Course (default is private)

    String name;

    String id;

    int credits;

    // default constructor for Course

    public Course(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getCredits()
    {
        return credits;
    }

        @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + "}";
    }
}

