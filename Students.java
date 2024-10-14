//This is Students class with states and methods to define a model. 
import java.util.Calendar;


public class Students {   
   // Instance Variables
      private String studName;
      private int classYear;
      private int credit;
      private int smtCredit;
   // Constructors
      //default
      public Students() {
    	  
      }
      //name constructor
      public Students(String fn, String ln) {
    	  studName = ln + "," + fn;
      }
      //all info
      public Students(String fn, String ln,int tc){
    	  studName = ln + "," + fn;
    	  credit = tc;
    	  
    	  Calendar now = Calendar.getInstance();
     	   int year = now.get(Calendar.YEAR);
     	   if (credit >= 90) {
     		 classYear = year +1;
     	   }
     	   else if(credit>=60) {
     		 classYear = year +2;
     	   }
     	 else if(credit>=30) {
     		 classYear = year +3;
     	   }
     	 else 
     	  classYear = year +4;
      }
   // Set methods
     public void setName(String fn, String ln) {
    	 studName = ln + "," + fn;
     }
     public void setClassYear(){
  	   Calendar now = Calendar.getInstance();
  	   int year = now.get(Calendar.YEAR);
  	   if (credit >= 90) {
  		 classYear = year +1;
  	   }
  	   else if(credit>=60) {
  		 classYear = year +2;
  	   }
  	 else if(credit>=30) {
  		 classYear = year +3;
  	   }
  	 else 
  	  classYear = year +4;
  	   
     }
     
     public void transferCredit(int tc) {
    	 credit = tc;
     }
     
     public void semesterCredit(int ec) {
    	 credit+= ec;
     }
   // Get methods
    public String getName(){
    	return studName;
    }  
    public int getClassYear() {
    	return classYear;
    }
    public int getCredit() {
    	return credit;
    }
   // Display method   
   public void displayMessage () {
		System.out.printf("Hello, %s, class of %d!\n",studName, classYear);
	}
   public void StatusChecking() {
	   System.out.printf("Hi %s,You need %d more credits to graduate in %d.\nRegistrar's Office",studName,120-credit,classYear);
   }
   
   
   
   
   //check semester credit
   public boolean checksmtCredit(int cr){
	   
	   if(smtCredit + cr > 15) {
		   System.out.println("This course will bring your semester credits over 15");
		   return false;
	   }
	   else {
		   return true;
	   }
   }
   public void addsmtCreditint (int cr) {
	   smtCredit += cr;
   }
      
}

