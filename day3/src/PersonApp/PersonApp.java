package PersonApp;

public class PersonApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person p = new Person();
		try {
			p.setAge(-12);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
		}
	}

}
class Person{
	int age;
	public void setAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("年齢は正の整数で表記してください");
		}
	}
}