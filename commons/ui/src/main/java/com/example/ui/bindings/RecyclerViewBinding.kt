package com.example.ui.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("itemDecorationSpacing")
fun RecyclerView.setItemDecorationSpacing(spacingPx: Float) {
    addItemDecoration(
        RecyclerViewItemDecoration(spacingPx.toInt())
    )
}
