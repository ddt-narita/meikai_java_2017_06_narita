/* 演習04-08
 * 正の整数値を読み込んでその桁数を出力するプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_08;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		int nInput;

		do {
			//桁数を調べたい整数値の入力を促す表示
			System.out.print("整数値：");
			//しらべたい整数値を入力
			nInput = stdIn.nextInt();
		//正の整数が入力されるまで繰り返す
		} while(nInput > 0);


		//桁数を数える変数
		int digits = 0;

		//入力された値が0以下になるまで繰り返す
		while(nInput > 0) {
			//10で割る（1桁目に数字があれば桁を繰り下げ）
			nInput /= 10;
			//1桁目に値がある時は桁数を数える
			digits++;
		}

		//数えた桁数を表示
		System.out.println("その値は" + digits + "桁です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
