package com.oddlyspaced.laurel.oos.dt2w

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.topjohnwu.superuser.Shell

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Shell.su("sendevent /dev/input/event2 0 1 5").submit();
    }
}
