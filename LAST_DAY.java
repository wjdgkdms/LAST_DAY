import java.util.Scanner;
public class switch_2 {

	public static void main(String[] args) {
		// 1월~12월 까지 마지막 날을 출력합니다.
		//월에 해당하는 값을 숫자로 입력해주세요.
		//1,3,5,7,8,10,12월을 31일까지 존재
		//4,6,9,11월 30일 까지 존재
		//2월은 28일까지 존재
		
		
		int month;
		System.out.println("1월~12월까지 마지막 날을 출력하는 프로그램입니다.");
		System.out.println("월에 해당하는 값을 숫자로 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		int	day = 31;
			System.out.println(month + "월의 마지막 달은" + day+"입니다");
		break;
		
		case 4: case 6: case 9: case 11: 
			day = 30;
			System.out.println(month + "월의 마지막 달은" + day+"입니다");
		break;
			
		case 2:
			day = 28;
			System.out.println(month + "월의 마지막 달은" + day+"입니다");
		break;
		
		}
		}
	}


