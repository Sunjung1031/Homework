package 실습과제1회;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		
	  //준비단계 => 변수 선언, 배열 선언 => 데이터를 저장할 그릇(메모리의 저장공간)
		int[] arrMoney = {50000,10000,5000,1000,500,100,50,10,1}; 
		String[]str = {"오만원권","만원권","오천원권","천원권","오백원","백원","오십원","십원","일원"};
		
		
      //입력단계 
		System.out.println("금액을 입력하세요>>> ");
		Scanner scan = new Scanner(System.in);
		
		int Money = scan.nextInt(); //문자열을 정수로 변환 
		
		//처리단계 => 인간의 논리적인 사고(logic) => 제어문을 잘 조합 시키는 것 => 경험치 
		for(int i=0; i<arrMoney.length; i++) { //일반 for문
			int num = Money / arrMoney[i];
		     //나머지 금액 => 15750
			int remainder = Money % arrMoney[i]; //나머지값 구하기
			Money = remainder;
			
			if(num > 0 && i< 4) { 
				System.out.println(str[i]+" " +num + "매");
			}else if(num>0 && i>=4){
				System.out.println(str[i]+" "+ num + "개");
		
			}
		}
		
	  
	    /*
	       Scanner scan = new Scanner(System.in);
	     
	        
	        int[] don = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	        
	        while(true) {
	            System.out.println("금액을 입력하시오 : ");
	            int money = scan.nextInt();
	          
	            
	            for(int i = 0; i<don.length; i++) {
	                System.out.println(don[i] + "원 : " + (money/don[i]));
	                money %= don[i]; // money를 don[i]로 나누고 그 나머지를 money에 대입한다. 
	            }
	        }
	    */
	     }
	}
	 
	


