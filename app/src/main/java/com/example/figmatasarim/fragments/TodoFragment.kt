package com.example.figmatasarim.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.figmatasarim.R
import com.example.figmatasarim.adapter.TodoCardAdapter
import com.example.figmatasarim.databinding.FragmentTodoBinding
import com.example.figmatasarim.model.Todo


class TodoFragment : Fragment() {

   lateinit var binding:FragmentTodoBinding
    val dataSet: MutableLiveData<List<Todo>> by lazy() {
        MutableLiveData<List<Todo>>()
    }
    var list :List<Todo> = emptyList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentTodoBinding.inflate(inflater)
       binding.buttonAddTodo.setOnClickListener {

           addTodo()
       }


        dataSet.observe(viewLifecycleOwner, Observer{


       binding.rvTodo.adapter=TodoCardAdapter(it)


        })



        return binding.root
    }


    fun addTodo()
    {


     list+=Todo(binding.editTextTodo.text.toString())
        dataSet.value=list




    }


}