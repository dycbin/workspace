package com.cn.biaozhun;

public class BiaoZhun {

	public static void main(String[] args) {
		//һά����
		int score[]={67,50,87,69,90,100,88};
		System.out.println(score.length);

		//��ά����
		int score1[][] = {{67,96}, {78,52,96}, {99,100,87,63,74}};
		System.out.println(score1.length);
		//��ά����
		int score2[][][] = {
							{
					         {56,89},{1,8,96,8},{1,2,3,4,5},{10,2,33,5}
					        }
				          }; 
		System.out.println(score2.length);

		//��ά����
		int score3[][][][] = {
				{
					{
						{56,89},{1,8,96,8},{1,2,3,4,5},{10,2,33,5}
						}
					}
				};
		System.out.println(score3.length);
		
		
		
		Persion per1=new Persion();
		
		per1.name="��ɽ";
		per1.age=28;
		per1.color="��ɫ";
		per1.setGuojia("�й�");
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
		
		System.out.println("������"+name+"�����䣺"+age+"����ɫ��"+color+"�����ң�"+guojia);
	}
	public static   void teww(){
		
	}
}
















