package com.commonsurvey.app.CommonGroup.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class GeneralWork extends Step<String> {

    protected GeneralWork(String title) {
        super(title);
    }

    @Override
    public String getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(String data) {

    }

    @Override
    protected IsDataValid isStepDataValid(String stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View generalWorkData = inflater.inflate(R.layout.activity_general_work, null, false);
        EditText otherWork = generalWorkData.findViewById(R.id.editTextTextPersonName16);
        EditText hhWork = generalWorkData.findViewById(R.id.editTextTextPersonName17);
        EditText laborWorkDays = generalWorkData.findViewById(R.id.editTextTextPersonName18);
        EditText noOfLaborWork = generalWorkData.findViewById(R.id.editTextTextPersonName19);
        EditText costLabor = generalWorkData.findViewById(R.id.editTextTextPersonName20);

        return generalWorkData;
    }

    @Override
    protected void onStepOpened(boolean animated) {

    }

    @Override
    protected void onStepClosed(boolean animated) {

    }

    @Override
    protected void onStepMarkedAsCompleted(boolean animated) {

    }

    @Override
    protected void onStepMarkedAsUncompleted(boolean animated) {

    }
}