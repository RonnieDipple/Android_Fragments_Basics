package com.lambdaschool.congressfragmentsproject

import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lambdaschool.congressfragmentsproject.api.CongressDao
import com.lambdaschool.congressfragmentsproject.api.CongresspersonDetails
import com.lambdaschool.congressfragmentsproject.api.CongresspersonOverview
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_congresspersonoverview.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(),CongresspersonOverviewFragment.OnListFragmentInteractionListener {

    override fun onListFragmentInteraction(item: CongresspersonOverview?) {
        val fragment = DetailsFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get an overview list for all members of congress
        val allMembers: ArrayList<CongresspersonOverview> = CongressDao.allMembers

        // get details for a single member of congress
        val singleMemberDetails: CongresspersonDetails? = allMembers[0].id?.let { CongressDao.getMemberDetails(it) }

        // get congressperson portrait
        val image: Bitmap? = allMembers[0].id?.let { CongressDao.getImage(it) }


        val bundle = Bundle()




    }
}
