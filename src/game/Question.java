
package game;


public class Question {
    public String question;
    public String answer1, answer2;
    public int rightAnswer;
    
    public Object[] getAnswers()
    {
        Object[] objs = new Object[2];
        objs[0] = answer1;
        objs[1] = answer2;
        return objs;
    }
    
    public Question(String s1, String s2, String s3, int i)
    {
        question=s1;
        answer1=s2;
        answer2=s3;
        rightAnswer=i;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    @Override
    public String toString() {
        return getQuestion();
    }
    
    
}
