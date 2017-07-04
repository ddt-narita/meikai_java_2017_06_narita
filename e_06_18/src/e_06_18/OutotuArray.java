/* 演習06-18
 * 凹凸な配列の行数と各行の列数をキーボードから入力するようにして書き換え
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_06_18;

import java.util.Scanner;

public class OutotuArray {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//行列を生成
		int[][] nArray;

		//行列の行数の入力を促す表示
		System.out.print("行列の行数：");
		//行数を入力
		int nRow = stdIn.nextInt();

		//入力された行数を行列にとる
		nArray = new int[nRow][];

		//入力された行数分だけ繰り返す
		for(int i = 0; i < nRow; i++) {
			//各行の列数の入力を促す表示
			System.out.print(i + "行目の列数：");
			//各列数を入力
			int nColumn = stdIn.nextInt();
			//入力された列数を行列の各行に確保
			nArray[i] = new int[nColumn];
		}

		//行列の行数分だけ繰り返す
		for(int i = 0; i < nArray.length; i++) {
			//行列の列数分だけ繰り返す
			for(int j = 0; j < nArray[i].length; j++) {
				//各要素を最低でも3桁で表示する
				System.out.printf("%3d", nArray[i][j]);
			}
			//各行ごとに改行
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
