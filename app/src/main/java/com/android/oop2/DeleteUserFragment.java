package com.android.oop2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DeleteUserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final FragmentDeleteUserBinding deleteUserBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_delete_user,container,false);


        deleteUserBinding.deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Customer customer = new Customer();

                if(deleteUserBinding.deleteId.getText().toString().length()>0)
                    customer.setId(Integer.parseInt(deleteUserBinding.deleteId.getText().toString()));

                HomeActivity.CustomerUserFragment.myDao().deletUser(customer);
            }
        });

        return deleteUserBinding.getRoot();
    }
}
