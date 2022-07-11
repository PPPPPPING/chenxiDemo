package com.chenxi.java.CommonTest;

/*
 * 类应该具有的功能
 * 
 * 方法 描述类应该就有的功能
 * 比如  Math类  sqrt()\random()\
 * 
 * 
 * 
 * 1举例
 * 
 * public void eat(){}   
 * public void sleep(int hour) {} //void 没有返回值的意思
 * public String getName() {}
 * public String geiNation( String nation) {}  //有返回值 返回两个字符串
 * 
 * 
 * 2 方法的声明   前线修饰符 返回值类型  方法名（形参列表）{
 * 		方法体
 * 
 *	 }
 *
 *注意   static final  abstract  来修饰的方法  后面再讲
 * 	3 说明：   
 *  	3.1 关于权限修饰符  ：默认方法的修饰符为public
 *  		java   规定的4种权限修饰符  private  public 缺省  protect  封装在细讲
 *  
 *  	3.2返回值类型  有返回值 vs 没有返回值
 *  	yi如果方法有返回值，则必须在方法声明时，制定返回值分类型
 * 		 同时 方法中 需要使用return关键字来指定返回类型的变量或者常量：“return 变量或者常量”（重点）
 *  	//返回的数据一定是要我要求的类型的
 *  
 * 		 er如果方法没有返回值，则方法申明时：使用void来表示
 *  
 * 		 san我们顶一发该不该有返回值      一、题目要求  二、凭经验
 *  
 *  	3.3方法名：属于标识符，遵循标识符的规则和规范：“见名知意”
 *  
 *  	3.4形参列表：方法可以声明0  11  或者多个
 *  			格式：数据类型1  形参1，数据类型2   形参2，...
 *  			我们定义方法时 该不该定义形参：
 *  			一题目要求 
 *  			二凭经验具体问题具体分析
 *  
 *  	3.5方法体：方法功能的体现。
 *  
 *  
 *
 *
 *
 *		4return关键字的使用：
 *	1.使用的范围    使用在方法中
 *	2.作用：	一  结束方法
 *			二针对于有返回值类型的方法，使用“return 数据“返回所要的数据
 *	3.注意点：return后面不能声明执行语句
 *
 *		5方法的使用中：可以调用当前类的属性或者方法
 *		方法A中有调用了方法A：递归方法
 *		方法中不能定义新方法
 * 
*/
public class CustomerTest {
	public static void main(String[] args) {
			Customer cust1 = new Customer();
			
			
			cust1.eat();
			
	}

}

//客户类
class Customer {

	// 属性
	String name;
	int age;
	boolean isMale;

	// 方法
	public void eat() {
		System.out.println("客户吃饭");
		return;// 结束方法的作用
		// return后不能声明表达式
	}

	public void sleep(int hour) {
		System.out.println("休息了" + hour + "个小时");
//		方法A中有调用了方法A：递归方法
		eat();//方法的使用中：可以调用当前类的属性或者方法
	}

	public String getName() {// 调用方法时返回一个数据 数据是String类型
		return name;
//		 return后不能声明表达式
//		 System.out.println("客户吃饭");
	}

	public String geiNation(String nation) {
		String info = "我的国籍是：" + nation;
		return info;// 返回的数据一定是要我要求的类型的
	}

	public void info() {
		//方法中不能定义新方法
//		public void infofo() {
//			
//		}
	}

}
// 方法
