package com.cowok.hijrah.chapter6topic5.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cowok.hijrah.chapter6topic5.databinding.ItemMakeupBinding
import com.cowok.hijrah.chapter6topic5.model.ResponseDataMakeupItem

class MakeupAdapter(var listMakeup : List<ResponseDataMakeupItem>): RecyclerView.Adapter<MakeupAdapter.ViewHolder>() {

//    var onDelete : ((ResponseDataMakeupItem)->Unit)? = null
//    var onDetail : ((ResponseDataMakeupItem)->Unit)? = null

    class ViewHolder(var binding : ItemMakeupBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakeupAdapter.ViewHolder {
        var view = ItemMakeupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakeupAdapter.ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.binding.nameMakeup.text = listMakeup!![position].name
        holder.binding.brandMakeup.text = listMakeup!![position].brand
        holder.binding.priceMakeup.text = listMakeup!![position].price.toString()
        Glide.with(holder.itemView.context).load(listMakeup!![position].imageLink).into(holder.binding.imgMakeup)
    }

    override fun getItemCount(): Int {
        return listMakeup.size
    }
}