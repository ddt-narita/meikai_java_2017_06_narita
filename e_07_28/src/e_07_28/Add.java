/* 演習07-28
 * 行列Xと行列Yの和を格納した2次元配列を返却するメソッド
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_28;

import java.util.Random;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//行列Aの行数を入力
		System.out.print("行列の行数：");
		int row = stdIn.nextInt();
		//行列Aの列数を入力
		System.out.print("行列の列数：");
		int column = stdIn.nextInt();

		//入力された行数列数で行列Aを作成
		int[][] nMatrixA = new int[row][column];
		//要素数分だけ繰り返す
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				//全要素に0から9のランダムな値を代入
				nMatrixA[i][j] = rand.nextInt(10);
			}
		}

		//入力された行数列数で行列Aを作成
		int[][] nMatrixB = new int[row][column];
		//要素数分だけ繰り返す
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				//全要素に0から9のランダムな値を代入
				nMatrixB[i][j] = rand.nextInt(10);
			}
		}

		//行列Aを表示
		System.out.println("行列A");
		printMatrix(nMatrixA);
		//行列Bを表示
		System.out.println("行列B");
		printMatrix(nMatrixB);

		//メソッドaddMatrixを使って2つの行列の和行列を作成
		int[][] nAddMatrix = addMatrix(nMatrixA, nMatrixB);

		//作成した2つの行列の和行列を表示
		System.out.println("2つの行列の和行列");
		printMatrix(nAddMatrix);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//2つの行列の和行列を返却するメソッド
	static int[][] addMatrix(int[][] x, int[][] y) {
		//和行列を格納する行列
		int[][] nAddMatrix = new int[x.length][x[0].length];

		//全要素分繰り返す
		for(int i = 0; i< nAddMatrix.length; i++) {
			for(int j = 0; j < nAddMatrix.length; j++) {
				//各要素の和を代入する
				nAddMatrix[i][j] = x[i][j] + y[i][j];
			}
		}

		//作成した和行列を返却する
		return nAddMatrix;
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
