package Animals;

public class Pigeon extends Animal implements Flyable {

	Pigeon(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("バサバサ");
	}

	@Override
	void makeNoise() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ぽぽぽぽ");
		
	}


}
