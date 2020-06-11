package staticEntrustenMode;

public class MyMarry implements Marry {
	private String marryMan;
	private String marryWoman;
	
	public MyMarry(String man,String woman) {
		this.marryMan=man;
		this.marryWoman=woman;
	}
	@Override
	public void getMarry() {
		// TODO 自动生成的方法存根
		System.out.println("今天"+marryMan+"和"+marryWoman+"结婚了");
	}
	
}
