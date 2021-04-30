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

public class PesticideGroup extends Step<PesticideGroup.PesticideGroupData> {

    class PesticideGroupData {

        String pesticide_use;
        String pesticide_types_num;
        String pesticide_used_name_wheat;
        String other_pesticide_used;
        String pesticide_units;
        String other_pesticide_unit;
        String pesticide_volume;
        String pesticide_bottle_amount;

        public void setPesticide_use(String pesticide_use) {
            this.pesticide_use = pesticide_use;
        }

        public void setPesticide_types_num(String pesticide_types_num) {
            this.pesticide_types_num = pesticide_types_num;
        }

        public void setPesticide_used_name_wheat(String pesticide_used_name_wheat) {
            this.pesticide_used_name_wheat = pesticide_used_name_wheat;
        }

        public void setOther_pesticide_used(String other_pesticide_used) {
            this.other_pesticide_used = other_pesticide_used;
        }

        public void setPesticide_units(String pesticide_units) {
            this.pesticide_units = pesticide_units;
        }

        public void setOther_pesticide_unit(String other_pesticide_unit) {
            this.other_pesticide_unit = other_pesticide_unit;
        }

        public void setPesticide_volume(String pesticide_volume) {
            this.pesticide_volume = pesticide_volume;
        }

        public void setPesticide_bottle_amount(String pesticide_bottle_amount) {
            this.pesticide_bottle_amount = pesticide_bottle_amount;
        }
    }

    protected PesticideGroup(String title) {
        super(title);
    }

    @Override
    public PesticideGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(PesticideGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(PesticideGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View pesticideGroup = inflater.inflate(R.layout.activity_pesticide_group, null, false);
        RadioGroup pesticideRadioGroup1 = (RadioGroup) pesticideGroup.findViewById(R.id.rg10);
        EditText numPesticidesType = pesticideGroup.findViewById(R.id.editTextNumber8);
        TextView textView1 = pesticideGroup.findViewById(R.id.textView8);
        RadioGroup pesticideRadioGroup2 = (RadioGroup) pesticideGroup.findViewById(R.id.rg11);
        EditText otherPesticideName = pesticideGroup.findViewById(R.id.editTextTextPersonName6);
        TextView textView2 = pesticideGroup.findViewById(R.id.textView9);
        RadioGroup pesticideRadioGroup3 = (RadioGroup) pesticideGroup.findViewById(R.id.rg12);
        EditText otherPesticideUnit = pesticideGroup.findViewById(R.id.editTextTextPersonName7);
        EditText pesticideBottleVolume = pesticideGroup.findViewById(R.id.editTextNumber9);
        EditText noOfPesticideBottle = pesticideGroup.findViewById(R.id.editTextNumber10);
        PesticideGroupData pesticideGroupData = new PesticideGroupData();

        numPesticidesType.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                pesticideGroupData.setPesticide_types_num(s.toString());
            }
        });

        otherPesticideName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                pesticideGroupData.setOther_pesticide_used(s.toString());
            }
        });

        otherPesticideUnit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                pesticideGroupData.setOther_pesticide_unit(s.toString());
            }
        });

        pesticideBottleVolume.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                pesticideGroupData.setPesticide_volume(s.toString());
            }
        });

        noOfPesticideBottle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                pesticideGroupData.setPesticide_bottle_amount(s.toString());
            }
        });

        pesticideRadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    pesticideGroupData.setPesticide_use("Yes");
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
                            else {
                                pesticideGroupData.setPesticide_used_name_wheat(checkedString);
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
                                    else {
                                        pesticideGroupData.setPesticide_units(checkedString);
                                    }
                                    pesticideBottleVolume.setVisibility(View.VISIBLE);
                                    noOfPesticideBottle.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                    });
                }else{
                    pesticideGroupData.setPesticide_use("No");
                }
            }
        });

        return pesticideGroup;
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