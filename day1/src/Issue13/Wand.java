package Issue13;

import java.util.Random;

public class Wand {
	Random rand = new Random();
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException("名前にnullが代入されとる。処理を中断");
		}
		if(name.length()>=3) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("最低3文字以上を入力してください!処理を中断");
		}
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power>=0.5 && power<=100) {
			this.power=power;
		}else {
			throw new IllegalArgumentException("杖の増幅率は、0.5~100.0の範囲で設定してください！処理を中断");
		}
	}
}
