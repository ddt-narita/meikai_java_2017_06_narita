/* 演習04-07
 * 読み込んだ値の個数だけ*と+を表示を行うプログラムを作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_07;

import java.util.Scanner;

public class PutAsteriskPlus {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//アスタリスクとプラスを交互にいくつ表示するのか入力を促す表示
		System.out.print("何個表示しますか：");
		//何個表示するのか入力
		int nInput = stdIn.nextInt();

		//カウントに使う変数を1で初期化
		int i = 1;
		//入力された回数分繰り返す
		while(i <= nInput) {
			//カウントの変数が奇数なのか偶数なのかを入力
			int nState = (i % 2);
			//偶数か奇数かで分岐
			switch(nState) {
			//偶数の時＋を表示
			case 0: System.out.print('+'); break;
			//奇数の時＊を表示
			case 1: System.out.print('*'); break;
			}
			//カウントで一つくりあげ
			i++;
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
