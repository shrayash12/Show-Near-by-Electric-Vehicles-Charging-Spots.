package shradha.com.showelectricchargespotsapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import shradha.com.showelectricchargespotsapp.R
import shradha.com.showelectricchargespotsapp.data.model.ChargingStationInfo

class ElectricChargeSpotListAdapter :
    ListAdapter<ChargingStationInfo, ElectricChargeSpotListAdapter.ElectricChargeSpotViewHolder>(
        COMPARATORS
    ) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ElectricChargeSpotViewHolder {
        return ElectricChargeSpotViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ElectricChargeSpotViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ElectricChargeSpotViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        private val tvCountryId = itemView.findViewById<TextView>(R.id.tvCountryId)
        private val tvLat = itemView.findViewById<TextView>(R.id.tvLat)

        fun bind(chargingStationInfo: ChargingStationInfo) {
            tvTitle.text = chargingStationInfo.title
            tvCountryId.text = chargingStationInfo.country
            tvLat.text = String.format("%.2f km", chargingStationInfo.distance)
        }
    }

    object COMPARATORS : DiffUtil.ItemCallback<ChargingStationInfo>() {
        override fun areItemsTheSame(
            oldItem: ChargingStationInfo,
            newItem: ChargingStationInfo
        ): Boolean {
            return oldItem.country === newItem.country
        }

        override fun areContentsTheSame(
            oldItem: ChargingStationInfo,
            newItem: ChargingStationInfo
        ): Boolean {
            return oldItem == newItem
        }
    }
}