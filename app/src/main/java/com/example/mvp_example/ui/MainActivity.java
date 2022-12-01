package com.example.mvp_example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp_example.R;

public class MainActivity extends AppCompatActivity implements ProductViewInterface {

    //The MainActivity (Java Class) present the controller in (MVC Architecture)

    public TextView txt;
    public Button btn;
    ProductPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);

        //by using this keyword we refer the Interface that
        //Implemented inside this activity
        presenter = new ProductPresenter(this);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //the activity request data from model using presenter
                presenter.getProductName();
            }
        });




    }


    //the presenter retrieve the value of product name
    //from model and send it to the Interface
    //the Interface method will display the value of name into the TextView
    @Override
    public void onGetDataProductName(String name) {

        txt.setText(name);
    }
}