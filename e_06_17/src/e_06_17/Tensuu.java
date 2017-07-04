/* 演習06-17
 * 6人の2科目の点数を読み込んで科目ごとの平均点学生ごとの平均点を求める
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_06_17;

import java.util.Scanner;

public class Tensuu {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//各生徒のテストの点数の入力を促す表示
		System.out.println("テストの点数を入力して下さい");
		//科目の数
		int nKamokuNumber = 2;
		//生徒の数
		int nStudentNumber = 6;
		//点数を入力するための変数
		int[][] nTensuu = new int [nStudentNumber][nKamokuNumber];
		//科目の名前を表示する変数
		String[] Kamoku = {"国語", "数学"};


		//人数分繰り返す
		for(int i = 0; i < nStudentNumber; i++) {
			//学科数分繰り返す
			for(int j = 0; j < nKamokuNumber; j++) {
				//一人一人の点数を入力する
				System.out.print(i + 1 + "人目の" + Kamoku[j] + "の点数：");
				//キーボードから点数を入力
				nTensuu[i][j] = stdIn.nextInt();
			}
		}

		//科目ごとの合計を格納するための配列
		int[] nKamokuSum = new int[nKamokuNumber];

		//生徒ごとの合計を格納するための配列
		int[] nStudentSum = new int[nStudentNumber];

		//生徒数分だけ繰り返す
		for(int i = 0; i < nStudentNumber; i++) {
			//科目の数だけ繰り返す
			for(int j = 0; j < nKamokuNumber; j++) {
				//各科目に足していく
				nKamokuSum[j] += nTensuu[i][j];
				//各生徒の合計を足していく
				nStudentSum[i] += nTensuu[i][j];
			}
		}

		//科目の数だけ繰り返す
		for(int i = 0; i < nKamokuNumber; i++) {
			//各科目の平均点を表示する
			System.out.println(Kamoku[i] + "の平均点は" + (double)nKamokuSum[i] / nStudentNumber + "点です。");
		}

		//生徒の数だけ繰り返す
		for(int i = 0; i < nStudentNumber; i++) {
			//各生徒の平均点を求めた合計から表示する
			System.out.println(i + 1 + "人目の平均点は" + (double)nStudentSum[i] / nKamokuNumber + "点です。");
		}

		//標準出力ストリームをクローズする
		stdIn.close();
	}

}
