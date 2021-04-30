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

public class FertilizerGroup extends Step<FertilizerGroup.FertilizerGroupData> {

    public class FertilizerGroupData{
        String fertilizer_use;
        String fertilizer_type_num;
        String fertilizer_used_name_wheat;
        String other_fertilizer_used;
        String fertilizer_used_application_method;
        String other_fertilizer_use_app;
        String fertilizer_measure_unit;
        String other_fertilizer_unit;
        String fertilizer_volume;
        String fertilizer_bags_amount;

        public void setFertilizer_use(String fertilizer_use) {
            this.fertilizer_use = fertilizer_use;
        }

        public void setFertilizer_type_num(String fertilizer_type_num) {
            this.fertilizer_type_num = fertilizer_type_num;
        }

        public void setFertilizer_used_name_wheat(String fertilizer_used_name_wheat) {
            this.fertilizer_used_name_wheat = fertilizer_used_name_wheat;
        }

        public void setOther_fertilizer_used(String other_fertilizer_used) {
            this.other_fertilizer_used = other_fertilizer_used;
        }

        public void setFertilizer_used_application_method(String fertilizer_used_application_method) {
            this.fertilizer_used_application_method = fertilizer_used_application_method;
        }

        public void setOther_fertilizer_use_app(String other_fertilizer_use_app) {
            this.other_fertilizer_use_app = other_fertilizer_use_app;
        }

        public void setFertilizer_measure_unit(String fertilizer_measure_unit) {
            this.fertilizer_measure_unit = fertilizer_measure_unit;
        }

        public void setOther_fertilizer_unit(String other_fertilizer_unit) {
            this.other_fertilizer_unit = other_fertilizer_unit;
        }

        public void setFertilizer_volume(String fertilizer_volume) {
            this.fertilizer_volume = fertilizer_volume;
        }

        public void setFertilizer_bags_amount(String fertilizer_bags_amount) {
            this.fertilizer_bags_amount = fertilizer_bags_amount;
        }
    }

    protected FertilizerGroup(String title) {
        super(title);
    }

    @Override
    public FertilizerGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(FertilizerGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(FertilizerGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View fertilizerGroup = inflater.inflate(R.layout.activity_fertilizer_group, null, false);
        RadioGroup radioGroup1 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg1);
        EditText fertilizerTypeNum = fertilizerGroup.findViewById(R.id.editTextNumber);
        TextView fertilizerName= fertilizerGroup.findViewById(R.id.textView4);
        RadioGroup radioGroup2 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg2);
        EditText otherFertilizerName = fertilizerGroup.findViewById(R.id.editTextTextPersonName);
        RadioGroup radioGroup3 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg3);
        EditText otherFertilizerType = fertilizerGroup.findViewById(R.id.editTextTextPersonName2);
        RadioGroup radioGroup4 = (RadioGroup) fertilizerGroup.findViewById(R.id.rg4);
        EditText otherFertilizerUnit = fertilizerGroup.findViewById(R.id.editTextTextPersonName3);
        EditText fertilizerBagVolume = fertilizerGroup.findViewById(R.id.editTextNumber2);
        EditText noOfFertilizerBag = fertilizerGroup.findViewById(R.id.editTextNumber3);
        TextView textView2 = fertilizerGroup.findViewById(R.id.textView6);
        TextView textView3 = fertilizerGroup.findViewById(R.id.textView7);
        FertilizerGroupData fertilizerGroupData = new FertilizerGroupData();

        fertilizerTypeNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setFertilizer_type_num(s.toString());
            }
        });

        otherFertilizerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setOther_fertilizer_used(s.toString());
            }
        });

        otherFertilizerType.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setOther_fertilizer_use_app(s.toString());
            }
        });

        otherFertilizerUnit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setOther_fertilizer_unit(s.toString());
            }
        });

        fertilizerBagVolume.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setFertilizer_volume(s.toString());
            }
        });

        noOfFertilizerBag.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fertilizerGroupData.setFertilizer_bags_amount(s.toString());
            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")){
                    fertilizerGroupData.setFertilizer_use("Yes");
                    //make the next radio button group visible
                    fertilizerTypeNum.setVisibility(View.VISIBLE);
                    fertilizerName.setVisibility(View.VISIBLE);
                    radioGroup2.setVisibility(View.VISIBLE);
                    radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                            String checkedString = checked.getText().toString();

                            if(checkedString.equals("Other")){
                                otherFertilizerName.setVisibility(View.VISIBLE);
                            }
                            else {
                                fertilizerGroupData.setFertilizer_used_name_wheat(checkedString);
                            }
                            textView2.setVisibility(View.VISIBLE);
                            radioGroup3.setVisibility(View.VISIBLE);
                            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                @Override
                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                    RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                    String checkedString = checked.getText().toString();

                                    if(checkedString.equals("Other")) {
                                        otherFertilizerType.setVisibility(View.VISIBLE);
                                    }
                                    else {
                                        fertilizerGroupData.setFertilizer_used_application_method(checkedString);
                                    }
                                    textView3.setVisibility(View.VISIBLE);
                                    radioGroup4.setVisibility(View.VISIBLE);
                                    radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                        @Override
                                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                                            RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                                            String checkedString = checked.getText().toString();
                                            if(checkedString.equals("Other")){
                                                otherFertilizerUnit.setVisibility(View.VISIBLE);
                                            }
                                            else {
                                                fertilizerGroupData.setFertilizer_measure_unit(checkedString);
                                            }
                                            fertilizerBagVolume.setVisibility(View.VISIBLE);
                                            noOfFertilizerBag.setVisibility(View.VISIBLE);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }else{
                    fertilizerGroupData.setFertilizer_use("No");
                }
            }
        });

        return fertilizerGroup;
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