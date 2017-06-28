/* 演習03-17
 * ランダムな値を生成してじゃんけんを表示するプログラム
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_17;

import java.util.Random;

public class Janken {
	public static void main(String[] arg) {
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();

		//0から2のランダムな値を生成して格納
		int nHand = rand.nextInt(3);

		//格納された0から2のランダムな値で分岐
		switch(nHand) {
		//生成されたランダムな値が0の時、「グー」を表示
		case 0: System.out.println("グー");	break;
		//生成されたランダムな値が1の時、「チョキ」を表示
		case 1: System.out.println("チョキ");	break;
		//生成されたランダムな値が2の時「パー」を表示
		case 2: System.out.println("パー");	break;
		}
	}
}
