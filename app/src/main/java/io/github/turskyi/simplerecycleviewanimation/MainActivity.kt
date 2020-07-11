package io.github.turskyi.simplerecycleviewanimation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/** Example of animation from list to grid */
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private var layoutManager: GridLayoutManager? = null
    private var adapter: SimpleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager
        adapter = SimpleAdapter(layoutManager)
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.change_layout -> {
                if (layoutManager?.spanCount == 1) {
                    layoutManager?.spanCount = 3
                    item.title = "list"
                } else {
                    layoutManager?.spanCount = 1
                    item.title = "grid"
                }
                /**
                   this line makes animation
                 */
                adapter?.notifyItemRangeChanged(0, adapter?.itemCount ?: 0)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
