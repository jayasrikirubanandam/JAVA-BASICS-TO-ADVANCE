package QuizApplication;

public class QuizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tightly coupled
		Service service = new Service();
		
		service.displayQuestions();
		System.out.println("The total Score earned is "+service.totalScore());
	}

}
