/* 演習07-27
 * 3つの配列の要素数が等しければ加算を行い、trueを返却し、等しくなければ加算は行わずfalseを返却するメソッドの作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_27;

import java.util.Random;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//行列Aの行数を入力
		System.out.print("行列Aの行数：");
		int Arow = stdIn.nextInt();
		//行列Aの列数を入力
		System.out.print("行列Aの列数：");
		int Acolumn = stdIn.nextInt();
		//行列Bの行数を入力
		System.out.print("行列Bの行数：");
		int Brow = stdIn.nextInt();
		//行列Bの列数を入力
		System.out.print("行列Bの列数：");
		int Bcolumn = stdIn.nextInt();

		//入力された行数列数で行列Aを作成
		int[][] nMatrixA = new int[Arow][Acolumn];
		//要素数分だけ繰り返す
		for(int i = 0; i < Arow; i++) {
			for(int j = 0; j < Acolumn; j++) {
				//全要素に0から9のランダムな値を代入
				nMatrixA[i][j] = rand.nextInt(10);
			}
		}

		//入力された行数列数で行列Aを作成
		int[][] nMatrixB = new int[Brow][Bcolumn];
		//要素数分だけ繰り返す
		for(int i = 0; i < Brow; i++) {
			for(int j = 0; j < Bcolumn; j++) {
				//全要素に0から9のランダムな値を代入
				nMatrixB[i][j] = rand.nextInt(10);
			}
		}
		//行数列数が同じときだけ使う行列Cを行列Aと同じ要素数で作成
		int[][] nMatrixC = new int[Arow][Acolumn];

		//メソッドprintMatrixを使って行列Aを表示する
		System.out.println("行列A");
		printMatrix(nMatrixA);
		//メソッドprintMatrixを使って行列Bを表示する
		System.out.println("行列B");
		printMatrix(nMatrixB);

		//行列の要素数が同じでメソッドaddMatrixでtrueが返却された時
		if(addMatrix(nMatrixA,nMatrixB,nMatrixC)) {
			//行列Aと行列Bの和行列Cを表示する
			System.out.println("要素数が等しかったので加算しました。");
			System.out.println("行列C");
			printMatrix(nMatrixC);
		//行列の要素数が同じではなくfalseが返却されたとき
		} else {
			//加算は行われなかったことを表示
			System.out.println("要素数が等しくなかったので加算は行いませんでした。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//配列の要素数が同じなら加算してtrueを返し、同じでなければ加算はせず、falseを返却するメソッド
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//返却する論理値に用いる変数
		int nReturn = 0;
		//2つの行列の要素数が同じとき
		if(x.length == y.length && x[0].length == y[0].length) {
			//変数に1を代入
			nReturn = 1;
			//行列の要素数分だけ繰り返す
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[0].length; j++) {
					//第三引数の行列に第一引数の行列と第二引数の行列の和を代入
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}
		//変数が1かどうかで論理値を返却
		return nReturn == 1;
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
