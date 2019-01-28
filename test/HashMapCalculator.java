import java.util.HashMap;

public class HashMapCalculator {
//Compare the key of i of hashmap 1 with the key at i with hashmap 2. If same add one to total. At end reutrn it.
	int total = 0;
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		String[] hash1 = (String[]) hashmap1.keySet().toArray();
		String[] hash2 = (String[]) hashmap2.keySet().toArray();
		for(int i  = 0; i < hashmap1.size(); i++) {
			
			for(int j = 0; j < hashmap1.size(); j++) {
				if(hashmap1.get(i) == hashmap2.get(j)) {
					
				}
				else {
					System.out.println("Nope");
				}
			}
		}
		return total;
	}

}

/*
System.out.println("In");
if(hashmap1.containsKey(i) == hashmap2.containsKey(i)) {
	
	if(hashmap1.containsValue(i) == hashmap2.containsValue(j)) {
		total+=1;
	}
}
else {
	System.out.println("Nope");
}
*/
