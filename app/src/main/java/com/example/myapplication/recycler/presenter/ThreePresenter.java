package com.example.myapplication.recycler.presenter;

import com.arellomobile.mvp.MvpPresenter;
import com.example.myapplication.R;
import com.example.myapplication.moxy.model.SecondModel;
import com.example.myapplication.moxy.view.SecondView;
import com.example.myapplication.recycler.model.Data;
import com.example.myapplication.recycler.view.Hold;
import com.example.myapplication.recycler.view.IViewHolder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ThreePresenter extends MvpPresenter<Hold> {


    int i = 0;
    RecyclerThreePresenter recyclerMainPresenter = new RecyclerThreePresenter();

    public void onButtonClick() {
        i++;
        getViewState().setI(i);

    }


    private class RecyclerThreePresenter implements IRecyclerThreePresenter {

        private Data data = new Data();
        private List<Integer> list = data.getList();
        @Override
        public void bindView(IViewHolder holder) {

            holder.setText(list.get(0));


        }

        @Override
        public int getItemCount() {
            return list.size();
        }


    }

    public RecyclerThreePresenter getRecyclerMainPresenter() {
        return recyclerMainPresenter;
    }


}
