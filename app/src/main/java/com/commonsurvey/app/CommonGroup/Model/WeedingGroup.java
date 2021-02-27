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
        TextView textView1 = weedingGroupData.findViewById(R.id.textView11);
        RadioGroup weedingRadioGroup2 = (RadioGroup) weedingGroupData.findViewById(R.id.rg14);
        EditText otherTechniqueName = weedingGroupData.findViewById(R.id.editTextTextPersonName10);

        weedingRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    //make the next radio button group visible
                    textView1.setVisibility(View.VISIBLE);
                    weedingRadioGroup2.setVisibility(View.VISIBLE);
                    weedingRadioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherTechniqueName.setVisibility(View.VISIBLE);
                            }
                        }
                    });
                }else{

                }
            }
        });

        return weedingGroupData;
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