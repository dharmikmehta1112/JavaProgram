package StringDemo;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a statement (include some special character):: ");
		String str = key.next();
		RemoveSpecialCharacter rsc = new RemoveSpecialCharacter();
		System.out.println("Statement after removing special character:: " + rsc.removeSpChar(str));
	}

	public String removeSpChar(String str) {
		String result = "";
		int j = str.length();
		System.out.println("Length of an enter statement:: " + j);
// Option 1
		String newStr = str.replaceAll("\\W", "");
		result = result + newStr;
// Option 2		
//		String strArr[] = str.split("\\W");				// \W gives only alphanumeric character and underscore [A-Za-z0-9_]
//		for(int i=0; i<str.length(); i++)				// \w gives all special character except underscore. \d gives only digits [0-9]
//		{
//			result = result + strArr[i];
//		}
			
		return result;
	}
}