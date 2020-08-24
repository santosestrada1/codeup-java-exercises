package grades;

import java.util.ArrayList;

// TODO: The grades property should be an ArrayList of integers. The
//  student class should have a constructor that sets name property,
//  and initializes the grades property as an empty ArrayList. The
//  Student class should have the following methods:

public class student {
    private String name;
    private ArrayList<Integer> grades;

    public student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
//        we can comment this out later
//        System.out.println(name + " just scored a " + grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main (String[] args){
        student casey = new student("Casey");
        casey.addGrade(95);
        casey.addGrade(34);
        casey.addGrade(75);
        casey.addGrade(100);
        System.out.println(casey.getGradeAverage());
    }
}
