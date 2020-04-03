package com.gnetiklabs.sehatkader

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_kader_list.*

class KaderList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kader_list)

        var url:String = "http://192.168.100.9/api-odha/json_array.php"
        var list = ArrayList<String>()

        var result:String = ""

        var rq:RequestQueue = Volley.newRequestQueue(this)
        var jar = JsonArrayRequest(Request.Method.GET,url,null,Response.Listener { response ->
            for (x in 0..response.length()-1){
                result += (response.getJSONObject(x).getString("username") + " - " +
                        response.getJSONObject(x).getString("level") +  "\n")
            }
            txtKaderList.text = result
        }, Response.ErrorListener { error ->
            txtKaderList.text = error.message
        })
        rq.add(jar)
    }
}
