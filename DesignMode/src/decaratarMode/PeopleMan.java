package decaratarMode;

public class PeopleMan implements People {
	private int peopleFaceScore;
	private int peopleBodyScore;
	
	public PeopleMan() {
		
	}
	
	public PeopleMan(int faceScore,int bodyScore) {
		this.peopleFaceScore=faceScore;
		this.peopleBodyScore=bodyScore;
	}
	
	@Override
	public void faceScore() {
		// TODO 自动生成的方法存根
		System.out.println("这个人的颜值为："+peopleFaceScore);
	}

	@Override
	public void bodyScore() {
		// TODO 自动生成的方法存根
		System.out.println("这个人的身高为："+peopleBodyScore);
	}

	public int getPeopleFaceScore() {
		return peopleFaceScore;
	}

	public void setPeopleFaceScore(int peopleFaceScore) {
		this.peopleFaceScore = peopleFaceScore;
	}

	public int getPeopleBodyScore() {
		return peopleBodyScore;
	}

	public void setPeopleBodyScore(int peopleBodyScore) {
		this.peopleBodyScore = peopleBodyScore;
	}
	
	
	
}
