import java.util.HashMap;
import java.util.Map;

public class balanced {
	
	//function verifying the balance of 'x' and 'y' only
	public  boolean isBalanced(String name){
		
	Map<Character,Integer> map = new HashMap<>();
	
	map.put('x',0);
	map.put('y',0);
	
	int countx,county;
	
	for(int i =0; i<name.length(); i++){
		countx = map.get('x');
		county = map.get('y');

			if(name.charAt(i) == 'x'){
				map.put('x',countx+1);
			} 
			
			if(name.charAt(i) == 'y'){
				map.put('y',county+1);
			}
	}
	
	return map.get('x') == map.get('y');
	}
}
