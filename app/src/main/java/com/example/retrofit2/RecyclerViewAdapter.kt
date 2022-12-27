package com.example.retrofit2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row_list.view.*

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var userList = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row_list,parent,false)
        return MyViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tvName = view.tvName
        val tvEmail = view.tvEmail
        val tvStatus = view.tvStatus

        fun bind(data: User) {
            tvName.text = data.name
            tvEmail.text = data.email
            tvStatus.text = data.status
        }
    }
}