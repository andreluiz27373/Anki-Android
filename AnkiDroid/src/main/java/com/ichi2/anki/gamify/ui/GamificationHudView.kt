package com.ichi2.anki.gamify.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.ichi2.anki.gamify.XPManager
import com.ichi2.anki.R

/**
 * A simple HUD view that displays the user's accumulated XP.
 */
class GamificationHudView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val xpTextView: TextView

    init {
        orientation = HORIZONTAL
        // Inflate the HUD layout from XML
        LayoutInflater.from(context).inflate(R.layout.gamification_hud, this, true)
        xpTextView = findViewById(R.id.xpTextView)
        updateHud()
    }

    /**
     * Updates the HUD to reflect the current XP total.
     */
    fun updateHud() {
        xpTextView.text = "XP: ${'$'}{XPManager.totalXP}"
    }
}
