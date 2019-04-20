package doubleclass;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
	}
	
	class A{
		A(){
			System.out.println("A 按眉啊 积己凳");
		}
		
		class B(){
			B(){
				System.out.println("B 按眉啊 积己凳");
			}
			int field1;
			
			void method1() {
				
			}
		}
		
		static class C{
			C(){
				System.out.println("C 按眉啊 积己登");
			}
			
			int field1;
			static int field2;
			
			void method1() {
				
			}
			static void method2() {
				
			}
		}
}
