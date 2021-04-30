package com.commonsurvey.app.CommonGroup.Model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class WheatGroup extends Step<WheatGroup.WheatGroupData> {

    public class WheatGroupData {
        String wheat_plant_height;
        String wheat_num_leafs;
        String wheat_num_stalks;
        String wheat_num_spikes;

        public void setWheat_plant_height(String wheat_plant_height) {
            this.wheat_plant_height = wheat_plant_height;
        }

        public void setWheat_num_leafs(String wheat_num_leafs) {
            this.wheat_num_leafs = wheat_num_leafs;
        }

        public void setWheat_num_stalks(String wheat_num_stalks) {
            this.wheat_num_stalks = wheat_num_stalks;
        }

        public void setWheat_num_spikes(String wheat_num_spikes) {
            this.wheat_num_spikes = wheat_num_spikes;
        }
    }

    protected WheatGroup(String title) {
        super(title);
    }

    @Override
    public WheatGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(WheatGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(WheatGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View wheatGroup = inflater.inflate(R.layout.activity_wheat_group, null, false);
        EditText wheat_plant_height = wheatGroup.findViewById(R.id.editTextTextPersonName25);
        EditText wheat_num_leafs = wheatGroup.findViewById(R.id.editTextTextPersonName26);
        EditText wheat_num_stalks = wheatGroup.findViewById(R.id.editTextTextPersonName27);
        EditText wheat_num_spikes = wheatGroup.findViewById(R.id.editTextTextPersonName28);

        WheatGroupData wheatGroupData = new WheatGroupData();

        wheat_plant_height.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                wheatGroupData.setWheat_plant_height(s.toString());
            }
        });

        wheat_num_leafs.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                wheatGroupData.setWheat_num_leafs(s.toString());
            }
        });

        wheat_num_stalks.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                wheatGroupData.setWheat_num_stalks(s.toString());
            }
        });

        wheat_num_spikes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                wheatGroupData.setWheat_num_spikes(s.toString());
            }
        });

        return wheatGroup;
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