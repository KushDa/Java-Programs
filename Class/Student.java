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