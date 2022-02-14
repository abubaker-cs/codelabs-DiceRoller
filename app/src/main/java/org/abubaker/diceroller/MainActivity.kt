package org.abubaker.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.abubaker.diceroller.databinding.ActivityMainBinding

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the activity_main.xml file
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(mBinding.root)

        // onClick Listener for the btnRoll
        mBinding.btnRoll.setOnClickListener { rollDice() }

        // Do a dice roll when the app starts
        rollDice()

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {

        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        mBinding.diceImage.setImageResource(drawableResource)

        // Update the content description
        mBinding.diceImage.contentDescription = diceRoll.toString()

    }

}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}