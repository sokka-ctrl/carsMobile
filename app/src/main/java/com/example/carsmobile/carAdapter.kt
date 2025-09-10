package com.example.carsmobile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carsmobile.databinding.CarsWidjetsItemBinding

class carAdapter(val list_car: MutableList<cars_items>) : RecyclerView.Adapter<carAdapter.CarViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
return CarViewHolder(CarsWidjetsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int
    ){
    holder.onBind(list_car[position])
        holder.itemView.setOnClickListener {
            view ->
            view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100).withEndAction { view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start()}.start()
        }
    }

    override fun getItemCount(): Int {
        return list_car.size
    }

    class CarViewHolder(private val binding: CarsWidjetsItemBinding): RecyclerView.ViewHolder(binding.root){

        fun onBind(carsItems: cars_items){
            binding.tvCarModel.text =  carsItems.carModel
            binding.tvCarType .text = carsItems.carType
            binding.tvCarSpeed .text = carsItems.carSpeed
            binding.tvCarCountry .text = carsItems.carCompany
            binding.tvStarsWidget .text = carsItems.carStars
            Glide.with(binding.ivCarImage).load(carsItems.imageCar).into(binding.ivCarImage)
        }
    }
}