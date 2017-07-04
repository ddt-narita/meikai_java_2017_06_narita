/* 演習06-02
 * 要素数5のint型の配列に先頭から順に5,4,3,2,1を代入して表示
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_02;

public class Array {

	public static void main(String[] args) {
		//配列の要素数
		int nArrayNumber = 5;

		//要素数5の配列のインスタンスを生成
		int[] nArray = new int[5];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に先頭から5,4,3,2,1となるように代入
			nArray[i] = 5 - i;
		}

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素を表示する
			System.out.println("a[" + i + "] = " + nArray[i]);
		}
	}

}
