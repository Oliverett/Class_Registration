
/*Mis 350 HW11 
 * Elijah Oliver 
 * This program creates student objects and calls methods
*/
import java.util.Scanner;

public class Registration {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
         //hw 11 create multiple objects and place in array               
      /* 1. instantiate the Students class - Create a student object
      Students stud1 = new Students();
      Students stud2 = new Students("John","Smith");
      Students stud3 = new Students("James","Bond",52);
      */
      // 6. Create a batch of students using array
      Students [] studs = new Students [10];
      
      studs[0]= new Students ("Adam","Alexa",25);
      studs[1]= new Students("Ben","Burro",34);
      studs[2]= new Students("Chris","Camper",41);
      
      int p = 3;
      
      
      //add student
      studs[p] = new Students("Dan","Darben",23);
      p++;
       
      /* 2. Set the student name      
           System.out.print("Enter your first name:");
           String fname = input.next();
           System.out.print("Enter your last name:");
           String lname = input.next();
           
           stud1.setName(fname,lname);
      // 4. credit earned
           System.out.println("How many credits are you approved to transfer?");
           stud1.transferCredit(input.nextInt());
      // 3. class year
           stud1.setClassYear();
      /* Display student greeting message
           stud1.displayMessage();
           stud2.displayMessage();
           stud3.displayMessage();
           */
      // 5. Status checking with get methods. 
            
          // System.out.printf("Hi %s,\n\nYou need %d more credits to graduate in %d.\n\nRegistrar's Office",stud1.getName(),120-stud1.getCredit(),stud1.getClassYear());
          // stud1.StatusChecking();
           
      // 7. Test on more students
      for (int i = 0; i < p; i++) {
    	  studs[i].displayMessage();
      }
      
      // 8. Search for students
           
      int rIndex = searchStud(studs,p);
      
      /* if (rIndex != -1) {
    	 //found student 
    	  System.out.printf("%s needs %d this many credit hours to graduate in %d.\n",
    			  studs[rIndex].getName(),120 - studs[rIndex].getCredit(),studs[rIndex].getClassYear());
      }
      else {
    	  //cant find student
    	  System.out.print("Enter your first name: ");
    	  String fname = input.next();
    	  System.out.print("Enter your last name: ");
    	  String lname = input.next();
    	  System.out.print("Enter your credit hours: ");
    	  int tCredit  = input.nextInt();
    	  
    	  studs[p] = new Students(fname,lname,tCredit);
          p++;	  
      } */
      //HW 11
           System.out.println("***********************HW11*********************");
      
         //hw 11 create multiple course objects and place in array
           CrsSec [] crsscs = new CrsSec [10];
           
           crsscs [0] = new CrsSec ("mis303","007",3,40);
           crsscs [1] = new CrsSec ("mis350","008",3,40);
           crsscs [2] = new CrsSec ("mis330","000",3,40);
           
           int q = 3;
       /*     CrsSec sec1 = new CrsSec();
           //2. prompt to users and ask for inputs for 1st 4 instances
           System.out.println("Enter Course ID");
           sec1.setCrsID(input.next());
           System.out.println("Enter section number");
           sec1.setsecNum(input.next());
           System.out.println("How many credits are in this course?");
           sec1.setcrsCredit(input.nextInt());
           System.out.println("Enter seat limit");
           sec1.setseatLimit(input.nextInt()); */
           
           
           //3. print table header line and call that displayCrsSec()
            //  sec1.displayCrsSec();
           	  System.out.println("|\tCourse ID-Section\t|\tCourse Credit\t|\t Seat Limit\t|\tEnrollment\t|\tStatus\t|");
              System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            //for loop to print all available course sections
              for (int i = 0; i < q; i++) {
            	  crsscs[i].displayCrsSec();
              }
              
              
              //allow user to enter course id to add course(search method)
              int cIndex = searchCrs(crsscs, q);
              
              
              /*System.out.println("Press Enter if you want to enroll into the class.");
              input.nextLine(); */
              
              
              
              
           //check student and semester credits for eligibility
              
             if(studs[cIndex].checksmtCredit(crsscs[cIndex].getcrsCredit()) && crsscs[cIndex].displayCrsSecf()) {
            	 studs[cIndex].addsmtCreditint(crsscs[cIndex].getcrsCredit());
            	 crsscs[cIndex].addenrollment();
             }
             else {
            	 System.out.println("You cannot enroll in this class due to credit limit or no seats available.\n");
             } 
              
              
              
            
            
              
              
              
           
           //5.print table header line and call that displayCrsSec()
             //for loop course sections updates
             System.out.println("|\tCourse ID-Section\t|\tCourse Credit\t|\t Seat Limit\t|\tEnrollment\t|\tStatus\t|");
             System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
             for (int i = 0; i < q; i++) {
           	  crsscs[i].displayCrsSec();
             }
              System.out.println("You have been enrolled");
   }  
   
   // search methods
   public static int searchStud(Students[] sl, int p) {
	  Scanner input = new Scanner(System.in);
	  
	  //prompt and take user input
	  System.out.println("Enter a student name for search: ");
	  String name = input.next();
	  
	  // for loop to search in array
	  for (int i = 0; i<p; i++) {
		  if (sl[i].getName().contains(name)) {
			  return i;
		  }
	  }
	  
	  //return
	  
	  return -1;
   }
   
   public static int searchCrs(CrsSec [] cl, int q) {
	   Scanner input = new Scanner(System.in);
		  
		  //prompt and take user input
		  System.out.println("Enter Course ID to register");
		  String cname = input.next();
		  
		  // for loop to search in array
		  for (int i = 0; i<q; i++) {
			  if (cl[i].getCrsID().contains(cname)) {
				  return i;
			  }
		  }
   
   return -1;
   
   	}
   
}