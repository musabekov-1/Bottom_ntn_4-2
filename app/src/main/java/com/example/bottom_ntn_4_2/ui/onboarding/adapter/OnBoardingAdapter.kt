package com.example.bottom_ntn_4_2.ui.onboarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.bottom_ntn_4_2.databinding.ItemOnboardingBinding
import com.example.bottom_ntn_4_2.model.OnBoarding
import com.example.bottom_ntn_4_2.ui.utils.loadImage

class OnBoardingAdapter( private val onClick:()->Unit) : Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {
    private val list= arrayListOf(
        OnBoarding("https://www.carscrim.com/wp-content/uploads/2021/11/2-3.jpg","Rent a Car","High-quality cars at affordable prices and in a short time"),
        OnBoarding("https://cdnn21.img.ria.ru/images/07e5/0b/0f/1759148019_0:280:3068:2006_1920x0_80_0_0_6c39e46a2ddc5856b143cb4ffa11697f.jpg","Fast document processing","Small list of required documents"),
        OnBoarding("https://barlinek-profi.com.ua/img/cms/17_7.jpg","easy payment","pay in a convenient way for you in cash, bank cards or electronic wallets")

        )





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
      holder.bind(list.get(position))
    }
    inner class OnBoardingViewHolder ( private val binding:ItemOnboardingBinding) :
        ViewHolder(binding.root) {
        fun bind(onBoarding: OnBoarding) = with(binding){
         tvTextOne.text=onBoarding.tvTextOne
            tvTextTwo.text=onBoarding.tvTextTwo


            button.setOnClickListener {
                onClick()
            }
            skip.setOnClickListener {
                onClick()
            }
            ivBoard.loadImage(onBoarding.image)
            skip.isInvisible = adapterPosition == list.lastIndex
            button.isVisible = adapterPosition == list.lastIndex
        }

    }
}
