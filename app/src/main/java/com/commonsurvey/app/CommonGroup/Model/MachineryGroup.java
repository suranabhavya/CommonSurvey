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

public class MachineryGroup extends Step<String> {

    protected MachineryGroup(String title) {
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
        View machineryGroupData = inflater.inflate(R.layout.activity_machinery_group, null, false);
        RadioGroup machineryRadioGroup1 = (RadioGroup) machineryGroupData.findViewById(R.id.rg8);
        RadioButton machineryYes = (RadioButton) machineryGroupData.findViewById(R.id.radioButton44);
        RadioButton machineryNo = (RadioButton) machineryGroupData.findViewById(R.id.radioButton45);
        RadioGroup machineryRadioGroup2 = (RadioGroup) machineryGroupData.findViewById(R.id.rg9);
        RadioButton bulls = (RadioButton) machineryGroupData.findViewById(R.id.radioButton46);
        RadioButton tractor = (RadioButton) machineryGroupData.findViewById(R.id.radioButton47);
        RadioButton plow = (RadioButton) machineryGroupData.findViewById(R.id.radioButton48);
        RadioButton sprayMachine = (RadioButton) machineryGroupData.findViewById(R.id.radioButton49);
        RadioButton cultivator = (RadioButton) machineryGroupData.findViewById(R.id.radioButton50);
        RadioButton rotavator = (RadioButton) machineryGroupData.findViewById(R.id.radioButton51);
        RadioButton otherMachinery = (RadioButton) machineryGroupData.findViewById(R.id.radioButton52);
        EditText otherMachineryName = machineryGroupData.findViewById(R.id.editTextTextPersonName15);
        SeekBar machinerySeekBar1 = (SeekBar) machineryGroupData.findViewById(R.id.seekBar4);
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