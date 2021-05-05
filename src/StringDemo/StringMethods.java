package StringDemo;
class StringMethods
{
 public static void main (String[] args)
 {
//*******String Literal***********
	String str1 = "  D N Mehta  ";

//*******String Object / Refernce Data Type***********
	String str2 = new String("D N Mehta");
	// str2 = "D N Mehta";

//*******String Literal***********
	String str3 = "D N Mehta";
	
//*********** Empty String ***********
	String str4 = "";	
	
	System.out.println(str1 == str3);			//true
	System.out.println(str1 == str2);			//false
	System.out.println(str1.equals(str2));		//true
	
//********** String Length ***********
	System.out.println("String Length is " +str1.length());

//********** String Character Position ***********
	System.out.println("Character at position 5th is " +str3.charAt(4));

//********** SubString Position ***********
	System.out.println("Substring from postion 5 to 9 is " +str3.substring(4,9));

//********** SubString Uppercase ***********
	System.out.println("String in Uppercase is " +str3.toUpperCase());

//********** SubString Lowercase ***********
	System.out.println("String in Lowercase is " +str3.toLowerCase());
	
// ********** Original String ***************
	System.out.println("Original String is " +str1);
	
//********** Trim String **************
	System.out.println("Trim string is " +str1.trim());
	
//********** Trim and Equals ************
	System.out.println("String equals or not " +str1.equals(str3));
	System.out.println("Checking Multiple Methods " +str1.trim().equals(str3.trim()));
	
//********* String Concatenation ************
	System.out.println("String Concatenation is " +str1.concat(str2));
	System.out.println("String Concatenation is " +str2.concat(str3));
	
//********* String Replace - Character and Sequence of Character *************
	System.out.println("Replace character M with m " +str3.replace("M", "m"));
	System.out.println("Replace aequence of character " +str3.replace("ehta","EHTA"));

//********** Check Empty String ***********
	System.out.println("Check Empty String " +str4.isEmpty());
	System.out.println("Check Empty String " +str3.isEmpty());
	
//*********** Contains ***********
	System.out.println("String containts MEHTA "+str1.contains("MEHTA"));
	System.out.println("String contains MEHTA " +str1.toUpperCase().contains("MEHTA"));


 }
}