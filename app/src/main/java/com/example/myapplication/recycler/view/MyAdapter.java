package com.example.myapplication.recycler.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapplication.R;
import com.example.myapplication.recycler.presenter.IRecyclerThreePresenter;
import com.example.myapplication.recycler.presenter.ThreePresenter;

import java.net.URL;
import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private IRecyclerThreePresenter iRecyclerMainPresenter;
    private ThreePresenter presenter = new ThreePresenter();

    public MyAdapter(IRecyclerThreePresenter iRecyclerMainPresenter) {
        this.iRecyclerMainPresenter = iRecyclerMainPresenter;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_three, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.position = position;
        iRecyclerMainPresenter.bindView(holder);
    }

    @Override
    public int getItemCount() {
        return iRecyclerMainPresenter.getItemCount();
    }



    class MyViewHolder extends RecyclerView.ViewHolder implements IViewHolder, Hold {

        private TextView textView;
        private int position = 0;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.image_view);
            textView.setOnClickListener(e->{
                presenter.onButtonClick();
            });
        }

        @Override
        public void setText(int drawable) {
            textView.setBackgroundResource(drawable);
        }



        @Override
        public int getPos() {
            return position;
        }

        @Override
        public void setI(int i) {
            textView.setText(" Click "+i);
        }


    }
}
