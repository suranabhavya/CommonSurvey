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

public class HerbicideGroup extends Step<String> {

    protected HerbicideGroup(String title) {
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
        View herbicideGroupData = inflater.inflate(R.layout.activity_herbicide_group, null, false);
        RadioGroup herbicideRadioGroup1 = (RadioGroup) herbicideGroupData.findViewById(R.id.rg5);
        RadioButton herbicideYes = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton33);
        RadioButton herbicideNo = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton34);
        SeekBar herbicideSeekBar1 = (SeekBar) herbicideGroupData.findViewById(R.id.seekBar3);
        RadioGroup herbicideRadioGroup2 = (RadioGroup) herbicideGroupData.findViewById(R.id.rg6);
        RadioButton surakksha = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton35);
        RadioButton topik = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton36);
        RadioButton upl = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton37);
        RadioButton otherHerbicideName = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton38);
        EditText otherFertilizerName = herbicideGroupData.findViewById(R.id.editTextTextPersonName11);
        RadioGroup herbicideRadioGroup3 = (RadioGroup) herbicideGroupData.findViewById(R.id.rg7);
        RadioButton kiloGrams = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton39);
        RadioButton grams = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton40);
        RadioButton litres = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton41);
        RadioButton milliLitres = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton42);
        RadioButton otherUnit = (RadioButton) herbicideGroupData.findViewById(R.id.radioButton43);
        EditText otherHerbicideUnit = herbicideGroupData.findViewById(R.id.editTextTextPersonName12);
        EditText herbicideBagVolume = herbicideGroupData.findViewById(R.id.editTextTextPersonName13);
        EditText noOfHerbicideBag = herbicideGroupData.findViewById(R.id.editTextTextPersonName14);
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