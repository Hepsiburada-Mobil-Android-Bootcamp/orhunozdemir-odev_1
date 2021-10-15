package com.example.figmatasarim.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.figmatasarim.databinding.FoodCategoryCardItemBinding
import com.example.figmatasarim.model.Category
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
import com.example.figmatasarim.R


class CategoryCardAdapter():RecyclerView.Adapter<CategoryCardAdapter.CardViewHolder>()
{

   val dataSet= listOf<Category>(Category(R.drawable.food_1,"All","","#FFFFFFFF"),
       Category(R.drawable.pizza,"Pizza","#F8F8FA","#6E80B0"),
       Category(R.drawable.beverages,"Beverages","#F8F8FA","#6E80B0"),
       Category(R.drawable.asian,"Asian","#F8F8FA","#6E80B0"))

    inner class CardViewHolder(binding: FoodCategoryCardItemBinding):RecyclerView.ViewHolder(binding.root)
    {


    var binding=binding


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
       val inflater=LayoutInflater.from(parent.context)
        val binding=FoodCategoryCardItemBinding.inflate(inflater)
        return CardViewHolder(binding)

    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
      val category=dataSet[position]

        //holder.binding.cardView.background.setTint(R.color.black)
        //holder.binding.cardView.background.setTint(R.color.black)
        holder.binding.imageViewFoodIcon.setImageResource(category.imageres)
        //holder.binding.imageViewFoodIcon.foreground.setTint()
        holder.binding.textViewFoodTittle.text=category.title



    }

    override fun getItemCount():Int =dataSet.size
}