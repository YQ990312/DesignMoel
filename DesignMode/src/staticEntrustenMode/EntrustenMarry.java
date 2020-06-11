package staticEntrustenMode;

public class EntrustenMarry implements Marry {
	private Marry marrPeople;
	
	public EntrustenMarry(Marry marrPeople) {
		this.marrPeople=marrPeople;
	}
	
	@Override
	public void getMarry() {
		// TODO 自动生成的方法存根
		beginMarry();
		marrPeople.getMarry();
		endMarry();
	}
	
	private void beginMarry() {
		System.out.println("开始布置");
	}
	
	private void endMarry() {
		System.out.println("结束布置");
	}
	
}
