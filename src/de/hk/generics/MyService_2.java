package de.hk.generics;

public class MyService_2 implements
		IMyGenericServiceInterface<MyRequestBean_2, MyResponseBean> {

	@Override
	public MyResponseBean doSomeThing(MyRequestBean_2 request) {

		MyResponseBean myResponseBean = new MyResponseBean();

		myResponseBean.setAblaufleistung(request.getLeistung() + 200.0d);

		return myResponseBean;
	}

}
