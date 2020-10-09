 import java.util.Scanner;
/**
 *This program determines the grades on a test
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 

    int marks = 5; 
    //create an array with 5 spots 
    int[] grades = new int[marks];  

    //prompt user for answers 
    System.out.println("Please enter the answers to the test"); 

    //using a loop for user to put answers in array 
    for(int i = 0; i < grades.length; i++){ 
      grades[i] = input.nextInt(); 
    }  

    //create an array with 5 spots 
    int[]studentScore  = new int[marks]; 
    
    //get the student's answers 
    System.out.println("Please enter the student answers"); 

    //using a loop for user to put answers in array
    for(int i = 0; i < grades.length; i++){
      studentScore[i] = input.nextInt();
    } 

    int score = grades[0]; 

    //use loop to find out the score 
    for(int i = 0; i < 5; i++){
      if(grades[i] == studentScore){
        score == grades[i]; 
      }
    }  
    //tell the user what their score is 
    System.out.println("Score: " + score);


    
  }
}
