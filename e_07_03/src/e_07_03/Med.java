/* 演習07-03
 * 3つの引数の中央値を求めるメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_03;

import java.util.Scanner;

public class Med {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//中央値を判定するための整数Aに入力を促す
		System.out.print("整数a：");
		//整数Aを入力
		int nInputA = stdIn.nextInt();
		//中央値を判定するための整数Bに入力を促す
		System.out.print("整数b：");
		//整数Bを入力
		int nInputB = stdIn.nextInt();
		//中央値を判定するための整数Cに入力を促す
		System.out.print("整数c：");
		//整数Cを入力
		int nInputC = stdIn.nextInt();

		//関数medを呼び出して入力された3つの整数の中央値を求めて格納
		int nMed = med(nInputA, nInputB, nInputC);

		//中央値を表示する
		System.out.print("中央値は" + nMed + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}


	static int med(int a, int b, int c) {
		//中央値を格納する変数をとりあえずaで初期化
		int med = a;
		//引数aより引数bのほうが大きいとき
		if(a < b) {
			//その中で引数cが引数cがbより大きいとき
			if(c > b) {
				//中央値はbとなり格納する
				med = b;
			//cがb以下でaより大きいとき
			} else if(c > a) {
				//中央値はcとなり格納する
				med = c;
			}
		//引数aのほうが引数bより大きいとき
		} else if(a > b) {
			//その中で引数cが引数bより小さいとき
			if(c < b) {
				//中央値はbであり格納する
				med = b;
			//引数cがb以上でa未満の時
			} else if(c < a) {
				//中央値はcであり返却する値に格納する
				med = c;
			}
		}

		//中央値を返却する
		return med;
	}

}
