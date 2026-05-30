package PracticeProblem07;

class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private int credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title, int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

class CourseOffering {
    private Student student;
    private Instructor instructor;
    private Course course;
    private String time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(Student student, Instructor instructor,
                          Course course, String time,
                          int sectionNo, int roomId,
                          int year, String semester) {
        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public void displayInfo() {
        System.out.println("Student: " + student.getName());
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Course: " + course.getTitle());
        System.out.println("Time: " + time);
        System.out.println("Section: " + sectionNo);
        System.out.println("Room: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}

public class Prac {
    public static void main(String[] args) {

        Student s = new Student(101, "Luffy", "SWE");

        Instructor i = new Instructor(201, "Rayleigh", "Software Engineering", "Professor");

        Course c = new Course(301, "OOP Concepts", "Object Oriented Programming", 3, "Programming Fundamentals");

        CourseOffering offer = new CourseOffering(s, i, c, "10:00 AM", 1, 203, 2026, "Summer");

        offer.displayInfo();
        
    }
    
}
