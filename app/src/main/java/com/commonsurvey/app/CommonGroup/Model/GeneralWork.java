package com.commonsurvey.app.CommonGroup.Model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class GeneralWork extends Step<GeneralWork.GeneralWorkData> {

    class GeneralWorkData{

        String general_work_kind;
        String hh_work_days;
        String labor_work_days;
        String labors_num;
        String paid_labor_cost;

        public void setGeneral_work_kind(String general_work_kind) {
            this.general_work_kind = general_work_kind;
        }

        public void setHh_work_days(String hh_work_days) {
            this.hh_work_days = hh_work_days;
        }

        public void setLabor_work_days(String labor_work_days) {
            this.labor_work_days = labor_work_days;
        }

        public void setLabors_num(String labors_num) {
            this.labors_num = labors_num;
        }

        public void setPaid_labor_cost(String paid_labor_cost) {
            this.paid_labor_cost = paid_labor_cost;
        }
    }

    protected GeneralWork(String title) {
        super(title);
    }

    @Override
    public GeneralWorkData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(GeneralWorkData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(GeneralWorkData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View generalWork = inflater.inflate(R.layout.activity_general_work, null, false);
        EditText otherWork = generalWork.findViewById(R.id.editTextTextPersonName16);
        EditText hhWork = generalWork.findViewById(R.id.editTextTextPersonName17);
        EditText laborWorkDays = generalWork.findViewById(R.id.editTextTextPersonName18);
        EditText noOfLaborWork = generalWork.findViewById(R.id.editTextTextPersonName19);
        EditText costLabor = generalWork.findViewById(R.id.editTextTextPersonName20);
        GeneralWorkData generalWorkData = new GeneralWorkData();

        otherWork.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalWorkData.setGeneral_work_kind(s.toString());
            }
        });

        hhWork.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalWorkData.setHh_work_days(s.toString());
            }
        });

        laborWorkDays.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalWorkData.setLabor_work_days(s.toString());
            }
        });

        noOfLaborWork.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalWorkData.setLabors_num(s.toString());
            }
        });

        costLabor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                generalWorkData.setPaid_labor_cost(s.toString());
            }
        });

        return generalWork;
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