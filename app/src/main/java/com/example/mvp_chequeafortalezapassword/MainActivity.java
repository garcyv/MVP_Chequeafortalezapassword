package com.example.mvp_chequeafortalezapassword;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.example.mvp_chequeafortalezapassword.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements Ivalidapassword{

    private ActivityMainBinding binding;
    private Pvalidapassword presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presenter = new Pvalidapassword(this);

        binding.editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               // Log.d(TAG,"changed " + s.toString());
                validafortalezapassword(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    @Override
    public void showcolor(String pColor) {
     binding.textView2.setBackgroundColor(Color.parseColor(pColor));
     binding.editTextPassword.setBackgroundColor(Color.parseColor(pColor));
    }

    @Override
    public void showtexto(String p_texto) {
        binding.textView2.setText(p_texto);

    }

    public void validafortalezapassword(String pPassword) {
        presenter.validapassword(pPassword);
    }
}