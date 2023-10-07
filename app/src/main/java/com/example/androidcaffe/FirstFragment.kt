package com.example.androidcaffe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.androidcaffe.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.donut)
            .setOnClickListener(View.OnClickListener {
                displayToast(getResources().getString(R.string.donut_order_message))
            })


        view.findViewById<ImageView>(R.id.ice_cream)
            .setOnClickListener(View.OnClickListener {
                displayToast(getString(R.string.ice_cream_order_message))
            })


        view.findViewById<ImageView>(R.id.froyo)
            .setOnClickListener(View.OnClickListener {
                displayToast(getString(R.string.froyo_order_message))
            })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun displayToast(message: String?) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

}