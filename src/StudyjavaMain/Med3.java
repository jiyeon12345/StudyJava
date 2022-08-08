package StudyjavaMain;
class Med3 {

	//--- a, b, c�쓽 以묒븰媛믪쓣 援ы븯�뿬 諛섑솚 ---//
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
		else
			return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	/*
	  처음 if 문의 판단
	　　  if ((b >= a && c<= a) || (b <= a && c >= a)
	 에 주목합니다. 
	  여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
	  (실질적으로 동일한 판단)이, 계속하여  else 이후에서
	　　 else if ((a > b && c < b) || (b <= a && c > b)
	  로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우,
	  2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,
	  효율이 나빠집니다.
	*/

	static int med31(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a竊얺竊얿
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a竊얺竊쓈
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a竊얿竊얺
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a竊쓈竊얺
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c竊얷竊얺
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a竊쓇竊얿
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a竊쓇竊쓈
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c竊얷竊쓇
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b竊얷竊얿
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b竊얷竊쓈
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b竊얿竊얷
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b竊쓈竊얷
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c竊얺竊얷
	}
}
