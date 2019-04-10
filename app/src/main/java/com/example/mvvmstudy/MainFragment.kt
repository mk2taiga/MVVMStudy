package com.example.mvvmstudy

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmstudy.databinding.FragmentMainBindingBinding

class MainFragment : Fragment() {

    private lateinit var editText: EditText
    private lateinit var textView: TextView

    private lateinit var binding: FragmentMainBindingBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ステップ②
//        viewModel.liveDataText.observe(this, Observer {
//            binding.countText.text = "文字数：" + it.length.toString()
//        })
    }

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_binding, container, false)
//        //ステップ③
////        binding.lifecycleOwner = viewLifecycleOwner
//        binding.viewModel = viewModel
//        viewModel.fetchText()
//        return binding.root
//    }


    // ステップ①
    // 以下はDataBindingを使わない方法
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.edit_text)
        textView = view.findViewById(R.id.count_text)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(text: Editable?) {
                // Do Nothing
            }

            override fun beforeTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //Do Nothing
            }

            override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textView.text = "文字数：" + text?.length.toString()
            }
        })

        viewModel.fetchText {
            editText.setText(it, TextView.BufferType.NORMAL)
            textView.text = "文字数：" + it.length.toString()
        }
    }
}