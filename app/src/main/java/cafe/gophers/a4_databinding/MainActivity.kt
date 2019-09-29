package cafe.gophers.a4_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import cafe.gophers.a4_databinding.databinding.ActivityMainBinding
import cafe.gophers.a4_databinding.user.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val users = listOf<User>(
            User("Magnus",33),
            User("Elazer",23),
            User("Serral",22)
        )
//        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.user = users[0]

        constraint_layout.setOnClickListener {
            binding.user = users.random()
        }
    }
}
