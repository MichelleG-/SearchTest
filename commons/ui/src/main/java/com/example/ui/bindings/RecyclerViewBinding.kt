package com.example.ui.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ui.recyclerview.RecyclerViewItemDecoration

@BindingAdapter("itemDecorationSpacing")
fun RecyclerView.setItemDecorationSpacing(spacingPx: Float) {
    addItemDecoration(
        RecyclerViewItemDecoration(spacingPx.toInt())
    )
}
