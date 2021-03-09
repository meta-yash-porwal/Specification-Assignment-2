import java.util.*;

/**
 * Marksheet class is used to define the marks of student
 * It has method like maxGrade, minGrade, passPercentage
 * 
 * @author yash.porwal_metacube
 *
 */
public class Marksheet {
	/**
	 * it is a integer list of listofMarks of all Students 
	 */
	public  static List<Integer> listOfMarks = new ArrayList<Integer>();
	
	/**
	 * it is used to find the average of marks of all students
	 * @param listOfMarks it is a list which contain marks of all students
	 * @return the double value of integer.
	 * @throws ArithmeticException as it return divided double value 
	 * so we have to check it is not divided by zero
	 */
	public double avg(List<Integer> listOfMarks)throws ArithmeticException
	{
		int sum = 0;
		for(int i=0; i<listOfMarks.size(); i++)
		{
			sum += listOfMarks.get(i);
		}
		return sum / listOfMarks.size();
	}
	
	/**
	 * it return the maximum grade from listOfMarks of a student
	 * @param listOfMarks from this list it iterate and finds the maximum Grade
	 * @return integer value of maximum grade
	 */
	public int maxGrade(List<Integer> listOfMarks)
	{
		int maxgrade = listOfMarks.get(0);
		for(int i=1; i<listOfMarks.size(); i++)
		{
			if (maxgrade < listOfMarks.get(i)){
				maxgrade = listOfMarks.get(i);
			}
		}
		return maxgrade;
	}
	
	/**
	 * this method finds minimum grade from listOfMarks
	 * @param listOfMarks from this list it iterate and finds the minimum Grade
	 * @return it returns the maximum grade 
	 */
	public int minGrade(List<Integer> listOfMarks)
	{
		int mingrade=listOfMarks.get(0);
		for(int i=1; i<listOfMarks.size(); i++){
			if (mingrade > listOfMarks.get(i)){
				mingrade = listOfMarks.get(i);
			}
		}
		return mingrade;
	}
	
	/**
	 * this check how many students are passed from the listOfMarks 
	 * passing marks should be >= 40
	 * then it calculate the pass percentage of students 
	 * from total no. of students
	 * @param listOfMarks it is the list of marks of all students
	 * @return double value of percentage of pass students
	 * @throws ArithmeticException as it return divided double value 
	 * so we have to check it is not divided by zero
	 */
	public double passPercentage(List<Integer> listOfMarks)throws ArithmeticException
	{
		int tot = 0;
		for(int i=0; i<listOfMarks.size(); i++){
			if(listOfMarks.get(i)>=40){
				tot += 1;
			}
		}
		return (tot*100)/listOfMarks.size();
	}
	
	public static void main(String[] args)
	{
		Marksheet mark = new Marksheet();
		Scanner sc = new Scanner(System.in);
		int n;
		/*
		 * in try we should try the code and 
		 * if there is any error in the code 
		 * it should the command to catch the exception  
		 */
		try{
		System.out.print("Enter Number of Students : ");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Grades for " + (i+1) +" student :");
			listOfMarks.add(sc.nextInt());
		}
		sc.close();
	
		System.out.println("\nThe Average of the grades of all Students : " + mark.avg(listOfMarks));
		System.out.println("\nThe Maximum of the grades of all Students : " + mark.maxGrade(listOfMarks));
		System.out.println("\nThe Minimum of the grades of all Students : " + mark.minGrade(listOfMarks));
		System.out.println("\nThe Percentage of students passed are : " + mark.passPercentage(listOfMarks) + "%");
		}
		/*
		 * it catches the ArithmeticException 
		 * and prints that a number can't be divided by zero
		 */
		catch(ArithmeticException e)
		{
			System.out.println("Sorry!, Number of Students cannot be Zero");
		}
	}

}