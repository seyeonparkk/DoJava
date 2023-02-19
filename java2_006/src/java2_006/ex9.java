package java2_006;
enum Direction{EAST,WEST,SOUTH,NORTH};

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Direction[] ways= Direction.values();   //전체 값을 다 가지고 오게 하는 메서드
				 for( Direction way:ways) {
					 System.out.println(way+",");
				 }
		 System.out.println("중 하나를 선택하세요");
		/*
		 * Direction origin=Direction.EAST; origin=Direction.SOUTH;
		 * 
		 * if(origin==Direction.WEST) {} if(origin==Direction.NORTH) {}
		 */
	}

}
