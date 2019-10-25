import java.util.Scanner;

public class Gfg_ReverseEachWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please insert your string");
		
		char[] fullStringArr = sc.nextLine().toCharArray();
		String tempStr = "";
		String reversedStr = "";
		
		for(char character : fullStringArr) {
			if(character == ' ' || character == fullStringArr[fullStringArr.length - 1]) {
				reversedStr += reverser(tempStr);
				tempStr = "";
			}
			else {
				tempStr += character;
			}
		}
		
		System.out.print(reversedStr);
		sc.close();
	}
	
	public static String reverser(String toBeReversed) {
		String returnStr = "";
		char[] tempArr = toBeReversed.toCharArray();
		
		for(int i = tempArr.length; i > 0; i--) {
			returnStr +=tempArr[i - 1];
		}
		
		return returnStr + " ";
	}
	
	
}
