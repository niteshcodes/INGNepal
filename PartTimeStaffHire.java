/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Nitesh Poudel)
 * @version (0.1)
 */
public class PartTimeStaffHire extends StaffHire {
	// declearing different instance variable of child class.
	// using private as an access modifier
	private String staffName;
	private String qualification;
	private String appointedBy;
	private String joiningDate;
	private String shifts;
	private float workingHour;
	private float wagesPerHour;
	private boolean joined;
	private boolean terminated;

	// creating a constructor for initializing instance variables
	public PartTimeStaffHire(int vacancyNumber, String position, String jobType, float workingHour, float wagesPerHour,
			String shifts) {
		super(vacancyNumber, position, jobType);
		this.staffName = "";
		this.qualification = "";
		this.appointedBy = "";
		this.joiningDate = "";
		this.shifts = shifts;
		this.workingHour = workingHour;
		this.wagesPerHour = wagesPerHour;
		this.joined = false;
		this.terminated = false;
	}
	// creating accessor methods which return values of instance variables.

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAppointedBy() {
		return appointedBy;
	}

	public void setAppointedBy(String appointedBy) {
		this.appointedBy = appointedBy;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getShifts() {
		return shifts;
	}

	public void setshifts(String shifts) {
		if (this.joined) {
			System.out.println("Staff is already hired therefore new shifts is not allowed");
		} else {
			this.shifts = shifts;
		}
	}

	public float getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(float workingHour) {
		this.workingHour = workingHour;
	}

	public float getWagesPerHour() {
		return wagesPerHour;
	}

	public void setWagesPerHour(float wagesPerHour) {
		this.wagesPerHour = wagesPerHour;
	}

	public boolean isJoined() {
		return joined;
	}

	public void setJoined(boolean joined) {
		this.joined = joined;
	}

	public boolean isTerminated() {
		return terminated;
	}

	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}

	public void hirePartTime(String staffName, String joiningDate, String qualification, String appointedBy) {
		if (this.joined) {
			System.out.println("Sorry! Staff has been already hired");
		} else {
			this.staffName = staffName;
			this.qualification = qualification;
			this.appointedBy = appointedBy;
			this.joiningDate = joiningDate;
			this.joined = true;
			this.terminated = false;
		}
	}

	// creating method to check weather the staff has been terminated or not.
	public void staffTerminated() {
		if (this.terminated) {
			System.out.println("Staff has been terminated.");
		} else {
			this.staffName = "";
			this.qualification = "";
			this.appointedBy = "";
			this.joiningDate = "";
			this.joined = false;
			this.terminated = true;
		}
	}

	public void display() {
		super.display();
		if (this.joined) {
			System.out.println("=========================================");
			System.out.println("===========PART TIME STAFF HIRE==========");
			System.out.println("=========================================");
			System.out.println("");
			System.out.println("	Staff Name :	" + this.getStaffName());
			System.out.println("");
			System.out.println("	Qualification :	" + this.getQualification());
			System.out.println("");
			System.out.println("	Appointed By : " + this.getAppointedBy());
			System.out.println("");
			System.out.println("	Joining Date : " + this.getJoiningDate());
			System.out.println("");
			System.out.println("	Working Hour : " + this.getWorkingHour() +" hours");
			System.out.println("");
			System.out.println("	Wages Per Hour : " + this.getWagesPerHour() +" Ru.");
			System.out.println("");
			System.out.println("	Income Per Day : " + this.getWagesPerHour() * this.getWorkingHour() + " Ru.");
			System.out.println("");
		}
	}
}
