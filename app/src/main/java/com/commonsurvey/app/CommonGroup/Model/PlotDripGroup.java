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

public class PlotDripGroup extends Step<PlotDripGroup.PlotDripGroupData> {

    public class PlotDripGroupData {
        String drips_exp;
        String drips_type;
        String other_drips_type;

        public void setDrips_exp(String drips_exp) {
            this.drips_exp = drips_exp;
        }

        public void setDrips_type(String drips_type) {
            this.drips_type = drips_type;
        }

        public void setOther_drips_type(String other_drips_type) {
            this.other_drips_type = other_drips_type;
        }
    }

    protected PlotDripGroup(String title) {
        super(title);
    }

    @Override
    public PlotDripGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(PlotDripGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(PlotDripGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View plotDripGroup = inflater.inflate(R.layout.activity_plot_drip_group, null, false);
        EditText drips_exp = plotDripGroup.findViewById(R.id.editTextTextPersonName35);
        RadioGroup drips_type = (RadioGroup) plotDripGroup.findViewById(R.id.rg21);
        EditText other_drips_type = plotDripGroup.findViewById(R.id.editTextTextPersonName36);
        PlotDripGroup.PlotDripGroupData plotDripGroupData = new PlotDripGroup.PlotDripGroupData();

        drips_exp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                plotDripGroupData.setDrips_exp(s.toString());
            }
        });

        other_drips_type.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                plotDripGroupData.setOther_drips_type(s.toString());
            }
        });

        drips_type.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();
                plotDripGroupData.setDrips_type(checkedString);
            }
        });

        return plotDripGroup;
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