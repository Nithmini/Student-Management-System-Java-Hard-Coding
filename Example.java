import java.util.*;

public class Example {
	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}																                                                 } 
			catch (final Exception e) {
				e.printStackTrace();             
				//  Handle any exceptions.
			 }    
		}
                //////////////////////////////////////////////
                public static final int MAX_STUDENTS = 100;
                public static final int ID = 0;
                public static final int NAME = 1;
                public static final int PFMARKS = 2;
		        public static final int DBMARKS = 3;

		public static String[][] students = new String[MAX_STUDENTS][4];
                public static int numStudents = 0;
            
		public static void main(String[] args) {
                    boolean cont = true; 
                    while(cont) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("|                                         WELCOME TO  GDSE MARKS MANAGEMENT SYSTEM                                                |");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("[1] Add New Student                                                 [2] Add New Student With Marks");
			System.out.println("[3] Add Marks                                                       [4] Update Student Details");
			System.out.println("[5] Update Marks                                                    [6] Delete Student");
			System.out.println("[7] Print Student Details                                           [8] Print Student Ranks");
			System.out.println("[9] Best in Programming Fundamentals                                [10] Best in Database Management System");
                        System.out.println("[11] Quit");
            System.out.println();
			System.out.print("Enter an Option to Continue > ");
			Scanner input = new Scanner(System.in);
			int option =input.nextInt() ;

			
			
				switch (option) {
					case 1:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                     ADD NEW STUDENT                                                            |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					addNewStudent();
					
					//student[]
                    break;
                    
					case 2:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                     ADD NEW STUDENT WITH MARKS                                                 |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					addNewStudentWithMarks();
					
                    break;
					
					case 3:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                     ADD MARKS                                                                  |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					addMarks();
                    break;
                    
					case 4:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                UPDATE STUDENT DETAILS                                                          |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					updateStudentDetails(students);
                    break;
                     
					case 5:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  UPDATE MARKS                                                                  |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					updateMarks(students);
                    break;
                    
					case 6:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  DELETE STUDENT                                                                |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					deleteStudent(students);
                    break;
                        
					case 7:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  PRINT STUDENT DETAILS                                                         |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					printStudentDetails(students);
                    break;
                    /* 
					case 8:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  PRINT STUDENT RANKS                                                           |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					printStudentRanks(students);
                    break;

					case 9:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                             BEST IN PROGRAMMING FUNDAMENTALS                                                   |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					bestInProgrammingFundamentals(students);
                    break;

					case 10:
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("|                                            BEST IN DATABASE MANAGEMENT SYSTEM                                                  |");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					bestInDatabaseManagementSystem(students);
                    break;*/

					default :
					    System.out.println("Invalid Number.Please Enter The Correct Option.");
					case 11:
                                        cont = false;
                    break;
				}
                            }
			}




			//method for functions
			//1.Find next index
			public static int findNextindex(){
				int nextIndex = students.length-1;
				for(int i=0; i<students.length; i++){
					if(students[i][0] == null){
						nextIndex = i;
                                                break;
                                        }
				}
				return nextIndex;
			}
			//2.valid ID
			public static boolean validateID(String id){
				for(int i=0; i<students.length; i++){
					if(students[i][0] != null && id.equals(students[i][0])) {
						return false;
                                        }
				}
				return true;
			}
            /////////////////////////////////////////////////////////////////////////////////////////////
			public static void addNewStudent(){
			Scanner scanner1 = new Scanner(System.in);
                        char cheak= 'n';
			String id;
			boolean b= true;
                        int i=0;
				
				do{
					
						do{
							System.out.print("Enter Student ID:");
							id=scanner1.next();
							//student[i][0]=scanner1.next();
							i=findNextindex();
							b=validateID(id);
	
							if(b){
								students[i][0]=id;
							}
							else{
								System.out.println("The Student ID Already Exists.");
							}
						}
						while(b==false);
                                                
						System.out.print("Enter Student Name: ");
						String name=scanner1.next();
	
						System.out.println();
						students[numStudents][NAME] = name;
						numStudents++;
	
						System.out.print("Student has been added successfully.Do you want to add a new student(y\\n) :");
						cheak=scanner1.next().charAt(0);//find this
						System.out.println();
						//student[i][0]=id;
						
						
					}
					while(cheak=='y');
					clearConsole();
					
				}
				///////////////////////////////////////////////////////////////////////////////////
				public static void addNewStudentWithMarks(){
					clearConsole();
					Scanner scanner1= new Scanner(System.in);
					char cheak='n';
					int marks=0, i;
					String id,pfmarks,dbmarks;
					boolean b= true;
	
					do{
						do{
						System.out.print("Enter Student ID:");
							id=scanner1.next();
							//student[i][0]=scanner1.next();
							i=findNextindex();
							b=validateID(id);
	
							if(b){
								students[i][0]=id;
							}
							else{
								System.out.println("The Student ID Already Exists.");
								System.out.println();
							}
						}
						while(b==false);
						System.out.print("Enter Student Name: ");
						String name=scanner1.next();
						System.out.println();
						
						do{
						System.out.print("Programming Fundamentals Marks: ");
						 pfmarks=scanner1.next();
						 marks=Integer.parseInt(pfmarks);//string data convert and store in int variable
						if(marks>100||marks<0){
							System.out.println("Invalid Marks, Please Enter Correct marks: ");
							System.out.println();}
						}while(marks>100||marks<0); 
					   
					   do{
						System.out.print("Database Management System Marks: ");
						 dbmarks=scanner1.next();
						marks=Integer.parseInt(dbmarks);//string data convert and store in int variable
						if(marks>100||marks<0){
							System.out.println("Invalid Marks, Please Enter Correct marks: ");
							System.out.println(); } 
							System.out.println();
						}while(marks>100||marks<0);
						
	
						students[numStudents][NAME] = name;
						students[numStudents][PFMARKS] =pfmarks;
						students[numStudents][DBMARKS] = dbmarks;
	
						numStudents++;
						
						System.out.println("Student has been added successfully.Do you want to add a new student(y\\n) :");
						cheak=scanner1.next().charAt(0);//find it
						System.out.println();
			    		
				}
				while(cheak=='y');
				clearConsole();
			
			}
		//////////////////////////////////
		
		/////////////////////////////
			public static void addMarks(){
				clearConsole();
				Scanner scanner1= new Scanner(System.in);
				char cheak = 'n';
				int marks=0, index=0;
				String key,pfmarks,dbmarks;
				boolean isMissing;
			
			do{

                                        

                                        isMissing = true;
                                        System.out.print("Enter student index: ");
                                            key = scanner1.next();  

                                            for(int i=0; i<students.length; i++) {

                                            if(key.equals(students[i][0])){
                                                    //String name=search(students, id);
                                                    System.out.println("Student Name : "+students[i][1]);
                                                    index = i;

                                            do{
                                                    System.out.print("Programming Fundamentals Marks: ");
                                                     pfmarks=scanner1.next();
                                                     marks=Integer.parseInt(pfmarks);//string data convert and store in int variable
                                                    if(marks>100||marks<0){
                                                            System.out.println("Invalid Marks, Please Enter Correct marks: ");
                                                            System.out.println();}
                                            }while(marks>100||marks<0); 

                                            do{
                                                    System.out.print("Database Management System Marks: ");
                                                     dbmarks=scanner1.next();
                                                    marks=Integer.parseInt(dbmarks);//string data convert and store in int variable
                                                    if(marks>100||marks<0){
                                                            System.out.println("Invalid Marks, Please Enter Correct marks: ");
                                                            System.out.println(); } 
                                                            System.out.println();
                                            }while(marks>100||marks<0);

                                            students[index][PFMARKS] =pfmarks;
                                            students[index][DBMARKS] = dbmarks;

                                            System.out.print("Marks has been added successfully.Do you want to add a new mark(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                            isMissing = false;
                                            break;
                                            }
                                        }
                                        if(isMissing) {
                                            System.out.println("Student not found. Please try again.");
                                            System.out.print("Do you want to try again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);
                                            System.out.println();
											System.out.print("Enter Student Name:");
											String name=scanner1.next();
											do{
												System.out.print("Programming Fundamentals Marks: ");
												 pfmarks=scanner1.next();
												 marks=Integer.parseInt(pfmarks);//string data convert and store in int variable
												if(marks>100||marks<0){
														System.out.println("Invalid Marks, Please Enter Correct marks: ");
														System.out.println();}
										}while(marks>100||marks<0); 

										do{
												System.out.print("Database Management System Marks: ");
												 dbmarks=scanner1.next();
												marks=Integer.parseInt(dbmarks);//string data convert and store in int variable
												if(marks>100||marks<0){
														System.out.println("Invalid Marks, Please Enter Correct marks: ");
														System.out.println(); } 
														System.out.println();
										}while(marks>100||marks<0);
                                        students[numStudents][NAME]=name;
										students[numStudents][PFMARKS] =pfmarks;
										students[numStudents][DBMARKS] = dbmarks;
                                        
										numStudents++;
						
						                System.out.println("Student has been added successfully.Do you want to add a new student(y\\n) :");
						                cheak=scanner1.next().charAt(0);//find it
						                System.out.println();


                                        }
                                        
		
		
				}while(cheak=='y');
	             clearConsole();
	}	

			
        
	


////////////////////////////////////////
 
	public static void updateStudentDetails(String [][]student){
		clearConsole();
				Scanner scanner1= new Scanner(System.in);
				char cheak = 'n';
				int marks=0, index=0;
				String key,pfmarks,dbmarks;
				boolean isMissing;
        do{

                                        

                                        isMissing = true;
                                        System.out.print("Enter student index: ");
                                            key = scanner1.next();  

                                            for(int i=0; i<students.length; i++) {

                                            if(key.equals(students[i][0])){
                                                    
                                                    System.out.println("Student Name : "+students[i][1]);
                                                    index = i;

                                                    System.out.print("Student New Name : ");
													String name=scanner1.next();
													students[numStudents][NAME]=name;


                                            System.out.print("Updated successfully.Do you want to Update Again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                            isMissing = false;
                                            break;
                                            }
                                        }
                                        if(isMissing) {
                                            System.out.println("Student not found. Please try again.");
                                            System.out.print("Do you want to try again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                        }
                                        
		
		
				}while(cheak=='y');
	             clearConsole();
		}
	

		public static void updateMarks(String [][]students){
		    clearConsole();
				Scanner scanner1= new Scanner(System.in);
				char cheak = 'n';
				int marks=0, index=0;
				String key,pfmarks,dbmarks;
				boolean isMissing;
        do{

                                        

                                        isMissing = true;
                                        System.out.print("Enter student index: ");
                                            key = scanner1.next();  

                                            for(int i=0; i<students.length; i++) {

                                            if(key.equals(students[i][0])){
                                                    
                                                    System.out.println("Student Name : "+students[i][1]);
                                                    index = i;
													System.out.println("Student Programming Fundamentals Marks : "+students[i][2]);
                                                    index = i;
													System.out.println("Student Database Management System Marks : "+students[i][3]);
                                                    index = i;
                                                    System.out.println();
                                                    System.out.print("Student New Programming Fundamentals Marks  : ");
													pfmarks=scanner1.next();
													System.out.print("Student New Database Management System Marks  : ");
													dbmarks=scanner1.next();
													students[numStudents][PFMARKS] =pfmarks;
										            students[numStudents][DBMARKS] = dbmarks;


                                            System.out.print("Updated successfully.Do you want to Update Again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                            isMissing = false;
                                            break;
                                            }
                                        }
                                        if(isMissing) {
                                            System.out.println("Student not found. Please try again.");
                                            System.out.print("Do you want to try again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                        }
                                        
		
		
				}while(cheak=='y');
	             clearConsole();	

		}
	

		public static void deleteStudent(String [][]student){
			clearConsole();
				Scanner scanner1= new Scanner(System.in);
				char cheak = 'n';
				int marks=0, index=0;
				String key,pfmarks,dbmarks;
				boolean isMissing;
        do{

                                        

                                        isMissing = true;
                                        System.out.print("Enter student index: ");
                                            key = scanner1.next();  

                                            for(int i=0; i<students.length; i++) {

                                            if(key.equals(students[i][0])){
                                                    System.out.println("Delete Student");

                                            System.out.print("Deleted successfully.Do you want to Delete Again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                            isMissing = false;
                                            break;
                                            }
                                        }
                                        if(isMissing) {
                                            System.out.println("Student not found. Please try again.");
                                            System.out.print("Do you want to try again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                        }
                                        
		
		
				}while(cheak=='y');
	             clearConsole();	

		}

		public static void printStudentDetails(String [][]student){
			clearConsole();
				Scanner scanner1= new Scanner(System.in);
				char cheak = 'n';
				int marks=0, index=0;
				String key,pfmarks,dbmarks;
				boolean isMissing;
        do{

                                        

                                        isMissing = true;
                                        System.out.print("Enter student index: ");
                                            key = scanner1.next();  

                                            for(int i=0; i<students.length; i++) {
                                            if(key.equals(students[i][0])){
												System.out.println("Student Name : "+students[i][1]);
												index = i;
												System.out.println();
												System.out.println("Student PF Marks:\t\t "+students[i][2]);
												System.out.println("Student DB Marks:\t\t"+ students[i][2]);
												//String total=students[i][2]+students[i][2];
												//System.out.println(total);

                                                
                                                
        }
												
                                                    

                                            System.out.print("Deleted successfully.Do you want to Delete Again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                            isMissing = false;
                                            break;
                                            }
                                        
                                        if(isMissing) {
                                            System.out.println("Student not found. Please try again.");
                                            System.out.print("Do you want to try again(y\\n) :");
                                            cheak=scanner1.next().charAt(0);//find it
                                            System.out.println();
                                        }
                                        
		
		
				}while(cheak=='y');
	             clearConsole();	

		}
        ////////////////////////////






















	}
	