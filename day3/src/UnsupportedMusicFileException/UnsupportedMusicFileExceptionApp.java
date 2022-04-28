package UnsupportedMusicFileException;

import java.util.Scanner;

public class UnsupportedMusicFileExceptionApp {

	public static void main(String[] args) {
		System.out.print("ファイル名>>");
		String file = new Scanner(System.in).next();
		try {
			checkFormat(file);
			System.out.print("OK");
		}catch(UnsupportedMusicFileException e) {
			System.out.println(e.getMessage());
		}
	}

	static void checkFormat(String fileName)throws UnsupportedMusicFileException{
		String[] params = fileName.split("\\.");
		String prm = params[params.length - 1];
		if (!prm.equals("mp3")) {
			throw new UnsupportedMusicFileException("mp3以外は再生できません");
		}
	}
}

