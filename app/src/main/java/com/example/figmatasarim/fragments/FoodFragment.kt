package com.example.figmatasarim.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmatasarim.R
import com.example.figmatasarim.adapter.CategoryCardAdapter
import com.example.figmatasarim.databinding.FragmentFoodBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FoodFragment : Fragment() {
   // lazybakılacak
    lateinit var binding:FragmentFoodBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFoodBinding.inflate(inflater)

       // binding.recyclerViewCategory.adapter=CategoryCardAdapter()



        return binding.root
    }


}