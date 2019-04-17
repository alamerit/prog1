package com.example.myapplication.moxy.presenter;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.myapplication.moxy.model.SecondModel;
import com.example.myapplication.moxy.view.SecondView;


@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {
	private StringBuilder sB = new StringBuilder();
	private SecondModel model;

	public SecondPresenter() {
		this.model = new SecondModel();
	}


	public void onButtonClick(String newX){
		sB.append(newX);
		model.setX(sB);
		getViewState().setButtonText(sB);
	}

}
