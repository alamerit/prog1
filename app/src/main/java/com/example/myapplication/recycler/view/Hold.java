package com.example.myapplication.recycler.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface Hold extends MvpView {
    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setI(int i);
}
