package Issue13;

public class Hero {
	private String name;
	private int hp;
	public String toString() {
		return "名前:"+this.name + "/HP:" +this.hp;
	}
	Hero(String name,int hp){
		this.setName(name);
		this.setHP(hp);
		System.out.println(this.getName()+"……参戦っ！");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void changeName(String name) {
		System.out.println(this.getName()+"は「"+name+"」に改名した。");
		System.out.println("……美しい名前だ。");
		this.name=name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHP(int hp) {
		this.hp=hp;
	}
}
