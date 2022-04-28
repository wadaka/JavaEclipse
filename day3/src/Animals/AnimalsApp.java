package Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalsApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Animal>list = new ArrayList<>();
		list.add(new Dog("John"));
		list.add(new Cat("Maru"));
		list.add(new Pig("torion"));
		list.add(new Pigeon("torio"));
		list.add(new Eagle("hutten"));
		for(Animal a:list) {
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat) {
				((Cat)a).sleep();
			}
			if(a instanceof Flyable) {
				((Flyable)a).fly();
			}
		}
	}

}
