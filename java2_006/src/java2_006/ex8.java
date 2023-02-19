package java2_006;
class staff{
	interface Workable{
		void work(String what,int time) ;
		}

	void dowork(Workable w,String what,int time) {
		w.work(what,time);
		
		}
	}
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staff kim=new staff();
		kim.dowork(new staff.Workable() {
			public void work(String what,int time) {
				System.out.println(what+time);
			}
		},"보고서 작성",2);
		
		staff lee=new staff();
		kim.dowork(new staff.Workable() {
			public void work(String what,int time) {
				System.out.println(what+time);
			}
		},"커피타기",3);

	}

}
