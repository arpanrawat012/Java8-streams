package questionAnswersPoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScoreCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<>();
		questionList.add(new Question(1,"Cognizant"));
		questionList.add(new Question(2,"2 years"));
		questionList.add(new Question(3,"5"));
		questionList.add(new Question(4,"Hybrid"));
		questionList.add(new Question(5,"Non-ODC"));
		
		List<Answer> answerList = new ArrayList<>();
		answerList.add(new Answer(1,"TCS"));
		answerList.add(new Answer(2,"2 years"));
		answerList.add(new Answer(3,"5"));
		answerList.add(new Answer(4,"None"));
		answerList.add(new Answer(5,"Non-ODC"));
		
		int score = calculateScore(questionList,answerList);
		System.out.println("Score is :"+score);
	}

	private static int calculateScore(List<Question> questionList, List<Answer> answerList) {
		//Using this questionMap to map the id's of the questions with their correct answer
		//With the help of this map I can easily get the correct answer by passing the id of the question
		Map<Integer, String> questionMap = questionList.stream().collect(Collectors.toMap(Question::getId,Question::getRightAnswer));
		
		long count = answerList.stream().filter(a -> {
			int id = a.getId();
			String givenAnswer = a.getAnswer();
			String correctAnswer = questionMap.get(id);
			return correctAnswer.equals(givenAnswer);
		}).count();
		
		return (int) count;
	}

}
