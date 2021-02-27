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
        EditText numPesticidesType = pesticideGroupData.findViewById(R.id.editTextNumber8);
        TextView textView1 = pesticideGroupData.findViewById(R.id.textView8);
        RadioGroup pesticideRadioGroup2 = (RadioGroup) pesticideGroupData.findViewById(R.id.rg11);
        EditText otherPesticideName = pesticideGroupData.findViewById(R.id.editTextTextPersonName6);
        TextView textView2 = pesticideGroupData.findViewById(R.id.textView9);
        RadioGroup pesticideRadioGroup3 = (RadioGroup) pesticideGroupData.findViewById(R.id.rg12);
        EditText otherPesticideUnit = pesticideGroupData.findViewById(R.id.editTextTextPersonName7);
        EditText pesticideBottleVolume = pesticideGroupData.findViewById(R.id.editTextNumber9);
        EditText noOfPesticideBottle = pesticideGroupData.findViewById(R.id.editTextNumber10);

        pesticideRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    //make the next radio button group visible
                    numPesticidesType.setVisibility(View.VISIBLE);
                    textView1.setVisibility(View.VISIBLE);
                    pesticideRadioGroup2.setVisibility(View.VISIBLE);
                    pesticideRadioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherPesticideName.setVisibility(View.VISIBLE);
                            }
                            textView2.setVisibility(View.VISIBLE);
                            pesticideRadioGroup3.setVisibility(View.VISIBLE);
                            pesticideRadioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                    RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                    String checkedString = checked.getText().toString();

                                    if(checkedString.equals("Other")) {
                                        otherPesticideUnit.setVisibility(View.VISIBLE);
                                    }
                                    pesticideBottleVolume.setVisibility(View.VISIBLE);
                                    noOfPesticideBottle.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                    });
                }else{

                }
            }
        });

        return pesticideGroupData;
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