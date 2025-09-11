package com.example.carsmobile

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carsmobile.databinding.FragmentMainBinding

class MainFragment : Fragment() {

private  lateinit var  binding: FragmentMainBinding;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?, ) {
        super.onViewCreated(view, savedInstanceState)
        val idem1 = CarsModel("BMW M3 F80", "280km/h", "2019", "https://github.com/sokka-ctrl/img/blob/main/7ccc91ab7d00d44fb557742ef0b60644-removebg-preview.png?raw=true", "Germany", "★★★☆☆", "best change")
        val idem2 = CarsModel("L. Avendator LP700", "349 km/h", "2022", "https://github.com/sokka-ctrl/img/blob/main/Left_Side_View_-removebg-preview.png?raw=true" ,"Italian", "★★★★☆", "best speed")
        val idem3 = CarsModel("Buggati Cheron Pure Sport",  "350 km/h", "2024", "https://github.com/sokka-ctrl/img/blob/main/bugatti-11530986527paiswfdddi-removebg-preview.png?raw=true", "N.America", "★★★☆☆", "best price")
        val idem4 = CarsModel("Tuatara Agressor", "331 km/h", "2021", "https://github.com/sokka-ctrl/img/blob/main/db3bc890f8c3f2533dae61547ac25ef5-removebg-preview.png?raw=true", "French", "★★★★☆", "best driver")
        val idem5 = CarsModel("Mc Laren P1", "350 km/h", "2012", "https://www.pngplay.com/wp-content/uploads/9/Mclaren-P1-Transparent-PNG.png", "U.Kingdom", "★★★★★", "best engine")
        val idem6 = CarsModel("Porsche 918 Spyder", "331 km/h", "2015", "https://github.com/sokka-ctrl/img/blob/main/c2bd57740d2eb7519490e8f8059a85a9-removebg-preview.png?raw=true", "German", "★★★★☆", "best mirror")
        val idem7 = CarsModel("Banana", "0 km/h", "Yesterday", "https://github.com/sokka-ctrl/img/blob/main/0f0d704c067f462761171933bc8c88b4-removebg-preview.png?raw=true", "Nigeria", "★★★★★", "best col")
        val idem8 = CarsModel("Aston Martin Valkyrie", "402 km/h", "2021", "https://github.com/sokka-ctrl/img/blob/main/GT915-ASTON-MARTIN-VALKYRIE-BABY-BLUE-gts-models-1-removebg-preview.png?raw=true", "U.Kingdom", "★★★★★", "best number")
        val idem9 = CarsModel("Marcedes AMG One", "352 km/h", "2022", "https://github.com/sokka-ctrl/img/blob/main/B66961050_1-removebg-preview%20(1).png?raw=true", "German", "★★★★★", "end best")

        val listCar: ArrayList<CarsModel> = ArrayList<CarsModel>()

        listCar.add(idem1)
        listCar.add(idem2)
        listCar.add(idem3)
        listCar.add(idem4)
        listCar.add(idem5)
        listCar.add(idem6)
        listCar.add(idem7)
        listCar.add(idem8)
        listCar.add(idem9)
        val carAdapter = CarAdapter(listCar, ::onClick)

        val recyclerView: RecyclerView = binding.recyclerView1
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        recyclerView.adapter = carAdapter
        recyclerView.layoutManager = linearLayoutManager
    }
    fun onClick(carsModel: CarsModel){
        val action = MainFragmentDirections.actionMainFragmentToDetailCar(carsModel)
        Log.d("ololo", "onClick: ")
        findNavController().navigate(action)
    }
}