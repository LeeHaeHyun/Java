
public class Ex02_PackageUse
{
	public static void main(String[] args)
	{
		Apple apple = new Apple();
		apple.showName();
		
		//Banana banana = new Banana(); 바나나가 어딨는지 알 수 없어서 실행 안됨
		com.stiudy.Banana banana = new com.stiudy.Banana(); // 패키지명.클래스 경로 설정
		banana.showName();
	}
}
