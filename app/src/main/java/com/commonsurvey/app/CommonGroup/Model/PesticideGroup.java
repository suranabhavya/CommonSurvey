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

public class PesticideGroup extends Step<String> {

    protected PesticideGroup(String title) {
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
        View pesticideGroupData = inflater.inflate(R.layout.activity_pesticide_group, null, false);
        RadioGroup pesticideRadioGroup1 = (RadioGroup) pesticideGroupData.findViewById(R.id.rg10);
        RadioButton pesticideYes = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton16);
        RadioButton pesticideNo = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton17);
        SeekBar pesticideSeekBar1 = (SeekBar) pesticideGroupData.findViewById(R.id.seekBar2);
        RadioGroup pesticideRadioGroup2 = (RadioGroup) pesticideGroupData.findViewById(R.id.rg11);
        RadioButton leader = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton18);
        RadioButton pesticideSuper = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton19);
        RadioButton otherPesticide = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton20);
        EditText otherPesticideName = pesticideGroupData.findViewById(R.id.editTextTextPersonName6);
        RadioGroup pesticideRadioGroup3 = (RadioGroup) pesticideGroupData.findViewById(R.id.rg12);
        RadioButton kiloGrams = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton21);
        RadioButton grams = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton22);
        RadioButton litres = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton23);
        RadioButton milliLitres = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton24);
        RadioButton otherUnit = (RadioButton) pesticideGroupData.findViewById(R.id.radioButton25);
        EditText otherPesticideUnit = pesticideGroupData.findViewById(R.id.editTextTextPersonName7);
        EditText pesticideBottleVolume = pesticideGroupData.findViewById(R.id.editTextTextPersonName8);
        EditText noOfPesticideBottle = pesticideGroupData.findViewById(R.id.editTextTextPersonName9);
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