/* 演習04-19
 * 季節を求めるプログラムの月の読み込みにおいて、１から12以外のあたいが入力された場合は再入力させるように書き直す
 * 作成日：6月29日
 * 作成者：成田修之
 */
package e_04_19;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//もう一度行うかどうか入力するための変数
		int retry;

		do{
			//入力された月の季節を求めることを明示
			System.out.println("季節を求めます。");
			//求めたい月を入力するための変数
			int nMonth;

			do {
				//求めたい月の入力を促すための表示
				System.out.print("何月ですか：");
				//キーボードから求めたい月を入力
				nMonth = stdIn.nextInt();
			//入力された月が不正な値の限り月の入力を繰り返す
			}while(nMonth < 1 || nMonth > 12);

			//入力された月によって分岐
			switch(nMonth) {
			//入力された月が3月から5月の時
			case 3 :
			case 4 :
			case 5 : System.out.println("それは春です"); break;
			//6月から8月の時
			case 6 :
			case 7 :
			case 8 : System.out.println("それは夏です"); break;
			//9月から11月の時
			case 9 :
			case 10:
			case 11: System.out.println("それは秋です"); break;
			//12月から2月の時
			case 12:
			case 1 :
			case 2 : System.out.println("それは冬です"); break;
			}

			//もう一度繰り返すかどうか入力を促す
			System.out.print("もう一度？1…Yes/2…No：");
			//繰り返すかどうかキーボードから入力
			retry = stdIn.nextInt();
		//入力された値が1(Yes）の限り繰り返す
		}while(retry == 1);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
