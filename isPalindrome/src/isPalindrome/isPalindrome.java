package isPalindrome;

public class isPalindrome 
{
	public static boolean isPalindrome(String s){

		if(s.length()%2==0){
			return false;
		}
	
		int n = s.length();
		
		for(int i=0; i<n; i++,n--){
			if(!(s.charAt(i)==s.charAt(n-1))){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		String s = "ici";
		System.out.println(isPalindrome(s));
	}
}
