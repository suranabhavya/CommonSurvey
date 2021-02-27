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
        TextView textView1 = machineryGroupData.findViewById((R.id.textView17));
        RadioGroup machineryRadioGroup2 = (RadioGroup) machineryGroupData.findViewById(R.id.rg9);
        EditText otherMachineryName = machineryGroupData.findViewById(R.id.editTextTextPersonName15);
        EditText machineryHours = machineryGroupData.findViewById(R.id.editTextNumber7);

        machineryRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    //make the next radio button group visible
                    textView1.setVisibility(View.VISIBLE);
                    machineryRadioGroup2.setVisibility(View.VISIBLE);
                    machineryRadioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherMachineryName.setVisibility(View.VISIBLE);
                            }
                            machineryHours.setVisibility(View.VISIBLE);
                        }
                    });
                }else{

                }
            }
        });

        return machineryGroupData;
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