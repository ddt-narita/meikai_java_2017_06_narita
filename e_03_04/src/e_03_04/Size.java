/* 演習03-04
 * 2つの変数に値を入力して大小関係を判定する
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_04;

import java.util.Scanner;

public class Size {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//キーボードから変数Aに入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//キーボードから変数Bに入力
		int nInputB = stdIn.nextInt();

		//整数Aのほうが大きいとき
		if(nInputA > nInputB) {
			//Aのほうが大きいことを表示
			System.out.print("Aのほうが大きいです。");

		//整数Bのほうが大きいとき
		} else if(nInputA < nInputB) {
			//Bのほうが大きいことを表示
			System.out.print("Bのほうが大きいです。");

		//整数AとBが同じ値の時
		} else {
			//同じ値であることを表示
			System.out.print("AとBは同じ値です");
		}

		//標準出力ストリームをクローズする
		stdIn.close();
	}

}
