/*
 * Copyright (C) 2015 takahirom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.kogitune.prelollipoptransition.support_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kogitune.activity_transition.fragment.FragmentTransitionLauncher;
import com.kogitune.prelollipoptransition.R;

public class SupportStartFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.support_fragment_start, container, false);
        v.findViewById(R.id.support_fragment_start_imageview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final SupportEndFragment toFragment = new SupportEndFragment();
                FragmentTransitionLauncher
                        .with(view.getContext())
                        .from(view.findViewById(R.id.support_fragment_start_imageview))
                        .prepare(toFragment);
                getFragmentManager().beginTransaction().replace(R.id.support_content, toFragment).addToBackStack(null).commit();
            }
        });
        return v;
    }
}
