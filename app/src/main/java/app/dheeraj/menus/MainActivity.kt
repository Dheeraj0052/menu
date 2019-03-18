package app.dheeraj.menus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menus,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId)
        {

            R.id.home ->{Toast.makeText(baseContext, "home", Toast.LENGTH_LONG).show()
                return true}
            R.id.about->{
                    Toast.makeText(baseContext, "about", Toast.LENGTH_LONG).show()
                    return true
                }


        }

        return true

    }
}