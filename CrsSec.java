// Instantiable class for Course section
public class CrsSec {
	// instance variables
	private String crsID;
	private String secNum;
	private int crsCredit;
	private int seatLimit;
	private int enrollment;
	//hw 11 create constructors for course details 4 methods
	public CrsSec(){
		
	}
	public CrsSec(String cid, String sNum, int cCredit, int sL) {
		crsID = cid;
		secNum = sNum;
		crsCredit = cCredit;
		seatLimit = sL;
	}
	//set methods
	//1st 4 set methods
	public void setCrsID(String cid) {
		crsID = cid;
	}
	public void setsecNum(String sNum) {
		secNum = sNum;
	}
	public void setcrsCredit(int cCredit) {
		crsCredit = cCredit;
	}
	public void setseatLimit(int sL) {
		seatLimit = sL;
	}
	
	//get methods (5)
	public String getCrsID() {
		return crsID;
	}
	public String getsecNum() {
		return secNum;
	}
	public int getcrsCredit() {
		return crsCredit;
	}
	public int getseatLiimit() {
		return seatLimit;
	}
	public int getenrollment() {
		return enrollment;
	}
	//display course section method
	public void displayCrsSec() {
		int remainingseat = seatLimit - enrollment;
		
		String status;
		if (remainingseat>0) {
			status = "open";
		}
		else {
			status = "full";
		}
			
		System.out.printf("|\t%7s-%9s\t|\t%13d\t|\t%10d\t|\t%10d\t|\t%6s\t|\n",crsID,secNum,crsCredit,seatLimit,enrollment,status);
		
		//2 methods to check seats enrollment++
	}
	public void addenrollment () {
		   enrollment ++;
	   }
	public boolean displayCrsSecf() {
		int remainingseat = seatLimit - enrollment;
		
		
		if (remainingseat<=0) {
			System.out.println("This course if full");
			   return false;
		}
		else {
			return true;
		}
			
		
	}
}
