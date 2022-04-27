package Hero;

public class HeroApp {
	public static void main(String[] args) {
		Hero h1 = new Hero("ロト",100);
		Hero h2 = new Hero("ロト",200);
		Hero h3 = new Hero("プリケツのトルネコ",300);

		if(h2!=h1) {
			System.out.println("同値ではありません");
		}
		if(h1.equals(h2)) {
			System.out.println("同価です");
		}
		if(!h1.equals(h2)) {
			System.out.println("同価ではありません");
		}
		if(h1.equals(h3)) {
			System.out.println("同価です");
		}
		if(!h1.equals(h3)) {
			System.out.println("同価ではありません");
		}
		if(h2.equals(h3)) {
			System.out.println("同価です");
		}
		if(!h2.equals(h3)) {
			System.out.println("同価ではありません");
		}
	}
}
class Hero{
	String name;
	int hp;
	Hero(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	public boolean equals(Object o) {
		if(this ==o) {return true;}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}