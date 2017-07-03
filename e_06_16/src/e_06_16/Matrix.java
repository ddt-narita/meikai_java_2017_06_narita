/* 演習06-16
 * 4行3列行列と3行4列の行列の積を求める
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_16;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		int Arow = 4;		//行列Aの行数
		int Acolumn = 3;	//行列Aの列数
		int Brow = 3;		//行列Bの行数
		int Bcolumn = 4;	//行列Bの列数

		//4行3列の配列A
		int[][] nArrayA = new int[Arow][Acolumn];
		//3行4列の配列B
		int[][] nArrayB = new int[Brow][Bcolumn];

		//行列Aの行数分繰り返す
		for(int i = 0; i < Arow; i++) {
			//行列Aの列数分繰り返す
			for(int j = 0; j < Acolumn; j++) {
				//行列Aの各要素に入力を促す表示
				System.out.print("nArrayA[" + i + "][" + j + "] = ");
				//行列Aの各要素に入力
				nArrayA[i][j] = stdIn.nextInt();
			}
		}
		
		//行列Bの行数分繰り返す
		for(int i = 0; i < Brow; i++) {
			//行列Bの列数分繰り返す
			for(int j = 0; j < Bcolumn; j++) {
				//行列Bの各要素に入力を促す表示
				System.out.print("nArrayB[" + i + "][" + j + "] = ");
				//行列Bの各要素に入力
				nArrayB[i][j] = stdIn.nextInt();
			}
		}

		//入力された2つの行列の積を求めることを表示
		System.out.println("2つの行列nArrayAとnArrayBの積を求めます。");
		//2つの行列の積を格納するための行列C
		int[][] nArrayC = new int[Arow][Bcolumn];
		//行列Cの行数分繰り返す
		for(int i = 0; i < nArrayC.length; i++) {
			//行列Cの列数分繰り返す
			for(int j = 0; j < nArrayC[0].length; j++) {
				//各要素を0で初期化
				nArrayC[i][j] = 0;
			}
		}

		//行列Cの行数分繰り返す
		for(int i = 0; i < nArrayC.length; i++) {
			//行列Cの列数分繰り返す
			for(int j = 0; j < nArrayC[0].length; j++) {
				//行列Aの列数、行列Bの行数と同じだけ繰り返す
				for(int k = 0; k < Acolumn; k++) {
					//各要素を行列の積の方法に基づいて計算
					nArrayC[i][j] += nArrayA[i][k] * nArrayB[k][j];
				}
			}
		}

		//行列Cの行数分だけ繰り返す
		for(int i = 0; i < nArrayC.length; i++) {
			//行列Cの列数分だけ繰り返す
			for(int j = 0; j < nArrayC[0].length; j++) {
				//2つの行列の積行列Cの各要素を最低でも4桁で出力
				System.out.printf("%4d",nArrayC[i][j]);
			}
			//各行ごとに改行を行う
			System.out.println();
		}

		//出力ストリームをクローズ
		stdIn.close();
	}

}
