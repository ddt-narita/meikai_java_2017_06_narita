/* 演習06-03
 * 要素数5のdouble型の配列に先頭から1.1, 2.2, 3.3, 4.4, 5.5を代入して表示
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_03;

public class DblArray {

	public static void main(String[] args) {
		//配列の要素数
		int nArrayNumber = 5;
		
		//double型の配列を生成
		double[] dblArray = new double[nArrayNumber];
		
		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に1.1をかけたもの代入
			dblArray[i] = 1.1 * (i + 1);
		}
		
		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素の値を表示する
			System.out.printf("dblArray[" + i + "] = %1f \n", dblArray[i]);
		}
	}

}
