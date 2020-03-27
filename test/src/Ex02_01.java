
public class Ex02_01 {

	public static void main(String[] args) {
		int a, b;
		int result;
		
		a = 1234;
		b = 456;
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);	//문자열과 변수를 연산자를 이용해 한 줄에 출력 가능

		result = a - b;
		System.out.println(a + "-" + b + "=" + result);	
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);	
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);	
		
		result = a % b;
		System.out.println(a + "%" + b + "=" + result);	
	}

}
