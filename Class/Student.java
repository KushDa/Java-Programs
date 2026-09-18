/*Write a program in Java that implements the following:
i) Class Student exists with member variables name, roll and grade.
i) Constructor exists that initializes the values passed from main().
ii) A function display() that prints the member variables.
iv) Pass 7 such instances of class Student with values passed from main)
and finally print the values of the 7 instances */

import java.util.*;
class Student{

    String name;
    int roll;
    char grade;

Student(String n, int r, char g)
{
    name = n;
    roll = r;
    grade = g;
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Roll no.: "+roll);
    System.out.println("Grade: "+grade);
    System.out.println("------------");
}
public static void main(String args[])
{
    Student[] s = new Student[7];
    s[0] = new Student("Kushal",33,'E');
    s[1] = new Student("Akib",14,'E');
    s[2] = new Student("Susovon",16,'A');
    s[3] = new Student("Bijetri",28,'E');
    s[4] = new Student("Riya",20,'B');
    s[5] = new Student("Rahul",30,'C');
    s[6] = new Student("Zishan",47,'B');

    for(int i=0;i<7;i++){
        s[i].display();
    }
}

}