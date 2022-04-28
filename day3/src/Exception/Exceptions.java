package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("Hello");
		} catch (Exception e) {
			System.out.println("何かしらの例外が発生しました。");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException i) {
				}
			}
		}

		try (FileWriter fw2 = new FileWriter("data.txt");) {
			fw2.write("hello2");
		} catch (Exception e) {
			System.out.println("何かしらの例外が発生しました。");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	static void sleep()throws InterruptedException{
		Thread.sleep(3000);
	}
}
