/* 演習04-14
 * 1からnの和を式形式で表示するようにしたプログラムを作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_14;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//1からいくつまでの和を求めるか整数値の入力を促す
		System.out.print("整数値：");
		//いくつまでか値を入力
		int nInput = stdIn.nextInt();

		//合計に使う変数
		int nSum = 0;

		//1から入力された値まで繰り返す
		for(int i = 1; i <= nInput; i++) {
			//入力された値まで加算していく
			nSum += i;

			//終わりの数値かどうかで分岐
			switch(i == nInput ? 1 : 0) {
			//終わりの数値ではないとき、その値と接続の＋を表示して次へ
			case 0: System.out.print(i + " + "); break;
			//終わりの数値の時、その値と接続の＝を表示した後今までの加算された値を表示する
			case 1: System.out.print(i + " = " + nSum); break;
			}
		}

		//標準出力ストリームをクローズ
		stdIn.close();

	}

}
