package com.cn.biaozhun;

public class BiaoZhun {

	public static void main(String[] args) {
		//一维数组
		int score[]={67,50,87,69,90,100,88};
		System.out.println(score.length);

		//二维数组
		int score1[][] = {{67,96}, {78,52,96}, {99,100,87,63,74}};
		System.out.println(score1.length);
		//三维数组
		int score2[][][] = {
							{
					         {56,89},{1,8,96,8},{1,2,3,4,5},{10,2,33,5}
					        }
				          }; 
		System.out.println(score2.length);

		//四维数组
		int score3[][][][] = {
				{
					{
						{56,89},{1,8,96,8},{1,2,3,4,5},{10,2,33,5}
						}
					}
				};
		System.out.println(score3.length);
		
		
		
		Persion per1=new Persion();
		
		per1.name="张山";
		per1.age=28;
		per1.color="蓝色";
		per1.setGuojia("中国");
		per1.tell();
	}
}
class Persion {
	private String guojia;
	String name;
	int age;
	public String getGuojia() {
		return guojia;
	}
	public void setGuojia(String guojia) {
		this.guojia = guojia;
	}
	String color;
	public void tell(){
		
		System.out.println("姓名："+name+"，年龄："+age+"，颜色："+color+"，国家："+guojia);
	}
	public static   void teww(){
		
	}
}

















