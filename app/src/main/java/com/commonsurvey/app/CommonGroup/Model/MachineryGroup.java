package com.commonsurvey.app.CommonGroup.Model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class MachineryGroup extends Step<MachineryGroup.MachineryGroupData> {

    class MachineryGroupData{

        String machinery_yesno;
        String machinery_type;
        String other_machinery_type;
        String machinery_hours;

        public void setMachinery_yesno(String machinery_yesno) {
            this.machinery_yesno = machinery_yesno;
        }

        public void setMachinery_type(String machinery_type) {
            this.machinery_type = machinery_type;
        }

        public void setOther_machinery_type(String other_machinery_type) {
            this.other_machinery_type = other_machinery_type;
        }

        public void setMachinery_hours(String machinery_hours) {
            this.machinery_hours = machinery_hours;
        }
    }

    protected MachineryGroup(String title) {
        super(title);
    }

    @Override
    public MachineryGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(MachineryGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(MachineryGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View machineryGroup = inflater.inflate(R.layout.activity_machinery_group, null, false);
        RadioGroup machineryRadioGroup1 = (RadioGroup) machineryGroup.findViewById(R.id.rg8);
        TextView textView1 = machineryGroup.findViewById((R.id.textView17));
        RadioGroup machineryRadioGroup2 = (RadioGroup) machineryGroup.findViewById(R.id.rg9);
        EditText otherMachineryName = machineryGroup.findViewById(R.id.editTextTextPersonName15);
        EditText machineryHours = machineryGroup.findViewById(R.id.editTextNumber7);
        MachineryGroupData machineryGroupData = new MachineryGroupData();

        otherMachineryName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                machineryGroupData.setOther_machinery_type(s.toString());
            }
        });

        machineryHours.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                machineryGroupData.setMachinery_hours(s.toString());
            }
        });

        machineryRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    machineryGroupData.setMachinery_yesno("Yes");
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
                            else {
                                machineryGroupData.setMachinery_type(checkedString);
                            }
                            machineryHours.setVisibility(View.VISIBLE);
                        }
                    });
                }else{
                    machineryGroupData.setMachinery_yesno("No");
                }
            }
        });

        return machineryGroup;
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