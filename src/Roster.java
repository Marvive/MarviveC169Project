import com.wgu.C169.Student;

import java.util.ArrayList;


public class Roster {
    private static ArrayList<Student> studentRoster = new ArrayList<>();


    public static void main(String[] args) {
        studentRoster.add(new Student("1", "John", "Smith", "John1989@gmail.com", 20, new int[] {88, 79, 59}));
        studentRoster.add(new Student("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, new int[] {91, 72, 85}));
        studentRoster.add(new Student("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new int [] {85, 84, 87}));
        studentRoster.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22 ,new int [] {91 , 98, 82}));
        studentRoster.add(new Student("5", "Michael", "Marvive", "mmarviv@wgu.com", 28, new int [] {86, 97, 79}));

        print_all();

        print_invalid_emails();

        for (Student eachStudent : studentRoster) {
            print_average_grade(eachStudent);
        }

        remove("3");
        remove("3");
    }




// a. public static void remove(String studentID) that removes students from the roster by student ID

// Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.



    public static void remove(String studentID){
        for (Student eachStudent : studentRoster) {
            if(eachStudent.getStudentID().equals(studentID)){
                studentRoster.remove(eachStudent);
                System.out.printf("Student ID: %s is not found.\n", studentID);
                return;
            }
        }
    }

// b. public static void print_all() that prints a complete tabseparated list of student data using accessor methods

// Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}.
// The print_all() method should loop through all the students in the student array list and call the print() method for each student.

    public static void print_all(){
        System.out.println("All Students Listed:");
        for (Student s : studentRoster) {
            s.print();
        }
    }

// c. public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID

    public static void print_average_grade(Student avg) {
        System.out.println("Print Average Grades:");

            double average = (avg.getGrades()[0] +
                    avg.getGrades()[1] + avg.getGrades()[2])/3.0;

            System.out.println("Student ID: " + avg.getStudentID() + " average grade = " +
                    average);
        }



// d. public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user

    public static void print_invalid_emails() {
        System.out.println("Invalid Emails: ");
        for (Student student : studentRoster ) {
            if (!(student.getEmailAddress().contains("@") &&
                    student.getEmailAddress().contains(".") &&
                    !(student.getEmailAddress().contains(" ")))) {
                System.out.println(student.getEmailAddress());
            }
        }
    }



}
