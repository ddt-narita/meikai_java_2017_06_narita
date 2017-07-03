/* 演習07-02
 * 3つの引数の最小値を求めるメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_02;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//最小値を判定するための整数Aに入力を促す
		System.out.print("整数a：");
		//整数Aを入力
		int nInputA = stdIn.nextInt();
		//最小値を判定するための整数Bに入力を促す
		System.out.print("整数b：");
		//整数Bを入力
		int nInputB = stdIn.nextInt();
		//最小値を判定するための整数Cに入力を促す
		System.out.print("整数c：");
		//整数Cを入力
		int nInputC = stdIn.nextInt();

		//関数minを呼び出して入力された3つの整数の最小値を求めて格納
		int nMin = min(nInputA, nInputB, nInputC);

		//最小値を表示する
		System.out.print("最小値は" + nMin + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}


	//3つの値の最小値を求めて返却するメソッド
	static int min(int a, int b, int c) {
		//とりあえず返却する最小値を格納する変数に整数Aを代入する
		int min = a;
		//最小値より整数Bのほうが小さいとき
		if(b < min) {
			//最小値を整数Bに更新
			min = b;
		}

		//最小値よりも整数Cのほうが小さいとき
		if(c < min) {
			//最小値を整数Cに更新
			min = c;
		}

		//最終的にできあがった最小値を返却する
		return min;
	}
}
