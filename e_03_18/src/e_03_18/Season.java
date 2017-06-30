/* 演習03-18
 * 月を1から12の整数値で読み込んで、それに対応するプログラム
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_18;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//季節を判定したい月の入力を促す
		System.out.print("月を入力してください：");
		//判定したい月をキーボードから入力
		int nMonth = stdIn.nextInt();

		//入力された月の季節を表示することを明示
		System.out.print("入力された月の季節は：");

		//入力された月の値によって分岐
		switch(nMonth) {
		//入力された月が3月から5月の時は春であることを表示
		case 3 :
		case 4 :
		case 5 : System.out.println("春です。"); break;

		//入力された月が6月から8月の時は夏であることを表示
		case 6 :
		case 7 :
		case 8 : System.out.println("夏です。"); break;

		//入力された月が9月から11月の時は秋であることを表示
		case 9 :
		case 10:
		case 11: System.out.println("秋です。"); break;

		//入力された月が12月から2月の時は冬であることを表示
		case 12:
		case 1 :
		case 2 : System.out.println("冬です。"); break;
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
