package java2_006;
enum Direction{EAST,WEST,SOUTH,NORTH};

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Direction[] ways= Direction.values();   //��ü ���� �� ������ ���� �ϴ� �޼���
				 for( Direction way:ways) {
					 System.out.println(way+",");
				 }
		 System.out.println("�� �ϳ��� �����ϼ���");
		/*
		 * Direction origin=Direction.EAST; origin=Direction.SOUTH;
		 * 
		 * if(origin==Direction.WEST) {} if(origin==Direction.NORTH) {}
		 */
	}

}
