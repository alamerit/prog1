package com.example.myapplication.standart.view;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.standart.presenter.MainPresenter;



public class MainActivity extends AppCompatActivity implements MainView{

	private Button button;
	private MainPresenter mainPresenter;
	private EditText editText;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = findViewById(R.id.button_activity_main);
		editText = findViewById(R.id.editTextInput);
		textView = findViewById(R.id.textViewOut);
		mainPresenter = new MainPresenter(this);
		if(savedInstanceState != null){
			mainPresenter.onButtonClick("");
		}
	}


	public void buttonClick(View view){
		String s =editText.getText().toString();
		mainPresenter.onButtonClick(s);
	}

	@Override
	public void setButtonText(StringBuilder x) {

		textView.setText(x);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("x",textView.getText().toString());
	}
}
