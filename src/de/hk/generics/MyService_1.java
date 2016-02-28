package de.hk.generics;

public class MyService_1 implements IMyGenericServiceInterface<MyRequestBean_1, MyResponseBean>{

	@Override
	public MyResponseBean doSomeThing(MyRequestBean_1 request) {
		
		MyResponseBean myResponseBean = new MyResponseBean();
		
		myResponseBean.setAblaufleistung(request.getBeitrag() + 100.0d);
		
		
		return myResponseBean;
	}

	
	
}
