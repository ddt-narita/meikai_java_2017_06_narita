/* 演習03-16
 * 3つの整数値を読み込んで昇順にソートする
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_16;

import java.util.Scanner;

public class SortAsc {

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

		//入力された整数Aと整数Bが昇順になっていないとき
		if(nInputA > nInputB) {
			//避難するための変数nTradeを作成して整数Aを非難
			int nTrade = nInputA;
			//整数Aに整数Bを代入
			nInputA = nInputB;
			//整数Bに避難していた整数Aの値を代入
			nInputB = nTrade;
		}

		//AとBで昇順にソート後の整数Bと整数Cを並べたときに昇順になっていないとき
		if(nInputB > nInputC) {
			//避難するための変数nTradeを作成して整数Bを非難
			int nTrade = nInputB;
			//整数Bに整数Cを代入
			nInputB = nInputC;
			//整数Cに避難していた整数Aの値を代入
			nInputC = nTrade;
		}

		//さらにソート後の整数Aと整数Bで昇順になっていないとき
		if(nInputA > nInputB) {
			//避難するための変数nTradeを作成して整数Aを非難
			int nTrade = nInputA;
			//整数Aに整数Bを代入
			nInputA = nInputB;
			//整数Bに避難していた整数Aの値を代入
			nInputB = nTrade;
		}

		//入力された2つの整数を降順でソートをしたことを表示
		System.out.println("昇順でソートしました。");
		//大きいほうの値が来るように整数A表示
		System.out.println("整数A：" + nInputA);
		//小さいほうのあたいが来るように整数Bを表示
		System.out.println("整数B：" + nInputB);
		//小さいほうのあたいが来るように整数Bを表示
		System.out.println("整数C：" + nInputC);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
