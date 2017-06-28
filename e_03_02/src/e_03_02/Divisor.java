/* 演習03-02
 * 二つのし正の整数を読み込んで後者が前者の約数であれば約数であることをそうでなければ約数でないことを表示するプログラムの作成
 * 作成日：6月28日
 * 作成者：成田修之
 */


package e_03_02;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int nDividedA = stdIn.nextInt();
		
		System.out.print("整数B：");
		int nDivisorB = stdIn.nextInt();
		
		if(nDividedA % nDivisorB == 0) {
			System.out.print("BはAの約数です。");
		} else {
			System.out.print("BはAの約数ではありません。");
		}
		
		stdIn.close();
	}

}
