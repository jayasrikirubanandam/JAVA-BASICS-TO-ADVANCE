package QuizApplication;

import java.util.Arrays;

public class Question {

	int questionID;
	String description;
	String[] options;
	String answer;
	
	// Constructor
	public Question() {
		super();
	}
	
	//parameterized Constructor
	public Question(int questionID, String description, String[] options, String answer) {
		super();
		this.questionID = questionID;
		this.description = description;
		this.options = options;
		this.answer = answer;
	}
	
	//Getters and Setters
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//overidden toString() to print data's
	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", description=" + description + ", options="
				+ Arrays.toString(options) + ", answer=" + answer + "]";
	}
}
