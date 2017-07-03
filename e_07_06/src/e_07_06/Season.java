/* 演習07-06
 * 引数で指定された月の季節を表示するメソッドを作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_06;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("季節を判定したい月を入力してください：");
		int nMonthSeason = stdIn.nextInt();
		
		System.out.print("それは");
		printSeason(nMonthSeason);
		System.out.println("です");
		
		stdIn.close();
	}

	
	static void printSeason(int m) {
		switch(m) {
		case 3:  
		case 4:  
		case 5:  System.out.print("春"); break;
		case 6:  
		case 7:  
		case 8:  System.out.print("夏"); break;
		case 9:  
		case 10: 
		case 11: System.out.print("秋"); break;
		case 12: 
		case 1:  
		case 2:  System.out.print("冬"); break;
		}
	}
}
