package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	Exam exam = new NewlecExam();
	//이것을 소스코드 수정없이 가능하게 하는게 스프링임... 
	//바꿔끼우는 과정이 기업에서 많기 때문에 부품을 스프링이 바꿈.
	//ExamConsole console = new InlineExamConsole(exam);
	ExamConsole console = new GridExamConsole();
	console.setExam(exam);
	*/
	// exam 객체와 console 객체가 바뀌는 상황이 온다면 ? 결합관계마저도 다 바뀌어야하는 상황인데 어떻게 할 것인가 ? 
	// console 객체가 필요한데 console 객체와 부품을 결합해서 나에게 주는 것이 스프링임. 
	/*
	 *  스프링에게 지시서를 제출하면 스프링이 자동으로 결합해서 나에게 보내줌. 
	 *  스프링은 bean 태그를 이용해서 지시서를 제출할 수 있음 
	 *  anotation은 Exam 클래스와 부합되는 것을 자동으로 찾아줌.
	 *  같은 클래스를 처리하면하고 id값을 맞춰줘도 됨. 
	 *  @Qualifier
	 */
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring/di/setting.xml");
	//지시서를 잘읽었으면, 인젝션하고 IOC 컨테이너에 담아놈. 
	//이름이나 타입명을 가지고 꺼내서 사용할 수 있음. 
	//ExamConsole console = (ExamConsole) context.getBean("console");
	//Exam exam = context.getBean(Exam.class);
	//System.out.println(exam.toString());
	
	ExamConsole console = context.getBean(ExamConsole.class);
	console.print();
	//List<Exam> exams = (List<Exam>) context.getBean("exams");
	
	//for(Exam e:exams) {
		//System.out.println(e);
	//}
	
	}

}
