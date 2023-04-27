package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {
	
	public static void main(String[] args) {
		
		Remote r1 = new RemoteChild();
		r1.cellName = "DuroCell";
		r1.display();
		r1.functionRemote();
		
		RemoteChild r = new RemoteChild();
		r.cellName = "DuroCell";
		r.display();
		r.functionRemote();
	}

}
