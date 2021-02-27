package com.commonsurvey.app.CommonGroup.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class FertilizerGroup extends Step<String> {

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
        EditText fertilizerTypeNum = fertilizerGroup.findViewById(R.id.editTextNumber);
        TextView fertilizerName= fertilizerGroup.findViewById(R.id.textView4);
        RadioGroup radioGroup2 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg2);
        EditText otherFertilizerName = fertilizerGroup.findViewById(R.id.editTextTextPersonName);
        RadioGroup radioGroup3 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg3);
        EditText otherFertilizerType = fertilizerGroup.findViewById(R.id.editTextTextPersonName2);
        RadioGroup radioGroup4 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg4);
        EditText otherFertilizerUnit = fertilizerGroup.findViewById(R.id.editTextTextPersonName3);
        EditText fertilizerBagVolume = fertilizerGroup.findViewById(R.id.editTextNumber2);
        EditText noOfFertilizerBag = fertilizerGroup.findViewById(R.id.editTextNumber3);
        TextView textView2 = fertilizerGroup.findViewById(R.id.textView6);
        TextView textView3 = fertilizerGroup.findViewById(R.id.textView7);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    //make the next radio button group visible
                    fertilizerTypeNum.setVisibility(View.VISIBLE);
                    fertilizerName.setVisibility(View.VISIBLE);
                    radioGroup2.setVisibility(View.VISIBLE);
                    radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherFertilizerName.setVisibility(View.VISIBLE);
                            }
                            textView2.setVisibility(View.VISIBLE);
                            radioGroup3.setVisibility(View.VISIBLE);
                            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                    RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                    String checkedString = checked.getText().toString();

                                    if(checkedString.equals("Other")) {
                                        otherFertilizerType.setVisibility(View.VISIBLE);
                                    }
                                    textView3.setVisibility(View.VISIBLE);
                                    radioGroup4.setVisibility(View.VISIBLE);
                                    radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                        @Override
                                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                            String checkedString = checked.getText().toString();
                                            if(checkedString.equals("Other")){
                                                otherFertilizerUnit.setVisibility(View.VISIBLE);
                                            }
                                            fertilizerBagVolume.setVisibility(View.VISIBLE);
                                            noOfFertilizerBag.setVisibility(View.VISIBLE);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }else{

                }
            }
        });

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