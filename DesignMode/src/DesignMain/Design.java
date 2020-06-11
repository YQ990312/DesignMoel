package DesignMain;

import decaratarMode.PeopleMakeUp;
import decaratarMode.PeopleMan;
import staticEntrustenMode.EntrustenMarry;
import staticEntrustenMode.MyMarry;

public class Design {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		PeopleMan peopleman=new PeopleMan();
//		peopleman.setPeopleBodyScore(50);
//		peopleman.setPeopleFaceScore(60);
//		peopleman.bodyScore();
//		peopleman.faceScore();
//		
//		PeopleMakeUp peopleMakeUp=new PeopleMakeUp(peopleman);
//		peopleMakeUp.bodyScore();
//		peopleMakeUp.faceScore();
		new EntrustenMarry(new MyMarry("杨家齐","李智恩")).getMarry();;
	}

}
