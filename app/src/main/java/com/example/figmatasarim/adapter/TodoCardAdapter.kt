package com.example.figmatasarim.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmatasarim.databinding.TodoCardBinding
import com.example.figmatasarim.model.Todo

class TodoCardAdapter(var dataSet:List<Todo>): RecyclerView.Adapter<TodoCardAdapter.TodoCardViewHolder>()
{



    inner class TodoCardViewHolder(binding: TodoCardBinding): RecyclerView.ViewHolder(binding.root)
    {


        var binding=binding


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoCardViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val binding= TodoCardBinding.inflate(inflater)
        return TodoCardViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TodoCardViewHolder, position: Int)
    {
        val todos=dataSet[position]
        holder.binding.textTodo.text=todos.todo

    }

    override fun getItemCount():Int =dataSet.size
}