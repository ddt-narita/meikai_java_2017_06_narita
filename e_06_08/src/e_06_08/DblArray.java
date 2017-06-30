/* 演習06-08
 * double型の配列の全要素の合計値と平均値を求めるプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_08;

import java.util.Scanner;

public class DblArray {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("double型の配列に要素を入力してください。");
		System.out.print("要素数：");
		int nArrayNumber = stdIn.nextInt();
		
		double[] dblArray = new double[nArrayNumber];
		
		for(int i = 0; i < nArrayNumber; i++) {
			System.out.print("nArray[" + i + "] = ");
			dblArray[i] = stdIn.nextDouble();
		}
		
		double dblSum = 0;
		for(double i : dblArray) {
			dblSum += i;
		}
		
		System.out.println("全要素の合計は" + dblSum + "平均は" + dblSum / nArrayNumber);
		
		
		stdIn.close();
	}

}
