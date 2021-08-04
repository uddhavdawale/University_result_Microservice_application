package ud.student.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import ud.student.demo.entity.Student_Reg;


public class Student_Regdup 
{
	
	private Student_Reg sr;
	private Result result;
	public Student_Regdup() {}
	public Student_Regdup(Student_Reg sr, Result result) {
		super();
		this.sr = sr;
		this.result = result;
	}
	public Student_Reg getSr() {
		return sr;
	}
	public void setSr(Student_Reg sr) {
		this.sr = sr;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	
	
}
