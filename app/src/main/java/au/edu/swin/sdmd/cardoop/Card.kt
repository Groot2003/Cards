package au.edu.swin.sdmd.cardoop
import kotlin.random.Random

class Card {
    val rank: Ranks
    val suit: Suits

    var flipped: Boolean = true

    constructor(myrank: Ranks, mysuit: Suits) {
        rank = myrank
        suit = mysuit
    }

    constructor() {
        rank = Ranks.values()[Random.nextInt(until = 13)]
        suit = Suits.values()[Random.nextInt(until = 3)]
    }

    fun flip() {
        flipped = !flipped
    }

    fun printDetails() {
//        if(flipped) println("Rank: $rank Suit: $suit") else println("---")
        when {
            flipped -> println("Rank: $rank Suit: $suit")
            !flipped -> println("---")
        }
    }

    fun getDetails(): String {
//        if(flipped) println("Rank: $rank Suit: $suit") else println("---")
        return when {
            flipped -> "Rank: $rank Suit: $suit"
            !flipped -> "---"
            else -> "Wrong Card"
        }
    }
}
