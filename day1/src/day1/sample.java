package day1;

import java.util.HashMap;
import java.util.Map;

public class sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello");
		System.out.println("Change World");
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("東京都",1261);
		prefs.put("京都府",255);
		prefs.put("熊本県",181);
		System.out.println(prefs);
		/*public String toString() {
			return prefs.get("熊本県") + "/熊本県";
		}*/
	}

}
