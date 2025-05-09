package QuizApplication;

import java.util.Scanner;

public class Service {

		String[] userAnswer = new String[5];
		
		//hardCoded questions stored in array
		public Question[] createQuestions() {
			
			Question[] question = {
					new Question(1,"Can we create an constructor for an abstract class ?",new String[]{"yes","no"},"yes"),
					new Question(2,"Which keyword is used to restrict the class to be inherited ?", new String[] {"static","final","extends","implements"},"final"),
					new Question(3,"What is the size of int ?", new String[] {"2","5","6","4"},"4"),
					new Question(4,"Methods under interface are by default ?", new String[] {"static and private", "final and abstract","final and protected","final"},"final and abstarct"),
					new Question(5,"What is the size of double ?", new String[] {"5","8","2","4"},"8")
				
			};
			return question;
		}
		
		public void displayQuestions() {
			
			Question[] getQuestion = createQuestions();
			
			for(int i=0;i< getQuestion.length;i++) {
				
				System.out.print(getQuestion[i].questionID +" "+ getQuestion[i].description);
				System.out.println(" ");
				for(int j =0;j< getQuestion[i].options.length;j++) {
					System.out.println(getQuestion[i].options[j]);
				}
				
				//To collect answers from users 
				//before answering, lets give an option to skip the question
				System.out.println("Do you want to skip the question? ");
				Scanner scanner1 = new Scanner(System.in);
				String skip =scanner1.next();
				
				if(skip.equalsIgnoreCase("yes")) {
					userAnswer[i] = "null";
				}
				else 
				{
					System.out.println("Enter your answer");
					Scanner scanner = new Scanner(System.in);
					userAnswer[i] = scanner.next();
				}
				
				
			}
			
		}
		
		public int totalScore() {
			
			int totalScore=0;
			String[] rightAnswer = new String[5];
			
			for(int i=0;i< createQuestions().length;i++) {
				rightAnswer[i] = createQuestions()[i].getAnswer();
			}
			
			for(int j=0;j< userAnswer.length;j++) 
			{
				if(userAnswer[j].equalsIgnoreCase(rightAnswer[j]))
					totalScore++;
			}
			
			return totalScore;
		}
	

}
