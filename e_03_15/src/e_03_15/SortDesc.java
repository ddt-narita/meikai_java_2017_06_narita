/* 演習03-15
 * 2つの整数値を読み込んで降順にソート
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_15;

import java.util.Scanner;

public class SortDesc {

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

		//入力された2つの整数を並べたときに降順になっていないとき
		if(nInputA < nInputB) {
			//避難するための変数nTradeを作成して整数Aを非難
			int nTrade = nInputA;
			//整数Aに整数Bを代入
			nInputA = nInputB;
			//整数Bに避難していた整数Aの値を代入
			nInputB = nTrade;
		}

		//入力された2つの整数を降順でソートをしたことを表示
		System.out.println("降順でソートしました。");
		//大きいほうの値が来るように整数A表示
		System.out.println("整数A：" + nInputA);
		//小さいほうのあたいが来るように整数Bを表示
		System.out.println("整数B：" + nInputB);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
