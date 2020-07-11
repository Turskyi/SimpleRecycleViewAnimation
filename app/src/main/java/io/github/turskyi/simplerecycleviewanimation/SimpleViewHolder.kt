package io.github.turskyi.simplerecycleviewanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SimpleViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

    constructor(parent: ViewGroup)
            : this(LayoutInflater.from(parent.context).inflate(R.layout.simple_item, parent, false))
}