package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	/**
	 * @param exam
	 */
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	/**
	 * 
	 */
	public GridExamConsole() {
		super();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-------");
		System.out.println("total");
		System.out.println(exam.total());
		System.out.println("avg");
		System.out.println(exam.avg());
		System.out.println("-------");
	}

	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
