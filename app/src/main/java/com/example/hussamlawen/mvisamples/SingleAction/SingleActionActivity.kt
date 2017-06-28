package com.example.hussamlawen.mvisamples.SingleAction

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.hussamlawen.mvisamples.MviSamplesApp
import com.example.hussamlawen.mvisamples.R
import fmrsabino.moviesdb.injection.component.DaggerViewComponent
import com.example.hussamlawen.mvisamples.injection.module.ViewModule
import io.reactivex.disposables.Disposable

import kotlinx.android.synthetic.main.activity_single_action.*

class SingleActionActivity : AppCompatActivity() {
    lateinit var presenter: Contract.Presenter
    var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
        setContentView(R.layout.activity_single_action)
        setSupportActionBar(toolbar)

        fab1.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        //menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStop() {
        super.onStop()
        disposable?.dispose()
    }

    fun inject() {
        DaggerViewComponent.builder()
                .viewModule(ViewModule(this))
                .applicationComponent(MviSamplesApp[this].component)
                .build()
                .inject(this)
    }
}