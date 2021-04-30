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

public class PlotGroup extends Step<FarmerProfileGroup.FarmerProfileGroupData> {

    public class PlotGroupData {
        String size;
        String current_status;

        public void setSize(String size) {
            this.size = size;
        }

        public void setCurrent_status(String current_status) {
            this.current_status = current_status;
        }
    }

    protected PlotGroup(String title) {
        super(title);
    }

    @Override
    public FarmerProfileGroup.FarmerProfileGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(FarmerProfileGroup.FarmerProfileGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(FarmerProfileGroup.FarmerProfileGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View plotGroup = inflater.inflate(R.layout.activity_plot_group, null, false);
        EditText size = plotGroup.findViewById(R.id.editTextTextPersonName33);
        RadioGroup current_status = (RadioGroup) plotGroup.findViewById(R.id.rg19);
        PlotGroup.PlotGroupData plotGroupData = new PlotGroup.PlotGroupData();

        size.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                plotGroupData.setSize(s.toString());
            }
        });

        current_status.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();
                plotGroupData.setCurrent_status(checkedString);
            }
        });

        return plotGroup;
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