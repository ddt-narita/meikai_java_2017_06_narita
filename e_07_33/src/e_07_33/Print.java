/* 演習07-33
 * int型の1次元配列と2次元配列の全要素の値を表示するメソッド群の作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_33;

import java.util.Random;
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();
		
		//配列の要素数を入力を促す表示
		System.out.print("配列の要素数：");
		//配列の要素数を入力する
		int nArrayNumber = stdIn.nextInt();
		//入力された要素数の配列を生成する
		int[] nArray = new int[nArrayNumber];
		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//全要素を0から9のランダムな値を代入
			nArray[i] = rand.nextInt(10);
		}
		//メソッドprintArrayを使って配列の全要素を表示
		printArray(nArray);
		
		//行列の行数の入力を促す表示
		System.out.print("行列の行数：");
		//行列の行数を入力する
		int nMatrixRow = stdIn.nextInt();
		//行列の列数の入力を促す表示
		System.out.print("行列の列数：");
		//行列の列数を入力する
		int nMatrixColumn = stdIn.nextInt();
		
		//入力された行数列数の行列を作成する
		int[][] nMatrix = new int[nMatrixRow][nMatrixColumn];
		
		//行数分繰り返す
		for(int i = 0; i < nMatrixRow; i++) {
			//列数分繰り返す
			for(int j = 0; j < nMatrixColumn; j++) {
				//各要素に0から9のランダムな値を代入する
				nMatrix[i][j] = rand.nextInt(10);
			}
		}
		
		//メソッドprintArrayを使って行列の全要素を表示する
		printArray(nMatrix);
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//1次元配列の全要素を表示するメソッド
	static void printArray(int[] a) {
		//配列の要素数分繰り返す
		for(int i = 0; i < a.length; i++) {
			//各要素を表示して間には空白を表示
			System.out.print(a[i] + " ");
		}
	}
	
	//2次元配列の全要素を表示するメソッド
	static void printArray(int[][] a) {
		//2次元配列の行数分繰り返す
		for(int i = 0; i < a.length; i++) {
			//2次元配列の列数分繰り返す
			for(int j = 0; j < a[0].length; j++) {
				//各配列を最低6桁で表示する
				System.out.printf("%6d", a[i][j]);
			}
			//行ごとに改行
			System.out.println();
		}
	}
}
