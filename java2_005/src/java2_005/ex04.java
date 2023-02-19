package java2_005;
 class ex04 {
static <t extends comparable> t max(t a, t b) {
	if(a.compareTo(b)>0) {
		return a;
	}else {
		return b;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=ex04.max(1,2);
		System.out.println(result);
	}

}
