package Animals;

public class Eagle extends Animal implements Flyable {

	Eagle(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ぴゅいーん");
	}

	@Override
	void makeNoise() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ぴょろろろ");
	}

}
