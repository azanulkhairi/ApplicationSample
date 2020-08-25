package com.honeybadger.applicationsample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.honeybadger.applicationsample.R
import com.honeybadger.applicationsample.model.Logo
import kotlinx.android.synthetic.main.gridview_menu.view.*

class LogoAdapter : BaseAdapter {

    var logolist = ArrayList<Logo>()
    var context: Context? = null

    constructor(logolist:ArrayList<Logo>, context: Context) {
        this.logolist = logolist
        this.context = context
    }


    override fun getView(position: Int, conView: View?, parent: ViewGroup?): View {
        val menu = this.logolist[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var logoView = inflator.inflate(R.layout.gridview_menu,null)
        logoView.img_logo.setImageResource(menu.image!!)
        logoView.txt_logo.text= menu.name!!
        return logoView
    }

    override fun getItem(p0: Int): Any {
       return logolist[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return logolist.size
    }
}