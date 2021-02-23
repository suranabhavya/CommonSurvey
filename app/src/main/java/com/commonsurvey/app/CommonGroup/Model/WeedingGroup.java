package com.commonsurvey.app.CommonGroup.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class WeedingGroup extends Step<String> {

    protected WeedingGroup(String title) {
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
        View weedingGroupData = inflater.inflate(R.layout.activity_weeding_group, null, false);
        RadioGroup weedingRadioGroup1 = (RadioGroup) weedingGroupData.findViewById(R.id.rg13);
        RadioButton weedingYes = (RadioButton) weedingGroupData.findViewById(R.id.radioButton26);
        RadioButton weedingNo = (RadioButton) weedingGroupData.findViewById(R.id.radioButton27);
        RadioGroup weedingRadioGroup2 = (RadioGroup) weedingGroupData.findViewById(R.id.rg14);
        RadioButton none = (RadioButton) weedingGroupData.findViewById(R.id.radioButton28);
        RadioButton manual = (RadioButton) weedingGroupData.findViewById(R.id.radioButton29);
        RadioButton withMachine = (RadioButton) weedingGroupData.findViewById(R.id.radioButton30);
        RadioButton spraying = (RadioButton) weedingGroupData.findViewById(R.id.radioButton31);
        RadioButton otherTechnique = (RadioButton) weedingGroupData.findViewById(R.id.radioButton32);
        EditText otherTechniqueName = weedingGroupData.findViewById(R.id.editTextTextPersonName10);
        return null;
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