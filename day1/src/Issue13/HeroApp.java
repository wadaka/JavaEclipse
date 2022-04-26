package Issue13;

public class HeroApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero("TAKAHIRO",234);
		System.out.println(h.toString());
		h.changeName("Takahiro");
		Wizard w = new Wizard("Makidai",-23,21);
		Wand wand = new Wand();
		wand.setName("美しすぎるEXILEの杖");
		wand.setPower(20.1);
		w.setWand(wand);
		w.heal(h);
	}

}
