package com.android.oop2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class ReadUserFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentReadUserBinding fragmentReadUserBinding = DataBindingUti.inflate(inflater, R.layout.fragment_read_user, container, false);

        List<Customer> customers = HomeActivity.CustomerRoomDatabase.myDao().getUsers();

        String info = "";

        for(Customer customer: customers){

            Integer id = customer.getId();

            String name = customer.getNama();

            String email = customer.getEmail();

            info = info +"id : "+ id+"\n"+ "name : " + name+" \n";
        }

        fragmentReadUserBinding.userDetails.setText(info);

        return fragmentReadUserBinding.getRoot();
    }
}
