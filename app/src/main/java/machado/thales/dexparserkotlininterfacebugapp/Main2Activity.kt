package machado.thales.dexparserkotlininterfacebugapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById(R.id.button).setOnClickListener {
            findViewById(R.id.surpriseText).visibility = View.VISIBLE
        }
    }
}
