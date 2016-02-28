package de.hk.generics;

public interface IMyGenericServiceInterface <MYREQUEST,MYRESPONSE>{

	
	public MYRESPONSE doSomeThing(MYREQUEST request);
	
}
