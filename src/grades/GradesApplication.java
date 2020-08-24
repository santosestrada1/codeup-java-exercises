package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;

public class GradesApplication {
    public static void main(String[] args) {
        // Instantiate a new HashMap called student
        HashMap<String, student> students = new HashMap<>();

        // Create 4 students and add some grades for each
        students.put("batMan", new student("Christian"));
        students.put("cptMarvel", new student("Brie"));
        students.put("starLord", new student("Chris"));
        students.put("dianaPrince", new student("Gal"));

        // Add some random grades
        Random random = new Random();
        for(int i=0; i < 4; i++){
            students.get("batMan").addGrade(random.nextInt(100));
            students.get("cptMarvel").addGrade(random.nextInt(100));
            students.get("starLord").addGrade(random.nextInt(100));
            students.get("dianaPrince").addGrade(random.nextInt(100));
        }

        System.out.println("\n\n\tWelcome!\n\n\tHere are the Github usernames of our students:\n");
        System.out.println("\t" + students.keySet());

        // Create an Input for user input
        Input input = new Input();

        String ghUser;
        boolean confirmation = true;
        do{
            ghUser = input.getString("\tWhich student's stats would you like to view?: ");
            // check if typed in user actually exists
            if(!students.containsKey(ghUser)){
                System.out.println("\n\tNo student with that Github username was found. :-(");
            }else{
                // they did type in a matching Github user name / key
                student thisStudent = students.get(ghUser);
                System.out.println("\n\n\tName: " + thisStudent.getName() + " || GH u/n: " + ghUser + " || Current grade avg: " + thisStudent.getGradeAverage());
            }
            confirmation = input.yesNo("\tWould you like to see another? [y/N]");
        } while(confirmation); // once the user says they no longer want to participate, EXIT
    }
}
