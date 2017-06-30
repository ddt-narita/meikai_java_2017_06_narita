/* 演習06-04
 * 6-5を書き換えて縦向きの棒グラフを作成する
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_04;

import java.util.Random;
import java.util.Scanner;

public class BarGraph {

	public static void main(String[] args) {

		//ランダムな値を生成するクラスのインスタンスの作成
		Random rand = new Random();
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//キーボードから要素数を入力
		int nArrayNumber = stdIn.nextInt();
		//入力された値分の要素数の配列を生成する
		int[] nArray = new int[nArrayNumber];

		//要素数分くりかえす
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に1から10のランダムな値を代入する
			nArray[i] = 1 + rand.nextInt(10);
		}

		//10から1までの10列分繰り返す
		for(int i = 0; i < 10; i++) {
			//要素数だけ繰り返す
			for(int j = 0; j < nArrayNumber; j++) {
				//その配列が列数より大きいとき
				if(nArray[j] >= 10 - i) {
					//アスタリスクを表示する
					System.out.print("* ");
				//配列の要素がその列の値より小さいとき
				} else {
					//空白文字を出力して次の配列へ
					System.out.print("  ");
				}
			}
			//各配列が終わったら改行
			System.out.println();
		}

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//要素数の2倍-の仕切りを表示する
			System.out.print("--");
		}

		//仕切りが終わったら改行
		System.out.println();

		//要素数分だけ繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素の番号を10での剰余で表示
			System.out.print( i % 10 + " ");
		}
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
