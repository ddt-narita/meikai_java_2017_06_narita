/* 演習07-06
 * 引数で指定された月の季節を表示するメソッドを作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_06;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//判定したい月の入力を促す
		System.out.print("季節を判定したい月を入力してください：");
		//判定したい月を入力
		int nMonthSeason = stdIn.nextInt();

		//入力された月をメソッドprintSeasonを使って季節を判定する
		System.out.print("それは");
		//メソッドprintSeasonは返却値がvoid型で判定した季節をそのまま表示するので分けて表示
		printSeason(nMonthSeason);
		System.out.println("です");

		//標準出力ストリームをクローズ
		stdIn.close();
	}


	static void printSeason(int m) {
		//引数の値で分岐
		switch(m) {
		//3月から5月は春であることを表示
		case 3:
		case 4:
		case 5:  System.out.print("春"); break;
		//6月から8月は夏であることを表示
		case 6:
		case 7:
		case 8:  System.out.print("夏"); break;
		//9月から11月は秋であることを表示
		case 9:
		case 10:
		case 11: System.out.print("秋"); break;
		//12月から2月は冬であることを表示
		case 12:
		case 1:
		case 2:  System.out.print("冬"); break;
		}
	}
}
