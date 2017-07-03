/* 演習06-19
 * クラス数、各クラスの人数、全員の点数を読み込んで点数の合計点と平均点を求めるプログラムの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_06_19;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//クラスの数の入力を促す表示
		System.out.print("クラス数：");
		//クラス数をキーボードから入力
		int nClassNumber = stdIn.nextInt();

		//各点数を入力するための配列。行数は入力されたクラス数で確保
		int[][] nTensuu = new int[nClassNumber][];

		//各クラスの合計点を格納するための配列
		int[] nClassSum = new int[nClassNumber];

		//全体の合計点数を格納するための変数
		int nTensuuSum = 0;
		//各クラスの人数を格納するための配列
		int[] nClassNinzuu = new int[nClassNumber];

		//入力されたクラスの数だけ繰り返す
		for(int i = 0; i < nClassNumber; i++) {
			//何クラス目かとそのクラスの人数の入力を促す表示
			System.out.print((i + 1) + "組の人数：");
			//クラスの人数を格納する配列に各クラスの人数を入力
			nClassNinzuu[i] = stdIn.nextInt();
			//入力された人数で点数を格納する配列の列数を決定して確保する
			nTensuu[i] = new int[nClassNinzuu[i]];
			//各クラスの人数分だけ繰り返す
			for(int j = 0; j < nTensuu[i].length; j++) {
				//各クラスの各生徒の点数の入力を促す
				System.out.print((i + 1) + "組" +  (j + 1) + "番の点数：");
				//各生徒の点数を入力する
				nTensuu[i][j] = stdIn.nextInt();
				//各クラスの合計点を格納する変数にその生徒の点数を加算
				nClassSum[i] += nTensuu[i][j];
			}
		}

		//表示の形式を整える表示
		System.out.println("  組 |   合計   平均");

		//区切りの-を組の表示に合わせて5個表示する
		for(int i = 0; i < 5; i++) {
			//-を表示
			System.out.print("-");
		}
		//区切りの+を表示
		System.out.print("+");
		//合計と平均を区切るための表示
		for(int i = 0; i < 15; i++) {
			//-を表示して区切る
			System.out.print("-");
		}
		//区切り終わったら改行
		System.out.println();

		//クラスの数だけ繰り返す
		for(int i = 0; i < nClassNumber; i++) {
			//各クラスの合計点と平均点を表示する
			System.out.printf( "%2d組 | %5d %8.2f \n",i + 1, nClassSum[i], (double)nClassSum[i] / nClassNinzuu[i]);
		}

		//クラスの数だけ繰り返す
		for(int i = 0; i < nClassNumber; i++) {
			//クラスごとの合計を足して全体の合計を求める
			nTensuuSum += nClassSum[i];
		}

		//区切りの-を組の表示に合わせて5個表示する
		for(int i = 0; i < 5; i++) {
			//-を表示
			System.out.print("-");
		}
		//区切りの+を表示
		System.out.print("+");
		//合計と平均を区切るための表示
		for(int i = 0; i < 15; i++) {
			//-を表示して区切る
			System.out.print("-");
		}
		//区切り終わったら改行
		System.out.println();

		//全クラスの人数の合計を求める
		int nNinzuuSum = 0;

		//クラスの数だけ繰り返す
		for(int i = 0; i < nClassNinzuu.length; i++) {
			//各クラスの人数の合計を全体の人数に加算して求める
			nNinzuuSum += nClassNinzuu[i];
		}

		//全クラスの合計点と平均点を表示する
		System.out.printf("  計 | %5d %8.2f \n", nTensuuSum,(double)nTensuuSum / (nNinzuuSum));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
