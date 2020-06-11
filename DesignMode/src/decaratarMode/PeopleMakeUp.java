package decaratarMode;

public class PeopleMakeUp implements People{
	private PeopleMan peopleman;
	
	public PeopleMakeUp(PeopleMan peopleman) {
		this.peopleman=peopleman;
		System.out.println("这个人开始打扮了");
	}
	
	@Override
	public void faceScore() {
		// TODO 自动生成的方法存根
		System.out.println("打扮后这个人的颜值提高10："+(peopleman.getPeopleFaceScore()+10));
	}

	@Override
	public void bodyScore() {
		// TODO 自动生成的方法存根
		System.out.println("穿增高鞋后这个人的身高提高10厘米为："+(peopleman.getPeopleBodyScore()+10));
		
	}

	public PeopleMan getPeopleman() {
		return peopleman;
	}

	public void setPeopleman(PeopleMan peopleman) {
		this.peopleman = peopleman;
	}
	
	
	
}
