package com.example.carsmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carsmobile.databinding.FragmentMainBinding


class MainFragment : Fragment() {

private  lateinit var  binding: FragmentMainBinding;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false )
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val idem1 = cars_items("BMW M3 F80", "280km/h", "2019", "https://github.com/sokka-ctrl/img/blob/main/7ccc91ab7d00d44fb557742ef0b60644-removebg-preview.png?raw=true", "Germany", "★★★☆☆")
        val idem2 = cars_items("L. Avendator LP700", "349 km/h", "2022", "https://github.com/sokka-ctrl/img/blob/main/Left_Side_View_-removebg-preview.png?raw=true" ,"Italian", "★★★★☆")
        val idem3 = cars_items("Buggati Cheron Pure Sport",  "350 km/h", "2024", "https://github.com/sokka-ctrl/img/blob/main/bugatti-11530986527paiswfdddi-removebg-preview.png?raw=true", "N.America", "★★★☆☆")
        val idem4 = cars_items("Tuatara Agressor", "331 km/h", "2021", "https://github.com/sokka-ctrl/img/blob/main/db3bc890f8c3f2533dae61547ac25ef5-removebg-preview.png?raw=true", "French", "★★★★☆")
        val idem5 = cars_items("Mc Laren P1", "350 km/h", "2012", "https://www.pngplay.com/wp-content/uploads/9/Mclaren-P1-Transparent-PNG.png", "U.Kingdom", "★★★★★")
        val idem6 = cars_items("Porsche 918 Spyder", "331 km/h", "2015", "https://github.com/sokka-ctrl/img/blob/main/c2bd57740d2eb7519490e8f8059a85a9-removebg-preview.png?raw=true", "German", "★★★★☆")
        val idem7 = cars_items("Banana", "0 km/h", "Yesterday", "https://github.com/sokka-ctrl/img/blob/main/0f0d704c067f462761171933bc8c88b4-removebg-preview.png?raw=true", "Nigeria", "★★★★★")
        val idem8 = cars_items("Aston Martin Valkyrie", "402 km/h", "2021", "https://github.com/sokka-ctrl/img/blob/main/GT915-ASTON-MARTIN-VALKYRIE-BABY-BLUE-gts-models-1-removebg-preview.png?raw=true", "U.Kingdom", "★★★★★")
        val idem9 = cars_items("Marcedes AMG One", "352 km/h", "2022", "https://github.com/sokka-ctrl/img/blob/main/B66961050_1-removebg-preview%20(1).png?raw=true", "German", "★★★★★")

        val list: ArrayList<cars_items> = ArrayList<cars_items>()
        val carAdapter = carAdapter(list)
        list.add(idem1)
        list.add(idem2)
        list.add(idem3)
        list.add(idem4)
        list.add(idem5)
        list.add(idem6)
        list.add(idem7)
        list.add(idem8)
        list.add(idem9)

        val recyclerView: RecyclerView = binding.recyclerView1
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        recyclerView.adapter = carAdapter
        recyclerView.layoutManager = linearLayoutManager
    }
}