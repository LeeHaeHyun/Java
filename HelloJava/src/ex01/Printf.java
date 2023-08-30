package ex01;

public class Printf
{

	public static void main(String[] args)
	{
		/* 1번 문제: 현이가 키우고 있는 게임 세 직업의 캐릭터 
			전사(war)의 다음 레벨까지 남은 경험치: 70000.159286
			마법사(wiz)의 다음 레벨까지 남은 경험치 : 5525.7777
			도적(thi)의 다음 레벨까지 남은 경험치 69527을
			printf를 사용하여 전사는 자리수 -30자리로, 소수점은 3자리까지만
			마법사는 소수점 2자리까지만
			도적은 정수 자리수를 10으로 출력하시오.*/
		
        double war = 70000.159286; // 전사의 남은 경험치
		double wiz = 5525.7777; // 마법사의 남은 경험치
		int thi = 69527; // 도적의 남은 경험치
		System.out.printf("전사 경험치: %-30.3f, 마법사 경험치:%.2f, 도적 경험치:%10d",war,wiz,thi);
		System.out.println();
		/* 2번 문제: 철수(cs)는 short형 75점, 영희(yh)는 byte형 55점인데
			철수가 영희에게 돈을 주고 시험지를 바꿔치기 했다.
			시험지를 바꿔치기 한 이후의 점수 선언을 하고
			영희의 점수를 철수한테 집어넣어 printf를 통해 둘의 시험점수가 같게 출력하시오*/
		
//		short cs = 75;
//		byte yh = 55;
//		System.out.printf("시험지 바꿔친 후 점수\n - 철수: %d점, 영희: %d점", cs, yh);
//		System.out.println(); //한 줄을 띄기 위해서
//		System.out.println(); //한 줄을 띄기 위해서
//	
//		// yh = cs; // 이건 에러남.. byte가 더 작기에
//		cs = yh; // byte보다 short이 더 크기에 자동형변환이 되어 대입할 수 있다. 결과: short형
//		
//		System.out.printf("그 이후의 점수\n - 철수: %d점, 영희: %d점", cs, yh);
		
		/* 3번 문제: double형 3.141592를 pi라는 변수에 선언 및 초기화를 하고
			int 변수 chan을 선언하여 pi를 집어넣어 printf로 chan의 값을 출력하시오*/
//		double pi = 3.141592;
//		int chan;
//		chan = pi; // 정수형 int(chan)보다 실수형 double(pi)가 바이트수가 더 큰 공간으로 오류가 난다
//		chan = (int)pi; //double형을 int형으로 바꿔준 후 chan에 넣으면 된다.
//		System.out.printf("pi를 집어넣은 chan의 값: %d",chan);
	}

}
