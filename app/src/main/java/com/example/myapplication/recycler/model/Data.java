package com.example.myapplication.recycler.model;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Integer> list;

    public Data() {
        list = new ArrayList<>();
        list.add(R.drawable.ic_launcher_foreground);

    }

    public List<Integer> getList() {
        return list;
    }
}
