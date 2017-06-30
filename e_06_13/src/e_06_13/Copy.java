/* 演習06-13
 * 配列を逆順にコピーする
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_13;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//配列の要素数の入力を促す
		System.out.print("要素数：");
		//配列の要素数を入力
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数分の配列をとる
		int[] nArrayA = new int[nArrayNumber];
		//入力された要素数分の配列をとる
		int[] nArrayB = new int[nArrayNumber];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に入力を促す
			System.out.print("nArray[" + i + "] = ");
			//各要素に入力
			nArrayA[i] = stdIn.nextInt();
		}

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//配列Bに配列Aを順番逆順に代入
			nArrayB[i] = nArrayA[nArrayNumber - i - 1];
		}

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//配列AとBをそれぞれ表示して逆順になっていることを確かめる
			System.out.printf("nArrayA[" + i + "] = %3d  nArrayB[" + i + "] = %3d\n",nArrayA[i],nArrayB[i]);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
