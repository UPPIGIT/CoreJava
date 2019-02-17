package colletions.HashsetDemo;

public class Student {

	private Integer stId;
	private String stName;
	private Integer marks;
	private String grade;

	public Student(Integer stId, String stName, Integer marks, String grade) {

		this.stId = stId;
		this.stName = stName;
		this.marks = marks;
		this.grade = grade;
	}

	public Integer getStId() {
		return stId;
	}

	public void setStId(Integer stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return  stId + " , " + stName + " , " + marks +  " , " + grade ;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.getStId().equals(student.getStId());

	}   
	
	@Override
	public int hashCode() {
		
		return this.getStId();
	}

}
