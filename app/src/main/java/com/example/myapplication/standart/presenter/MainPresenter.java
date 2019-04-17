package com.example.myapplication.standart.presenter;


import com.example.myapplication.standart.model.Model;
import com.example.myapplication.standart.view.MainView;


public class MainPresenter {
	private static   StringBuilder oldX = new StringBuilder() ;
	private Model model;
	private MainView mainView;

	public MainPresenter(MainView mainView){
		this.mainView = mainView;
		model = new Model();
	}
	public void onButtonClick(String eText){
		oldX.append( eText);
		model.setX(oldX);
		mainView.setButtonText(oldX);
	}

}
