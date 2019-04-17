package com.example.myapplication.moxy.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.myapplication.R;
import com.example.myapplication.moxy.presenter.SecondPresenter;


public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    private static final String TAG = "ThreeActivity";

    private Button button;
    private EditText editText;
    private TextView textView;

    @InjectPresenter
    SecondPresenter presenter;


    @ProvidePresenter
    public SecondPresenter providePresenter() {
        return new SecondPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.editTextInputS);
        textView = findViewById(R.id.textViewOutS);
        button = findViewById(R.id.button_activity_second);


    }


    public void buttonClick(View view) {
        presenter.onButtonClick(editText.getText().toString());
    }

    @Override
    public void setButtonText(StringBuilder x) {
        Log.d(TAG, "setText: " + x);
        button.setText("Click mi");
        textView.setText(x.toString());
    }
}
