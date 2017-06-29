/* 演習04-18
 * 1から入力された値前の整数値の2条値を表示するプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_18;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//2乗を表示したい1からいくつまで表示するか入力を促す。
		System.out.print("整数値：");
		//いくつまで表示するか入力
		int nInput = stdIn.nextInt();

		//入力された個数分繰り返す
		for(int i = 1; i <= nInput; i++) {
			//1から入力された値とその2乗を表示する
			System.out.println(i + "の2乗は" + i * i);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
