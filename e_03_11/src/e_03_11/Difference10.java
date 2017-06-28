/* 演習03-11
 * 2つの整数を読み込んでそれらの差が10以下かどうかの判定を行う
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_11;

import java.util.Scanner;

public class Difference10 {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//判定したい値をキーボードから入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//判定したい値をキーボードから入力
		int nInputB = stdIn.nextInt();
		
		//入力された2つの整数の差を求めて格納
		int nDiff = nInputA > nInputB ? nInputA - nInputB : nInputB - nInputA;
		
		//その差が10以下の時
		if(nDiff <= 10) {
			//差が10以下であることを表示
			System.out.print("それらの差は10以下です。");
		//差が11以上の時
		} else {
			//差が11以上であることを表示
			System.out.print("それらの差は11以上です。");
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
