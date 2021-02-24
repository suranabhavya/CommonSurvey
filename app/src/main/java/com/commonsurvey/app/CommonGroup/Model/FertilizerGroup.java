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

public class FertilizerGroup extends Step<String> {
    public String strRadioGroup1;
    public int intFertilizerTypeNum;
    public String strRadioGroup2;
    public String strRadioGroup3;
    public String strRadioGroup4;
    public int intFertilizerBagVolume;
    public int intNoOfFertilizerBag;

    protected FertilizerGroup(String title) {
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
        View fertilizerGroup = inflater.inflate(R.layout.activity_fertilizer_group, null, false);
        RadioGroup radioGroup1 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg1);
        RadioButton fertilizerYes = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton);
        RadioButton fertilizerNo = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton2);
        EditText fertilizerTypeNum = fertilizerGroup.findViewById(R.id.editTextNumber);
        RadioGroup radioGroup2 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg2);
        RadioButton cowDung = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton3);
        RadioButton kaibhco = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton4);
        RadioButton tricopl = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton5);
        RadioButton otherName = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton6);
        EditText otherFertilizerName = fertilizerGroup.findViewById(R.id.editTextTextPersonName);
        RadioGroup radioGroup3 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg3);
        RadioButton broadcasting = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton7);
        RadioButton bySpraying = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton8);
        RadioButton byIrrigation = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton9);
        RadioButton otherType = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton10);
        EditText otherFertilizerType = fertilizerGroup.findViewById(R.id.editTextTextPersonName2);
        RadioGroup radioGroup4 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg4);
        RadioButton kiloGrams = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton11);
        RadioButton grams = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton12);
        RadioButton litres = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton13);
        RadioButton milliLitres = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton14);
        RadioButton otherUnit = (RadioButton) fertilizerGroup.findViewById(R.id.radioButton15);
        EditText otherFertilizerUnit = fertilizerGroup.findViewById(R.id.editTextTextPersonName3);
        EditText fertilizerBagVolume = fertilizerGroup.findViewById(R.id.editTextNumber2);
        EditText noOfFertilizerBag = fertilizerGroup.findViewById(R.id.editTextNumber3);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int idOfButtonSelected = group.getCheckedRadioButtonId();
                RadioButton radioButton = group.findViewById(idOfButtonSelected);
                strRadioGroup1 = radioButton.getText().toString();
            }
        });

        if(strRadioGroup1.equals("Yes")){
            fertilizerTypeNum.setVisibility(View.VISIBLE);
            intFertilizerTypeNum = Integer.parseInt(fertilizerTypeNum.getText().toString());
            fertilizerGroup.findViewById(R.id.textView4).setVisibility(View.VISIBLE);
            radioGroup2.setVisibility(View.VISIBLE);
            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int idOfButtonSelected = group.getCheckedRadioButtonId();
                    RadioButton radioButton = group.findViewById(idOfButtonSelected);
                    strRadioGroup2 = radioButton.getText().toString();

                    if(strRadioGroup2.equals("Other")){
                        otherFertilizerName.setVisibility(View.VISIBLE);
                        strRadioGroup2 = otherFertilizerName.getText().toString();
                    }
                }
            });
            fertilizerGroup.findViewById(R.id.textView6).setVisibility(View.VISIBLE);
            radioGroup3.setVisibility(View.VISIBLE);
            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int idOfButtonSelected = group.getCheckedRadioButtonId();
                    RadioButton radioButton = group.findViewById(idOfButtonSelected);
                    strRadioGroup3 = radioButton.getText().toString();

                    if(strRadioGroup3.equals("Other")){
                        otherFertilizerType.setVisibility(View.VISIBLE);
                        strRadioGroup3 = otherFertilizerType.getText().toString();
                    }
                }
            });
            fertilizerGroup.findViewById(R.id.textView7).setVisibility(View.VISIBLE);
            radioGroup4.setVisibility(View.VISIBLE);
            radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int idOfButtonSelected = group.getCheckedRadioButtonId();
                    RadioButton radioButton = group.findViewById(idOfButtonSelected);
                    strRadioGroup4 = radioButton.getText().toString();

                    if(strRadioGroup4.equals("Other")){
                        otherFertilizerUnit.setVisibility(View.VISIBLE);
                        strRadioGroup4 = otherFertilizerUnit.getText().toString();
                    }
                }
            });
            fertilizerBagVolume.setVisibility(View.VISIBLE);
            intFertilizerBagVolume = Integer.parseInt(fertilizerBagVolume.getText().toString());
            noOfFertilizerBag.setVisibility(View.VISIBLE);
            intNoOfFertilizerBag = Integer.parseInt(noOfFertilizerBag.getText().toString());
        }

        return fertilizerGroup;
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