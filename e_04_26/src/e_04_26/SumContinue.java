/* 演習04-26
 * 負の値を加算しない合計を求めるプログラムを平均も求められるように変更
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_26;

import java.util.Scanner;

public class SumContinue {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//加算する整数の数の入力を促す
		System.out.print("整数を加算します。\n何個加算しますか：");
		//加算する数を入力
		int nNumber = stdIn.nextInt();

		int nSum = 0;		//加算するための変数
		int nCount = 0;	//負の値を除く加算された値の数を数える変数

		//入力された加算する数分繰り返す
		for(int i = 0; i < nNumber; i++) {
			//加算したい整数値の入力を促す
			System.out.print("整数：");
			//キーボードから加算したい数を入力
			int nInput = stdIn.nextInt();
			//加算しようと入力された値が負の値の時
			if(nInput < 0) {
				//加算しないことを表示
				System.out.println("負の数は加算しません。");
				//ループの先頭に戻る
				continue;
			}

			//入力された加算する値が負ではないとき合計を求める変数に加算する
			nSum += nInput;
			//負ではないとき加算された値の個数を加算する変数もカウントする
			nCount++;
		}
		//求めた加算された合計と平均を表示する
		System.out.println("合計は" + nSum + "平均は" + nSum / nCount+ "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
