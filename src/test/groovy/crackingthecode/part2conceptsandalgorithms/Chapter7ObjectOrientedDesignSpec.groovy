package crackingthecode.part2conceptsandalgorithms

import crackingthecode.part2conceptsandalgorithms.Chapter7ObjectOrientedDesign.Card
import crackingthecode.part2conceptsandalgorithms.Chapter7ObjectOrientedDesign.Card.Suite
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter7ObjectOrientedDesignSpec extends Specification {

    def "card"() {
        Card card = new CardGameCard(Suite.HEARTS, 5)

        expect:
        card instanceof Card
        card.getSuite() == Suite.HEARTS
        card.getNumber() == 5
    }

    class CardGameCard extends Card {
        // implement CardGameSpecifics

        CardGameCard(
                final Suite suite,
                final int cardNumber) {
            super(suite, cardNumber)
        }
    }
}
