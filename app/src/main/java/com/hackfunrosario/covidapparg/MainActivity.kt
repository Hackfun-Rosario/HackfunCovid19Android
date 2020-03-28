package com.hackfunrosario.covidapparg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entries: ArrayList<Entry> = ArrayList()
        entries.add(Entry(1f,1f))
        entries.add(Entry(2f,2f))
        entries.add(Entry(3f,4f))
        entries.add(Entry(4f,5f))
        entries.add(Entry(5f,8f))
        entries.add(Entry(6f,11f))
        entries.add(Entry(7f,14f))
        entries.add(Entry(8f,16f))
        entries.add(Entry(9f,21f))
        entries.add(Entry(10f,27f))
        val dataset: LineDataSet = LineDataSet(entries, "Casos confirmados")
        val lineData: LineData = LineData(dataset)
        chart.data = lineData
        chart.invalidate()
    }
}
