package spring.di.ui;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	
	/**
	 * @param exam
	 */
	public InlineExamConsole() {
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	

	public void print() {
		System.out.printf("total is %d,avg is %f\n",exam.total(),exam.avg());

	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}