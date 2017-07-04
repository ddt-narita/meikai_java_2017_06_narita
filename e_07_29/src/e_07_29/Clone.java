/* 演習07-29
 * 2次元配列aと同じ配列を生成して返却するメソッドaryCloneを作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_29;

import java.util.Random;
import java.util.Scanner;

public class Clone {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();


		//配列の要素数の入力を促す
		System.out.print("2次元配列の行数：");
		//行数を入力する
		int nRow = stdIn.nextInt();
		//配列の要素数の入力を促す
		System.out.print("2次元配列の列数：");
		//列数を入力する
		int nColumn = stdIn.nextInt();
		
		//入力された要素数の配列をとる
		int[][] nMatrix = new int[nRow][nColumn];

		//要素数分だけ繰り返す
		for(int i = 0; i < nRow; i++) {
			for(int j = 0; j < nColumn; j++) {
				//全要素に0から9のランダムな値を代入
				nMatrix[i][j] = rand.nextInt(10);
			}
		}
		//入力された行数列数の行列を表示する
		System.out.println("行列");
		printMatrix(nMatrix);
		
		//メソッドaryCloneを使ってコピーされた配列を作って表示することを明示
		System.out.println("この行列をコピーした配列を表示します");
		//メソッドarrayCloneを使って配列Aのクローンを作る
		int[][] nCopyMatrix = aryClone2(nMatrix);
		//コピーした行列を表示
		printMatrix(nCopyMatrix);
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//引数の行列のクローンの行列の参照を返却するメソッド
	static int[][] aryClone2(int[][] a) {
		//クローンの行列を作る行列
		int[][] nArrayClone = new int[a.length][a[0].length];
		
		//全要素分繰り返す
		for(int i = 0; i < nArrayClone.length; i++) {
			for(int j = 0; j < nArrayClone[0].length; j++) {
				//全要素を引数の要素でコピー
				nArrayClone[i][j] = a[i][j];
			}
		}
		//作成したクローンの行列への参照を返却する
		return nArrayClone;
	}
	
	//行列を表示する関数
	static void printMatrix(int[][] m) {
		//要素数分だけ繰り返す
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				//全要素を表示する
				System.out.printf("%3d",m[i][j]);
			}
			//行ごとに改行する
			System.out.println();
		}
	}
}
