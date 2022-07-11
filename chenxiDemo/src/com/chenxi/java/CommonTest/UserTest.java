package com.chenxi.java.CommonTest;
/**
 * 类中属性的使用
 * 
 * 属性（成员变量）vs 局部变量
 *
 *
 *1.相同点：
 *	1.1定义变量的格式   数据类型 变量名 = 变量值
 *	1.2先声明 后使用
 *	1.3变量都有其对应的作用域
 *2.不同点：
 *
 *	2.1在类中声明的位置不同
 *	属性  直接定义在类的一对{}内
 *	局部变量  生命在方法内 发放形参 代码块内
 *	2.2 关于权限修饰符的不同
 *	属性  可以在声明属性是 指明其权限  使用权限修饰符
 *	常用的权限修饰符 private public 缺省  protect
 *	目前 使用缺省
 *
 *	局部变量 不能使用权限修饰符
 *
 *
 *	默认初始化值的情况
 *	属性  类的属性  根据其类型  都有默认初始化值
 *	整形（byte  short  int  long） 0
 *	浮点型（float  double）0.0
 *	字符型（char） （0或者'\u0000'）
 *	布尔型(boolean):false
 *
 *	引用数据类型(类 数组 接口)：null
 *		局部变量：没有默认初始化值
 *意味着  我们在调用局部变量之前一定要显示赋值
 *特别的形参在调用时  显示赋值
 *
 *2.4  在内存中的加载的位置
 *属性 加载到堆空间中（非 static）
 *局部变量  加载到栈空间
 *
 */
public class UserTest {
	
	public static void main(String[] args) {
		 User u1 = new User();
		 System.out.println("u1.name");
		 System.out.println("u1.age");
		 System.out.println("u1.isMale");
		 
		 //特别的形参在调用时  显示赋值
		 u1.talk("韩语");
	}
	  
	   
}
class User{
	//属性（成员变量）
			String name;
			int age = 1;
			boolean isMale;
		
			
			public void talk(String language) {//language  形参
				System.out.println("我们使用"+language+"进行交流");
				
			}
			
			public void eat() {
				String food = "烙饼";//局部变量     我们在调用局部变量之前一定要显示赋值
				System.out.println("北方人喜欢吃"+food);
			}
			
}
