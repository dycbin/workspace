package cn.itcast.p1.string.demo;

public class Test {
    public static void main(String[] args) {
      show(new Cat());  // �� Cat ������� show ����
      show(new Dog());  // �� Dog ������� show ����
                
      Animal a = new Cat();  // ����ת��  
      a.eat();               // ���õ��� Cat �� eat
      Cat c = (Cat)a;        // ����ת��  
      c.work();        // ���õ��� Cat �� work
  }  
            
    public static void show(Animal a)  {
      a.eat();  
        // �����ж�
        if (a instanceof Cat)  {  // è�������� 
            Cat c = (Cat)a;  
            c.work();  
        } else if (a instanceof Dog) { // ���������� 
            Dog c = (Dog)a;  
            c.work();  
        }  
    }  
}