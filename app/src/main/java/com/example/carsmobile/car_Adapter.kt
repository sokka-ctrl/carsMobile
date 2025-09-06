package com.example.carsmobile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.example.carsmobile.databinding.CarsWidjetsItemBinding

class car_Adapter(val list_car: MutableList<cars_items>) : RecyclerView.Adapter<car_Adapter.CarViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
return CarViewHolder(CarsWidjetsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int
    ) {
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
            binding.carModel.text =  carsItems.carModel
            binding.carType.text = carsItems.carType
            binding.carSpeed.text = carsItems.carSpeed
            binding.carCompany.text = carsItems.carCompany
            binding.StarsWidget.text = carsItems.carStars
            Glide.with(binding.carIMG).load(carsItems.imageCar).into(binding.carIMG)


        }
    }
}