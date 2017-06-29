/* 演習04-16
 * 読み込んだ値の個数だけアスタリスクを表示するプログラムを5行ごとに改行するように書き換え
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_16;

import java.util.Scanner;

public class Asterisk5 {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//アスタリスクを何個表示するか入力を促す表示
		System.out.print("何個表示しますか：");
		//キーボードから何個表示するか入力
		int nInput = stdIn.nextInt();

		//入力された値分繰り返す
		for(int i = 1; i <= nInput; i++) {
			//5個目かどうか判定して分岐
			switch(i % 5 == 0 ? 1 : 0) {
			//5で割り切れないとき（5個目ではないとき）改行せずアスタリスクを表示
			case 0: System.out.print('*'); 	break;
			//5で割り切れる時（5個目の時）アスタリスクを表示して改行する
			case 1: System.out.println('*');	break;
			}
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
