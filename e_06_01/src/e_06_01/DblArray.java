/* 演習06-01
 * 要素型がdoubleで要素数が5の配列を生成して全要素を表示するプログラムの作成
 * 作成日：6月30日
 * 作成者；成田修之
 */

package e_06_01;

public class DblArray {

	public static void main(String[] args) {
		//配列の要素数
		int dblArrayNumber = 5;

		//要素型doubleの配列を生成
		double[] dblArray = new double[dblArrayNumber];

		//要素数分繰り返す
		for(int i = 0; i < dblArrayNumber; i++) {
			//配列の全要素を表示する
			System.out.println(dblArray[i]);
		}
	}

}
