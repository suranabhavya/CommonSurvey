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
        EditText herbicideNum = herbicideGroupData.findViewById(R.id.editTextNumber4);
        TextView textView2 = herbicideGroupData.findViewById(R.id.textView14);
        RadioGroup herbicideRadioGroup2 = (RadioGroup) herbicideGroupData.findViewById(R.id.rg6);
        EditText otherHerbicideName = herbicideGroupData.findViewById(R.id.editTextTextPersonName11);
        TextView textView3 = herbicideGroupData.findViewById(R.id.textView15);
        RadioGroup herbicideRadioGroup3 = (RadioGroup) herbicideGroupData.findViewById(R.id.rg7);
        EditText otherHerbicideUnit = herbicideGroupData.findViewById(R.id.editTextTextPersonName12);
        EditText herbicideBagVolume = herbicideGroupData.findViewById(R.id.editTextNumber5);
        EditText noOfHerbicideBag = herbicideGroupData.findViewById(R.id.editTextNumber6);

        herbicideRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    //make the next radio button group visible
                    herbicideNum.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    herbicideRadioGroup2.setVisibility(View.VISIBLE);
                    herbicideRadioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherHerbicideName.setVisibility(View.VISIBLE);
                            }
                            textView3.setVisibility(View.VISIBLE);
                            herbicideRadioGroup3.setVisibility(View.VISIBLE);
                            herbicideRadioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                    RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                    String checkedString = checked.getText().toString();

                                    if(checkedString.equals("Other")) {
                                        otherHerbicideUnit.setVisibility(View.VISIBLE);
                                    }
                                    herbicideBagVolume.setVisibility(View.VISIBLE);
                                    noOfHerbicideBag.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                    });
                }else{

                }
            }
        });

        return herbicideGroupData;
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