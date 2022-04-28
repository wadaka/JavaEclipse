package RandomGame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RandomGameApp {

	public static void main(String[] args) throws Exception {
		//準備*****************
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		//ハイスコアと更新日を読み込む
		FileInputStream fis = new FileInputStream("score.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
		//本編
		System.out.println("****乱数ゲーム****");
		System.out.print("HighScore ");
		int past_score;
		if(line !=null) {
			String[] infos=line.split(",");
			System.out.print(infos[0] +" ");
			Date d = form.parse(infos[1]);
			String h_day = form.format(d);
			System.out.println(h_day);
			past_score = Integer.parseInt(infos[0]);
		}else {
			System.out.println("0");
			past_score = 0;
		}
		while(true) {
			System.out.print("やりますか yes…y no…n >");
			String input = scan.nextLine();
			if(input=="n") break;
			if(input!="y") {
				System.out.println("入力が間違っています！");
				continue;
			}
			int score = rand.nextInt(100000)+1;
			System.out.println(score);
			if(score > past_score) {
				System.out.println("newRecord");
				past_score = score;
				Date now = new Date();
				String now_day = form.format(now);
				ScoreOutput(score,now_day);
			}
		}
		System.out.println("アプリを終了します。");
		br.close();
	}
	public static void ScoreOutput(int score,String now_day) throws Exception{
		FileOutputStream fos = new FileOutputStream("score.txt",false);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(score+","+now_day);
		bw.close();
	}
}
