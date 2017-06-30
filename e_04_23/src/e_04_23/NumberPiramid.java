/* 演習04-23
 * n段の数字ピラミッドを表示するプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_23;

import java.util.Scanner;

public class NumberPiramid {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//何段のピラミッドを表示するか入力を促す
		System.out.print("何段のピラミッドを表示しますか：");
		//何段か入力する
		int nPNumber = stdIn.nextInt();

		//入力された段数を表示する
		for(int i = 1; i <= nPNumber; i++) {
			//段数からその段目の値を引いた数分繰り返す
			for(int j = 1; j <= nPNumber - i; j++) {
				//空白を表示
				System.out.print(' ');
			}
			//ピラミッドのn段目に表示する個数分繰り返す
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				//その段数の10で割った剰余を表示
				System.out.print(i % 10);
			}

			//一行ごとに改行する
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
