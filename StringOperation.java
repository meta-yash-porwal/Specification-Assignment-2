import java.util.Scanner;

/**
* 
* it is a class StringOperation which is used for 
* string comparison, string reverse, string replace, largest word in the string
* 
* @author yash.porwal_metacube
*
*/
public class StringOperation {
	String str1;
	String str2;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * stringCmp is used for Compare(check whether two strings are equal or not) 
	 * two String in terms of their length
	 * @param str1 is a 1st string
	 * @param str2 is a 2nd string
	 * @return integer value - 0(2 strings are Not Equal), 1(2 strings are Equal)
	 */
	public int stringCmp(String str1,String str2)
	{
		int len1=str1.length();
		int len2=str2.length();
		int lenMin=Math.min(len1,len2);
		for(int i=0;i<lenMin;i++)
		{
			int str1_ch=(int)(str1.charAt(i));
			int str2_ch=(int)(str2.charAt(i));
			if(str1_ch!=str2_ch){
				return 0;
			}
		}
		if(len1!=len2){
			return 0;
		}
		else{
		return 1;	
		}
	
	}
	
	/**
	 * stringRev is used to reverse the string 
	 * @param str is string which is being reversed 
	 * @return reverse string
	 */
	public String stringRev(String str)
	{
		String rev;
		int lenStr = str.length();
		char [] ch = new char[lenStr];
		for(int i=lenStr-1, j=0; i>=0; i--, j++) {
			ch[j] = str.charAt(i);
		}
		rev = new String(ch);
		return rev;
	}
	
	/**
	 * stringReplace is used to replace upper case character to lower case
	 * And lower case character to upper case
	 * @param str which is being replaced
	 * @return replaced string
	 */
	public String stringReplace(String str)
	{
		StringBuffer newstr=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newstr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		str = newstr.toString();
		return str;
	}
	
	/**
	 * this method finds the largest word in the string
	 * (If two words are of same length then return last word)
	 * @param str string which has word
	 * @return the largest word(string) from the string str
	 */
	public String stringLargest(String str )
	{
		
		String [] words=str.split(" ");
		String longestWord="";
		for(int i=0; i<words.length; i++)
		{
			if(words[i].length()>=longestWord.length())
			{
				longestWord=words[i];
			}
		}
		return longestWord;
		
	}

	public static void main(String[] args)
	{
		StringOperation stringObj=new StringOperation();
		
		
		System.out.print("Enter 1st String:-  ");
		stringObj.str1 = sc.nextLine();
		System.out.print("Enter 2nd String:-  ");
		stringObj.str2 = sc.nextLine();
		
		
		System.out.println("\nString 1 : "+stringObj.str1);
		
		System.out.println("\nString 2 : "+stringObj.str2);
		
		
		System.out.println("\nString Comparison Operation : ");
		System.out.println(stringObj.stringCmp(stringObj.str1, stringObj.str2));
		
		
		System.out.println("\nString Replacing Operation on string 1 : ");
		System.out.println(stringObj.stringReplace(stringObj.str1));
		
		System.out.println("\nString Replacing Operation on string 2 : ");
		System.out.println(stringObj.stringReplace(stringObj.str2));
		
		
		System.out.println("\nString Reversing Operation on string 1 : ");
		System.out.println(stringObj.stringRev(stringObj.str1));
		
		System.out.println("\nString Reversing Operation on string 2 : ");
		System.out.println(stringObj.stringRev(stringObj.str2));
		
		
		System.out.println("\nString Largest Repeating Alphabet Operation on string 1 : ");
		System.out.println(stringObj.stringLargest(stringObj.str1));
		
		System.out.println("\nString Largest Repeating Alphabet Operation on string 2 : ");
		System.out.println(stringObj.stringLargest(stringObj.str2));
	}
    
}