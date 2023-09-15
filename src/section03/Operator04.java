package section03;
/*
 * 4. 논리 연산자
 * 	&& : And 조건연산자. 교집합 개념. 두 항 모두 true 일 때 true 
 * 	|| : Or 조건연산자. 합집함 개념. 두 항 중에 하나 이상 true 일 때 true
 * 	!  : Not 조건연산자. 여집합 개념. 논리(boolean)값 반전시킨다.
 * 
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("result: " + result);

		int age = 28;
		int sex = 1; // 성별 남자:1, 여자:2
		if(age >= 19 && sex == 1) {
			System.out.println("성인 남성입니다.");
		}
		
		boolean result2 = true || false;
		System.out.println("result2: " + result2);
		
		result2 = !result2;
		System.out.println("!result2: " + result2);
		
		String category = "의류";
		if(category == "식품" || category == "전기전자" || category == "의류") {
			System.out.println("20% 할인 행사 중입니다.");
		} else {
			System.out.println("할인 미적용 상품입니다.");
		}
			
		boolean result3 = ((true && true) && true) || false;
		System.out.println(result3);
			
		}
	
	}

