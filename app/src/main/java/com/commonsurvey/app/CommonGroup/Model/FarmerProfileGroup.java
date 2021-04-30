package com.commonsurvey.app.CommonGroup.Model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.commonsurvey.app.R;

import ernestoyaquello.com.verticalstepperform.Step;

public class FarmerProfileGroup extends Step<FarmerProfileGroup.FarmerProfileGroupData> {

    public class FarmerProfileGroupData {

        String farmer_name;
        String state;
        String district_punjab;
        String district_kerala;
        String district_ap;
        String mandal;
        String village;
        String phone;
        String biometric;
        String biometric_num;
        String hh_partof;
        String hh_shg;
        String hh_bpl;
        String hh_farmers;
        String acres_owned;
        String acres_leased;
        String additional_comments_q;

        public void setFarmer_name(String farmer_name) {
            this.farmer_name = farmer_name;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setDistrict_punjab(String district_punjab) {
            this.district_punjab = district_punjab;
        }

        public void setDistrict_kerala(String district_kerala) {
            this.district_kerala = district_kerala;
        }

        public void setDistrict_ap(String district_ap) {
            this.district_ap = district_ap;
        }

        public void setMandal(String mandal) {
            this.mandal = mandal;
        }

        public void setVillage(String village) {
            this.village = village;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setBiometric(String biometric) {
            this.biometric = biometric;
        }

        public void setBiometric_num(String biometric_num) {
            this.biometric_num = biometric_num;
        }

        public void setHh_partof(String hh_partof) {
            this.hh_partof = hh_partof;
        }

        public void setHh_shg(String hh_shg) {
            this.hh_shg = hh_shg;
        }

        public void setHh_bpl(String hh_bpl) {
            this.hh_bpl = hh_bpl;
        }

        public void setHh_farmers(String hh_farmers) {
            this.hh_farmers = hh_farmers;
        }

        public void setAcres_owned(String acres_owned) {
            this.acres_owned = acres_owned;
        }

        public void setAcres_leased(String acres_leased) {
            this.acres_leased = acres_leased;
        }

        public void setAdditional_comments_q(String additional_comments_q) {
            this.additional_comments_q = additional_comments_q;
        }
    }

    protected FarmerProfileGroup(String title) {
        super(title);
    }

    @Override
    public FarmerProfileGroupData getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    public void restoreStepData(FarmerProfileGroupData data) {

    }

    @Override
    protected IsDataValid isStepDataValid(FarmerProfileGroupData stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View farmerProfileGroup = inflater.inflate(R.layout.activity_farmer_profile_group, null, false);
        EditText farmer_name = farmerProfileGroup.findViewById(R.id.editTextTextPersonName4);
        Spinner state = (Spinner) farmerProfileGroup.findViewById(R.id.spinner);
        Spinner district_punjab = (Spinner) farmerProfileGroup.findViewById(R.id.spinner2);
        Spinner district_kerala = (Spinner) farmerProfileGroup.findViewById(R.id.spinner3);
        Spinner district_ap = (Spinner) farmerProfileGroup.findViewById(R.id.spinner4);
        EditText mandal = farmerProfileGroup.findViewById(R.id.editTextTextPersonName5);
        EditText village = farmerProfileGroup.findViewById(R.id.editTextTextPersonName8);
        EditText phone = farmerProfileGroup.findViewById(R.id.editTextPhone);
        RadioGroup biometric = (RadioGroup) farmerProfileGroup.findViewById(R.id.rg15);
        EditText biometric_num = farmerProfileGroup.findViewById(R.id.editTextNumber11);
        EditText hh_partof = farmerProfileGroup.findViewById(R.id.editTextNumber12);
        EditText hh_shg = farmerProfileGroup.findViewById(R.id.editTextTextPersonName9);
        RadioGroup hh_bpl = (RadioGroup) farmerProfileGroup.findViewById(R.id.rg16);
        EditText hh_farmers = farmerProfileGroup.findViewById(R.id.editTextNumber13);
        EditText acres_owned = farmerProfileGroup.findViewById(R.id.editTextNumber14);
        EditText acres_lease = farmerProfileGroup.findViewById(R.id.editTextNumber15);
        EditText additional_comments_q = farmerProfileGroup.findViewById(R.id.editTextTextPersonName13);
        FarmerProfileGroup.FarmerProfileGroupData farmerProfileGroupData = new FarmerProfileGroup.FarmerProfileGroupData();

        farmer_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setFarmer_name(s.toString());
            }
        });

        mandal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setMandal(s.toString());
            }
        });

        village.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setVillage(s.toString());
            }
        });

        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setPhone(s.toString());
            }
        });

        biometric_num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setBiometric_num(s.toString());
            }
        });

        hh_partof.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setHh_partof(s.toString());
            }
        });

        hh_shg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setHh_shg(s.toString());
            }
        });

        hh_farmers.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setHh_farmers(s.toString());
            }
        });

        acres_owned.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setAcres_owned(s.toString());
            }
        });

        acres_lease.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setAcres_leased(s.toString());
            }
        });

        additional_comments_q.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                farmerProfileGroupData.setAdditional_comments_q(s.toString());
            }
        });

        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
//                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
                if(text.equals("Punjab")) {
                    farmerProfileGroupData.setState(text);
                    district_punjab.setVisibility(View.VISIBLE);
                    district_punjab.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String text1 = parent.getItemAtPosition(position).toString();
//                            Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();
                            farmerProfileGroupData.setDistrict_punjab(text1);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if(text.equals("Kerala")) {
                    farmerProfileGroupData.setState(text);
                    district_kerala.setVisibility(View.VISIBLE);
                    district_kerala.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String text1 = parent.getItemAtPosition(position).toString();
//                            Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();
                            farmerProfileGroupData.setDistrict_kerala(text1);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if(text.equals("Andhra Pradesh")) {
                    farmerProfileGroupData.setState(text);
                    district_ap.setVisibility(View.VISIBLE);
                    district_ap.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String text1 = parent.getItemAtPosition(position).toString();
//                            Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();
                            farmerProfileGroupData.setDistrict_ap(text1);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        biometric.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();

                if(checkedString.equals("Yes")) {
                    farmerProfileGroupData.setBiometric(checkedString);
                    biometric_num.setVisibility(View.VISIBLE);
                }
                else {
                    farmerProfileGroupData.setBiometric(checkedString);
                }
            }
        });

        hh_bpl.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked = group.findViewById(group.getCheckedRadioButtonId());
                String checkedString = checked.getText().toString();
                farmerProfileGroupData.setHh_bpl(checkedString);
            }
        });

        return farmerProfileGroup;
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