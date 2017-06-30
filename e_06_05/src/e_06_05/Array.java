/* 演習06-05
 * 配列の要素数と、個々の要素の値を読み込んで各要素の値を表示するプログラムの作成
 * 作成日：6月303日
 * 作成者：成田修之
 */

package e_06_05;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int nArrayNumber = stdIn.nextInt();
		
		int[] nArray = new int[nArrayNumber];
		
		for(int i = 0; i < nArrayNumber; i++) {
			System.out.print("nArray[" + i + "] = ");
			nArray[i] = stdIn.nextInt();
		}
		
		System.out.print("nArray = {");
		for(int i = 0; i < nArrayNumber; i++) {
			
			switch(i == nArrayNumber - 1 ? 1 : 0) {
			case 0: System.out.print(nArray[i] + ", "); break;
			case 1: System.out.print(nArray[i] + "}"); break;
			}
		}
		
		stdIn.close();
	}

}
