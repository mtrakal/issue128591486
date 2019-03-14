package cz.mtrakal.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listForSpinner: MutableList<String> = mutableListOf()
        for (i in 1..200) {
            listForSpinner.add("Item $i")
        }

        val adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listForSpinner)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        vSpinner1.adapter = adapter
        vSpinner2.adapter = adapter
    }
}
