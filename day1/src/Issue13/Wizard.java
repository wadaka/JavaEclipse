package Issue13;
public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	Wizard(String name,int hp,int mp){
		this.setName(name);
		this.setHp(hp);
		this.setMp(mp);
		//this.setWand(wand);
		System.out.println(this.getName()+"……参戦っ!");
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp<0){
			this.hp=0;
		}else {
			this.hp=hp;
		}
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp=mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWand(Wand wand) {
		if(wand==null) {
			throw new IllegalArgumentException("杖が装備されちょらん。処理を中断");
		}
		this.wand=wand;
		System.out.printf("%sは「%s」を装備した。",this.getName(),wand.getName());
	}
	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint*wand.getPower());
		h.setHP(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint +"回復した!");
	}
}
