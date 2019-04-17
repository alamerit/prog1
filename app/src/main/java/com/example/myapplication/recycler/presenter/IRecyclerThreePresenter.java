package com.example.myapplication.recycler.presenter;

import com.example.myapplication.recycler.view.IViewHolder;

public interface IRecyclerThreePresenter {
    void bindView(IViewHolder iViewHolder);
    int getItemCount();

}
