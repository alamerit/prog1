package com.example.myapplication.moxy.view;


import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setButtonText(StringBuilder x);
}
