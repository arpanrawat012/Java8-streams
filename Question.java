package questionAnswersPoc;

public class Question {
	
	private int id;
	private String rightAnswer;
	public Question(int id, String rightAnswer) {
		super();
		this.id = id;
		this.rightAnswer = rightAnswer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	
}
