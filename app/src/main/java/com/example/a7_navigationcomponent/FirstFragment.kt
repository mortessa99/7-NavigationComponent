package com.example.a7_navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.*
import com.example.a7_navigationcomponent.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGo.setOnClickListener {
            //1-You should Know :
                //Navigation.findNavController(it).navigate(...) == it.findNavController().navigate(...)



            //2-Navigate without value
                //Navigation.findNavController(it).navigate(R.id.secondFragment) //  or down
               // Navigation.findNavController(it).navigate(R.id.action_first_to_second)





            //3-Navigation with one value
                var name = bundleOf("firstName" to binding.edtName.text.toString())
                it.findNavController().navigate(R.id.secondFragment,name)




            //Navigation with more values
                var family = bundleOf("family" to binding.edtFamily.text.toString())
                //it.findNavController().navigate()

        }
    }


}