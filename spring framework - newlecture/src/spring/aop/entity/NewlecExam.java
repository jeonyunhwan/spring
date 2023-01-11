package spring.aop.entity;

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
	

	public NewlecExam() {
	}


	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	public int total() {
		long start = System.currentTimeMillis();
		
		int result = kor+eng+math+com;
		if(kor > 100)
			throw new IllegalArgumentException("유효하지 않은 국어점수");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		String message = (end-start) + "ms 가 걸렸습니다.";
		System.out.println(message);
		
		return result;
	}

	public float avg() {
		// TODO Auto-generated method stub
		float result = total()/4.0f;
		return result;
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
