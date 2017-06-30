/* 演習06-06
 * テストの点数の合計、平均、最高、最低点を表示する。人数と点数はキーボードから読み込む
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in) ;

		//各計算結果を適用したい生徒の人数の入力を促す
		System.out.print("人数を入力せよ：");
		//生徒数を入力する
		int nNumber = stdIn.nextInt();

		//生徒数と同じ数の要素数の配列をとる
		int[] nArray = new int[nNumber];

		//各生徒に点数を入力するように促す
		System.out.println(nNumber +  "人のテストの点を入力せよ");
		//生徒数分繰り返す
		for(int i = 0; i < nNumber; i ++) {
			//各生徒の点数の入力を促す
			System.out.print(i + "番目の点数：");
			//点数を入力
			nArray[i] = stdIn.nextInt();
		}

		//全生徒の最高点を格納するための変数
		int nMax = nArray[0];
		//全生徒の最低点を格納するための変数
		int nMin = nArray[0];
		//全生徒の合計点を求めるための変数
		int nSum = 0;

		//生徒数分繰り返す
		for(int i = 1; i < nNumber; i++) {
			//その生徒の点数が現在の最高点より大きいとき
			if(nArray[i] > nMax) {
				//最高点をその生徒の点数に更新する
				nMax = nArray[i];
			}
			//その生徒の点数が現在の最低点より小さいとき
			if(nArray[i] < nMin) {
				//最低点をその生徒の点数で更新する
				nMin = nArray[i];
			}
			//各生徒の点数を加算して合計点を求める
			nSum += nArray[i];
		}

		//全生徒の合計、平均、最高点、最低点を表示する
		System.out.println("合計は" + nSum + "平均点" + (double)nSum / nNumber + "最高点" + nMax + "最低点" + nMin);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
