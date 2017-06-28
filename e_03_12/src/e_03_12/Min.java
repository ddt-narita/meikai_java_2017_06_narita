/* 演習03-12
 * 3つの整数値を読み込んでそれらの最小値を求めて表示するプログラム
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_12;

import java.util.Scanner;

public class Min {

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
		
		//整数Cに入力を促す
		System.out.print("整数C：");
		//判定したい値をキーボードから入力
		int nInputC = stdIn.nextInt();
		
		//最初は最小値を整数Aでおいておく
		int nMin = nInputA;
		//整数Bがその時点での最小値より小さいとき
		if(nInputB < nMin) {
			//最小値を整数Bに更新
			nMin = nInputB;
		}
		
		//整数Cがその時点での最小値より小さいとき
		if(nInputC < nMin) {
			//最小値を整数Cに更新
			nMin = nInputC;
		}
		
		System.out.println("入力された3つの値の最小値は" + nMin + "です。");
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
