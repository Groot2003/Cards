package au.edu.swin.sdmd.cardoop

fun main() {
    var c = Card(Ranks.ACE,Suits.HEART)

    c.printDetails()
    c.flip()
    c = Card()
    c.printDetails()

}
