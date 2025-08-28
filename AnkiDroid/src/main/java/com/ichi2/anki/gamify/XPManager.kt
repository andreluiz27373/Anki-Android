package com.ichi2.anki.gamify

object XPManager {
    var totalXP: Int = 0
    var dailyXP: Int = 0

    fun addXP(amount: Int) {
        totalXP += amount
        dailyXP += amount
    }
}
