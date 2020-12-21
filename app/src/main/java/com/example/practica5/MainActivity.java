package com.example.practica5;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView = null;
    private ImageButton myImageButton = null;
    private ImageView myImageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textView);
        myImageButton = findViewById(R.id.imageButton);
        myImageView = findViewById(R.id.imageView);

        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(myTextView.getText().toString().equalsIgnoreCase(getString(R.string.pulsa))) {
                    myTextView.setText(getString(R.string.llamando));
                    myImageButton.setImageResource(R.drawable.colgar);
                    myImageView.setImageResource(R.drawable.walterwhite2);

                }else if(myTextView.getText().toString().equalsIgnoreCase(getString(R.string.llamando))){
                    myTextView.setText(R.string.finalizada);
                    myImageButton.setImageResource(R.drawable.llamar);
                    myImageView.setImageResource(R.drawable.walterwhite);
                }else if(myTextView.getText().toString().equalsIgnoreCase(getString(R.string.finalizada))){
                    myTextView.setText(getString(R.string.llamando));
                    myImageButton.setImageResource(R.drawable.colgar);
                    myImageView.setImageResource(R.drawable.walterwhite2);
                }
            }
        });

    }
}