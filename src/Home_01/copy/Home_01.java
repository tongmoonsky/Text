package Home_01.copy;
/**
 * @date time  2018-3-18
 * @author 彤彤
 *
 */
public class Home_01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int a1 ;
		int a2 ;
		System.out.println("a的原来值是:"+a);
		System.out.println("b的原来值是:"+b);
		a1 = a;
		a2 = b;
		a = a2;
		b = a1;
		System.out.println("a转换后的值是:"+a);
		System.out.println("b转换后的值是:"+b);
		
		
		
		
	}
	

}
