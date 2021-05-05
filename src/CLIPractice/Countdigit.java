package CLIPractice;

public class Countdigit {
	public static void main(String[] args) {
		String s = "test1ing2i3hj40";
		/*char arr[] = s.toCharArray();		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == '0' || arr[j] == '1' || arr[j] == '2'|| arr[j] == '3'|| arr[j] == '4'|| arr[j] == '5'|| arr[j] == '6'|| arr[j] == '7'|| arr[j] == '8'|| arr[j] == '9') {
				char ch = arr[j];
				switch (ch) {
				case '0':
					System.out.print(0+" ");
					break;
				case '1':
					System.out.print(1+" ");
					break;
				case '2':
					System.out.print(2+" ");
					break;
				case '3':
					System.out.print(3+" ");
					break;
				case '4':
					System.out.print(4+" ");
					break;
				case '5':
					System.out.print(5+" ");
					break;
				case '6':
					System.out.print(6+" ");
					break;
				case '7':
					System.out.print(7+" ");
					break;
				case '8':
					System.out.print(8+" ");
					break;
				case '9':
					System.out.print(9+" ");
					break;
				default:
					System.out.print("Default Value");

				}
  }
			}*/
		String s1=s.replaceAll("[a-zA-Z]", "");
		System.out.println(s1);
		System.out.println("Number of Digits = "+s1.length());
		}
	
}