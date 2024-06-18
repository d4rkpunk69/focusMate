package com.example.focusmate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.focusmate.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var isPlaying = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity).supportActionBar?.title = "Pomodoro Technique"
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.apply {
            val playPauseButton: ImageButton = btnPlayPause
            playPauseButton.setImageResource(R.drawable.icon_play)

            playPauseButton.setOnClickListener{
                if(isPlaying) {
                    playPauseButton.setImageResource(R.drawable.icon_play)
                    isPlaying = false
                } else {
                    playPauseButton.setImageResource(R.drawable.icon_pause)
                    isPlaying = true
                }
            }



        }
        return binding.root

    }
}