package com.adrianbucayan.app.collectiontest.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adrianbucayan.app.collectiontest.Model.JsonReturn;
import com.adrianbucayan.app.collectiontest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends BaseFragment {

    private static final String TAG = WelcomeFragment.class.getSimpleName();
    private JsonReturn mJsonReturn;
    private TextView tvWelcomeName, tvCredit, tvContactNo, tvDob, tvDataBalance, tvDataExp, tvDataRenewal,
            tvDataPrimary, tvProductName, tvUnliText, tvUnliTalk, tvUnliIntText, tvUnliIntTalk, tvProductPrice;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mJsonReturn = (JsonReturn) getArguments().getSerializable("jsonReturn");

        tvWelcomeName = (TextView) view.findViewById(R.id.welcome_name_tv);
        tvWelcomeName.setText("Hi, " + mJsonReturn.getData().getAttributes().getTitle() + " " +
                mJsonReturn.getData().getAttributes().getFirstName() + " " +
                mJsonReturn.getData().getAttributes().getLastName() + "!");

        tvCredit = (TextView) view.findViewById(R.id.welcome_credit_tv);
        tvCredit.setText("Your Credit: $" + Integer.parseInt(mJsonReturn.getIncluded().get(0).getAttributes().getCredit()) / 100);

        tvContactNo = (TextView) view.findViewById(R.id.welcome_contact_no_tv);
        tvContactNo.setText("Your Contact Number: " + mJsonReturn.getData().getAttributes().getContactNumber());

        tvDob = (TextView) view.findViewById(R.id.welcome_dob_tv);
        tvDob.setText("Date of Birth: " + mJsonReturn.getData().getAttributes().getDateOfBirth());

        tvDataBalance = (TextView) view.findViewById(R.id.welcome_data_balance_tv);
        tvDataBalance.setText("Your Credit: $" + mJsonReturn.getIncluded().get(1).getAttributes().getIncludedDataBalance());

        tvDataExp = (TextView) view.findViewById(R.id.welcome_data_expiry_tv);
        tvDataExp.setText("Expiry Date: " + mJsonReturn.getIncluded().get(1).getAttributes().getExpiryDate());

        tvDataRenewal = (TextView) view.findViewById(R.id.welcome_data_renewal_tv);
        if(mJsonReturn.getIncluded().get(1).getAttributes().getAutoRenewal())
            tvDataRenewal.setText("Auto Renewal: Yes");
        else
            tvDataRenewal.setText("Auto Renewal: No");


        tvDataPrimary = (TextView) view.findViewById(R.id.welcome_data_primary_tv);
        if(mJsonReturn.getIncluded().get(1).getAttributes().getPrimarySubscription())
            tvDataPrimary.setText("Primary Subscription: Yes");
        else
            tvDataPrimary.setText("Primary Subscription: No");

        tvProductName = (TextView) view.findViewById(R.id.welcome_product_name_tv);
        tvProductName.setText("Product Name: " + mJsonReturn.getIncluded().get(2).getAttributes().getName());

        tvUnliText = (TextView) view.findViewById(R.id.welcome_product_unli_text_tv);
        if(mJsonReturn.getIncluded().get(2).getAttributes().getUnlimitedText())
            tvUnliText.setText("Unlimited Text: Yes");
        else
            tvUnliText.setText("Unlimited Text: No");

        tvUnliTalk = (TextView) view.findViewById(R.id.welcome_product_unli_talk_tv);
        if(mJsonReturn.getIncluded().get(2).getAttributes().getUnlimitedTalk())
            tvUnliTalk.setText("Unlimited Talk: Yes");
        else
            tvUnliTalk.setText("Unlimited Talk: No");

        tvUnliIntText = (TextView) view.findViewById(R.id.welcome_product_unli_international_text_tv);
        if(mJsonReturn.getIncluded().get(2).getAttributes().getUnlimitedInternationalText())
            tvUnliIntText.setText("Unlimited International Text: Yes");
        else
            tvUnliIntText.setText("Unlimited International Text: No");

        tvUnliIntTalk = (TextView) view.findViewById(R.id.welcome_product_unli_international_talk_tv);
        if(mJsonReturn.getIncluded().get(2).getAttributes().getUnlimitedInternationalTalk())
            tvUnliIntTalk.setText("Unlimited International Talk: Yes");
        else
            tvUnliIntTalk.setText("Unlimited International Talk: No");

        tvProductPrice = (TextView) view.findViewById(R.id.welcome_product_price_tv);
        tvProductPrice.setText("Price: $" + Integer.parseInt(mJsonReturn.getIncluded().get(2).getAttributes().getPrice()) / 100);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
