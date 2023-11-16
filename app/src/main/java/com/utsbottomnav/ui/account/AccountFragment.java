package com.utsbottomnav.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.utsbottomnav.R;
import com.utsbottomnav.databinding.FragmentAccountBinding;

public class AccountFragment extends Fragment {

    private FragmentAccountBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AccountViewModel accountViewModel =
                new ViewModelProvider(this).get(AccountViewModel.class);

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button loginButton = root.findViewById(R.id.btnlogin);
        loginButton.setOnClickListener(view -> {
            Toast.makeText(getContext(), "Fitur Login belum tersedia", Toast.LENGTH_SHORT).show();
        });

        Button registerButton = root.findViewById(R.id.btnregister);
        registerButton.setOnClickListener(view -> {
            Toast.makeText(getContext(), "Fitur Register belum tersedia", Toast.LENGTH_SHORT).show();
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
