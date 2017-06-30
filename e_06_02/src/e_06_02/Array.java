/* 演習06-02
 * 要素数5のint型の配列に先頭から順に5,4,3,2,1を代入して表示
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_02;

public class Array {

	public static void main(String[] args) {
		
		int nArrayNumber = 5;
		
		int[] nArray = new int[5];
		
		for(int i = 0; i < nArrayNumber; i++) {
			nArray[i] = 5 - i;
		}
		
		for(int i = 0; i < nArrayNumber; i++) {
			System.out.println("a[" + i + "] = " + nArray[i]);
		}
	}

}
