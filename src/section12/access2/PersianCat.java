package section12.access2;

// 인터페이스 상속은 extends 가 아니고 implements 임
public class PersianCat implements Cat{

	@Override
	public void eat() {
		System.out.println("교양있게 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println("우아하게 잡니다.");
	}

	@Override
	public void hunt() {
		System.out.println("도도하게 사냥을 해요.");
	}

}