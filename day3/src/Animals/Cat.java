package Animals;

public class Cat extends Animal {

	Cat(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void makeNoise() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("にゃー");
	}
	public void sleep() {
		System.out.println("すやすや");
	}

}
