package java003;
//45�������� �ζǹ�ȣ�� �������� �����϶�->����� 6��
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[45];

		for(int i=0; i<num.length; i++) {
			num[i]=i+1;
		}
		
		for(int i=0; i<6; i++) {
			num[i]=(int)(Math.random()*45);   
			
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(num[i]);
		}
		
	}

}
