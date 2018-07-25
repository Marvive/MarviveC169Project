package com.wgu.C169;

import java.util.Arrays;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;

    private int age;
    private int[] grades;

    //    Constructor for all input parameters

    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAge(age);
        setGrades(grades);
    }

    //      Accessor (get) for each instance variable

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    //    Mutator (set) for each instance variable


    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }



    //    Print Specific Data
    public void print() {
        System.out.println(getStudentID()
                + "\tFirst Name: " + getFirstName()
                + "\tLast Name: " + getLastName()
                + "\tEmail Address: " + getEmailAddress()
                + "\tAge: " + getAge()
                + "\tGrades: " + Arrays.toString(grades)
        );

    }

}
