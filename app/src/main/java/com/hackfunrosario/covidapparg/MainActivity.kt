package com.hackfunrosario.covidapparg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lineEntries: ArrayList<Entry> = ArrayList()
        lineEntries.add(Entry(1f,1f))
        lineEntries.add(Entry(2f,2f))
        lineEntries.add(Entry(3f,4f))
        lineEntries.add(Entry(4f,5f))
        lineEntries.add(Entry(5f,8f))
        lineEntries.add(Entry(6f,11f))
        lineEntries.add(Entry(7f,14f))
        lineEntries.add(Entry(8f,16f))
        lineEntries.add(Entry(9f,21f))
        lineEntries.add(Entry(10f,27f))

        val lineDataset: LineDataSet = LineDataSet(lineEntries, "Casos confirmados")
        val lineData: LineData = LineData(lineDataset)
        line_chart.data = lineData
        line_chart.invalidate()


        val barEntries1: ArrayList<BarEntry> = ArrayList()
        barEntries1.add(BarEntry(1f,1f))
        barEntries1.add(BarEntry(2f,2f))
        barEntries1.add(BarEntry(3f,4f))
        barEntries1.add(BarEntry(4f,5f))
        barEntries1.add(BarEntry(5f,8f))
        barEntries1.add(BarEntry(6f,11f))
        barEntries1.add(BarEntry(7f,14f))
        barEntries1.add(BarEntry(8f,16f))
        barEntries1.add(BarEntry(9f,21f))
        barEntries1.add(BarEntry(10f,27f))

        val barEntries2: ArrayList<BarEntry> = ArrayList()
        barEntries2.add(BarEntry(1f,3f))
        barEntries2.add(BarEntry(2f,5f))
        barEntries2.add(BarEntry(3f,7f))
        barEntries2.add(BarEntry(4f,8f))
        barEntries2.add(BarEntry(5f,11f))
        barEntries2.add(BarEntry(6f,14f))
        barEntries2.add(BarEntry(7f,17f))
        barEntries2.add(BarEntry(8f,19f))
        barEntries2.add(BarEntry(9f,24f))
        barEntries2.add(BarEntry(10f,30f))

        val barDataset1: BarDataSet = BarDataSet(barEntries1, "Confirmados")
        barDataset1.color = R.color.colorPrimary

        val barDataset2: BarDataSet = BarDataSet(barEntries2, "Sospechosos")
        barDataset2.color = R.color.colorAccent

        val barData: BarData = BarData(barDataset1, barDataset2)
        bar_chart.data = barData
        bar_chart.invalidate()
    }
}
