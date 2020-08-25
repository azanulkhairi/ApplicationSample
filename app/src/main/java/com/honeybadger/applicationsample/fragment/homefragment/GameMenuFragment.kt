package com.honeybadger.applicationsample.fragment.homefragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.honeybadger.applicationsample.R
import com.honeybadger.applicationsample.activity.Main2Activity
import com.honeybadger.applicationsample.adapter.LogoAdapter
import com.honeybadger.applicationsample.model.Logo
import kotlinx.android.synthetic.main.fragment_game_menu.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GameMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameMenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var adapter: LogoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var logoList = ArrayList<Logo>()

        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))
        logoList?.add(Logo("Menu 1", R.drawable.bank))

        adapter = context?.let { LogoAdapter(logoList, it) }
        game_menu_gridview.adapter = adapter

        game_menu_gridview.setOnItemClickListener {parent, view, position, id ->
            val pos= when(position){
                0 -> {
                    val intent = Intent(this.context, Main2Activity::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this.context, Main2Activity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(this.context, Main2Activity::class.java)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this.context, Main2Activity::class.java)
                    startActivity(intent)
                }
                else ->{
                    val intent = Intent(this.context, Main2Activity::class.java)
                startActivity(intent)
                }
            }

        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GameMenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            GameMenuFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}
