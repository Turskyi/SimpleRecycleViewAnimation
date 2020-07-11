package io.github.turskyi.simplerecycleviewanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DetailedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    constructor(parent: ViewGroup)
            : this(LayoutInflater.from(parent.context).inflate(R.layout.detailed_item, parent, false))
}