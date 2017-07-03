/* 演習06-18
 * 凹凸な配列の行数と各行の列数をキーボードから入力するようにして書き換え
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_06_18;

import java.util.Scanner;

public class OutotuArray {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int[][] nArray;
		
		System.out.print("行列の行数：");
		int nRow = stdIn.nextInt();
		
		nArray = new int[nRow][];
		
		for(int i = 0; i < nRow; i++) {
			int nColumn = stdIn.nextInt();
			nArray[i] = new int[nColumn];
		}
		
		for(int i = 0; i < nArray.length; i++) {
			for(int j = 0; j < nArray[i].length; j++) {
				System.out.printf("%3d", nArray[i][j]);
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
