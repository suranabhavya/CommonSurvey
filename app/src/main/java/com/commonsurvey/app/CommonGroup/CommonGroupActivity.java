package com.commonsurvey.app.CommonGroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;

public class CommonGroupActivity extends AppCompatActivity {
    static VerticalStepperFormView verticalStepperForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_group);

        verticalStepperForm = findViewById(R.id.stepper_form);

    }
}