package ud.student.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="Registration")
public class Student_Reg 
{
	@Id
	private  int PRN;
	private  String Fname;
	private String Mname;
	private   String lname;
	private String course;
	private  String  branch;
	private  String courseid;
	public Student_Reg() {}
	
	public Student_Reg(int pRN, String fname, String mname, String lname, String course, String branch,
			String courseid) {
		
		PRN = pRN;
		Fname = fname;
		Mname = mname;
		this.lname = lname;
		this.course = course;
		this.branch = branch;
		this.courseid = courseid;
	}

	public int getPRN() {
		return PRN;
	}

	public void setPRN(int pRN) {
		PRN = pRN;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	
	
}
