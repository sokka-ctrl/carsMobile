package com.example.carsmobile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.carsmobile.databinding.FragmentDetailCarBinding
class DetailCar : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private lateinit var binding: FragmentDetailCarBinding
    private val CarsModel: DetailCarArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val model: CarsModel? = CarsModel.model
        if(model != null){
            binding.tvCarDetailSpeed .text = model.carSpeed
            binding.tvCarDetailModel .text = model.carModel
            binding.tvCarDeteilYear.text = model.carType
            binding.tvCarDetailStars.text = model.carStars
            binding.ivCarDetailImage.loadImage(model.imageCar)
            binding.tvDesc.text = model.carDesk
        }
    }
}