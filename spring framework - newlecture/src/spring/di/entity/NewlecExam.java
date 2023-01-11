package spring.di.entity;

public class NewlecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
	/**
	 * @param kor
	 * @param eng
	 * @param math
	 * @param com
	 */
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getCom() {
		return com;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
}
