package colletions.list.StudentDemo;

public class Student {
	
	private Integer stId;
	private String stName;
	private Integer stClass;
	private Integer stMarks;
	private String stGrade;
	
	public Student(Integer stId, String stName, Integer stClass, Integer stMarks, String stGrade) {
	
		this.stId = stId;
		this.stName = stName;
		this.stClass = stClass;
		this.stMarks = stMarks;
		this.stGrade = stGrade;
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

	
	@Override
	public int hashCode() {
		
		return this.stId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stId == null) {
			if (other.stId != null)
				return false;
		} else if (!stId.equals(other.stId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ","
				+ " stClass=" + stClass + ","
						+ " stMarks=" + stMarks
				+ ", stGrade=" + stGrade + "]";
	}

	public Integer getStClass() {
		return stClass;
	}

	public void setStClass(Integer stClass) {
		this.stClass = stClass;
	}

	public Integer getStMarks() {
		return stMarks;
	}

	public void setStMarks(Integer stMarks) {
		this.stMarks = stMarks;
	}

	public String getStGrade() {
		return stGrade;
	}

	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	
	
	
	

}
