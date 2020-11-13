import java.util.*;

public class StorageTagCloud // class created by Joshua Navarro
{
	private Map<String, Integer> tags;
	
	public StorageTagCloud(List<String> words, List<Integer> nums) {
		tags = new TreeMap<String, Integer>();
		for (int x = 0; x < words.size(); x++) {
			if (!tags.containsKey(words.get(x))) {
				tags.put(words.get(x),0);
			}
			tags.put(words.get(x),tags.get(words.get(x)) + nums.get(x));
		}
	}
	
	public Map<String, Integer> getTagCloud() {
		return tags;
	}
}