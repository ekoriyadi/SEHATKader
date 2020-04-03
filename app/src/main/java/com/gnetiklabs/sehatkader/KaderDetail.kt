package com.gnetiklabs.sehatkader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_kader_detail.*

class KaderDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kader_detail)

        var url:String="http://192.168.100.9/api-odha/json_object.php?user_id=2"

        var rq:RequestQueue = Volley.newRequestQueue(this)
        var jor = JsonObjectRequest(Request.Method.GET, url,null,Response.Listener { response ->
            txtDetail.text = response.getString("username")

        },Response.ErrorListener{ error ->
            txtDetail.text = error.message

        })
        rq.add(jor)
    }
}
