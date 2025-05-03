/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan10042025;

/**
 *
 * @author ASUS
 */
public class StudentRecord {
     protected String name;
    protected String course;
    protected int grade;
    
    public StudentRecord(){
        System.out.println("inside: Student Record Constructor");
    }
    
    public StudentRecord(String name, String course, int grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCourse(){
        return course;
    }
    
    public int getGrade(){
        return grade;
    }

}
