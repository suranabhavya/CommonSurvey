package com.commonsurvey.app.CommonGroup.Model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class GeneralInfoGroup extends Step<GeneralInfoGroup.GeneralInfoGroupData> {

    public class GeneralInfoGroupData {
        String farmer_id;
        String farmer_name;
        String plot_status;
        String crop;
        String plot_pic;
        String plot_gps_loc;
        String plot_photo_rows;

        public void setFarmer_id(String farmer_id) {
            this.farmer_id = farmer_id;
        }

        public void setFarmer_name(String farmer_name) {
            this.farmer_name = farmer_name;
        }

        public void setPlot_status(String plot_status) {
            this.plot_status = plot_status;
        }

        public void setCrop(String crop) {
            this.crop = crop;
        }

        public void setPlot_pic(String plot_pic) {
            this.plot_pic = plot_pic;
        }

        public void setPlot_gps_loc(String plot_gps_loc) {
            this.plot_gps_loc = plot_gps_loc;
        }

        public void setPlot_photo_rows(String plot_photo_rows) {
            this.plot_photo_rows = plot_photo_rows;
        }
    }

    protected GeneralInfoGroup(String title) {
        super(title);
    }

    @Override
    public GeneralInfoGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(GeneralInfoGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(GeneralInfoGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View generalInfoGroup = inflater.inflate(R.layout.activity_general_info_group, null, false);
        EditText farmer_id = generalInfoGroup.findViewById(R.id.editTextTextPersonName14);
        EditText farmer_name = generalInfoGroup.findViewById(R.id.editTextTextPersonName21);
        RadioGroup radioGroup1 = (RadioGroup) generalInfoGroup.findViewById(R.id.rg17);
        RadioGroup radioGroup2 = (RadioGroup) generalInfoGroup.findViewById(R.id.rg18);
        GeneralInfoGroupData generalInfoGroupData = new GeneralInfoGroupData();

        farmer_id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalInfoGroupData.setFarmer_id(s.toString());
            }
        });

        farmer_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalInfoGroupData.setFarmer_name(s.toString());
            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                generalInfoGroupData.setPlot_status(checked.getText().toString());
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                generalInfoGroupData.setCrop(checked.getText().toString());
            }
        });

        return generalInfoGroup;
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