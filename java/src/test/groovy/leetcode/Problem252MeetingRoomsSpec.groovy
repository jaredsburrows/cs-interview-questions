package leetcode

import leetcode.api.Interval
import spock.lang.Specification
import spock.lang.Unroll

final class Problem252MeetingRoomsSpec extends Specification {
    @Unroll def "canAttendMeetings(#intervals) = #answer"() {
        given:
        def sut = new Problem252MeetingRooms()

        expect:
        sut.canAttendMeetings(intervals as Interval[]) == answer

        where:
        intervals              || answer
        [new Interval(0, 30),
         new Interval(5, 10),
         new Interval(15, 20)] || false
    }
}
