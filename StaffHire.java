 

public class StaffHire {
	private String designation;
	private String jobType;
	private int vacancyNo;

	public StaffHire(int vacancyNo, String designation, String jobType) {
		this.designation = designation;
		this.jobType = jobType;
		this.vacancyNo = vacancyNo;
	}

	public String getdesignation() {
		return this.designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public String getjobType() {
		return this.jobType;
	}

	public void setjobType(String jobtype) {
		this.jobType = jobType;
	}

	public int getVacancyNumber() {
		return this.vacancyNo;
	}

	public void setVacancy(int vacancy) {
		this.vacancyNo = vacancyNo;
	}

	public void display() {
		System.out.println("=========================================");
		System.out.println("============VACANCY DESCRIPTION==========");
		System.out.println("=========================================");
		System.out.println("");
		System.out.println("	Position : " + this.getdesignation());
		System.out.println("");
		System.out.println("	Job Type : " + this.getjobType());
		System.out.println("");
		System.out.println("	Vancany Number	: " + getVacancyNumber());
		System.out.println("");
	}
}
