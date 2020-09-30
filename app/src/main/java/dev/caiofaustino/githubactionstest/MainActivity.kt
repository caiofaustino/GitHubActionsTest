package dev.caiofaustino.githubactionstest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.caiofaustino.testlib.TestClass

class MainActivity : AppCompatActivity() {

    private val testClass = TestClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testClass.logMe()
    }
}
