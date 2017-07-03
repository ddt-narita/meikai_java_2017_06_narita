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
		
		//
		int[] nKamokuSum = new int[nKamokuNumber];
		
		//
		int[] nStudentSum = new int[nStudentNumber];
		
		//
		for(int i = 0; i < nStudentNumber; i++) {
			//
			for(int j = 0; j < nKamokuNumber; j++) {
				//
				nKamokuSum[j] += nTensuu[i][j];
				//
				nStudentSum[i] += nTensuu[i][j];
			}
		}
		
		//
		for(int i = 0; i < nKamokuNumber; i++) {
			//
			System.out.println(Kamoku[i] + "の平均点は" + (double)nKamokuSum[i] / nStudentNumber + "点です。");
		}
		
		//
		for(int i = 0; i < nStudentNumber; i++) {
			//
			System.out.println(i + 1 + "人目の平均点は" + (double)nStudentSum[i] / nKamokuNumber + "点です。");
		}
		
		//
		stdIn.close();
	}

}
