package com.example.carsmobile
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carsmobile.databinding.CarsWidjetsItemBinding

class CarAdapter(val list_car: ArrayList<CarsModel>, val onClick:(CarsModel) -> Unit) : RecyclerView.Adapter<CarAdapter.CarViewHolder>(){
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
    }


    override fun getItemCount(): Int {
        return list_car.size
    }

    inner class CarViewHolder(private val binding: CarsWidjetsItemBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(model: CarsModel){
            binding.tvCarModel.text =  model.carModel
            binding.tvCarType .text = model.carType
            binding.tvCarSpeed .text = model.carSpeed
            binding.tvCarCountry .text = model.carCompany
            binding.tvStarsWidget .text = model.carStars
            binding.ivCarImage.loadImage(model.imageCar)
            itemView.setOnClickListener {
                itemView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(1).withEndAction { itemView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start()}.start()
                onClick(model)
            }
        }
    }
}