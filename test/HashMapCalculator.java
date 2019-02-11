import java.util.HashMap;

public class HashMapCalculator {
//Compare the key of i of hashmap 1 with the key at i with hashmap 2. If same add one to total. At end reutrn it.
	int total = 0;
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		Object[] hash1 = (Object[]) hashmap1.keySet().toArray();
		Object[] hash2 = (Object[]) hashmap2.keySet().toArray();
		int set = 0;
		for(int i  = 0; i < hash1.length-1; i++) {
			set = i;
			for(int j = 0; j < hash1.length-1; j++) {
				if(hashmap1.get(set) == hashmap2.get(j) && hash1[set] == hash2[j]) {
					//if(hashmap1.get(set))
					//total++;
						total+=1;
		
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
