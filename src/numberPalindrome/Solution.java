package numberPalindrome;

public class Solution {//q9

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}
	public static boolean isPalindrome(int x) {
		String s= Integer.toString(x);
		String temp="";
		int i=s.length();
		while(i>0) {
			temp+=s.charAt(i-1);
			i--;
		}
		if(temp.equals(s)) {
			return true;
		}
		return false;
	}

}
