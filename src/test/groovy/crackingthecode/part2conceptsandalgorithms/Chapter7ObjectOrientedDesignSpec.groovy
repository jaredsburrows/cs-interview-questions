package crackingthecode.part2conceptsandalgorithms

import crackingthecode.part2conceptsandalgorithms.Chapter7ObjectOrientedDesign.Card
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter7ObjectOrientedDesignSpec extends BaseSpec {

    def "test card"() {
        given:
        def card = new Card(Card.Suite.HEARTS, 5)

        expect:
        card.getSuite() == Card.Suite.HEARTS
        card.getNumber() == 5
    }
}
