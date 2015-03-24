package crackingthecode.part2conceptsandalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Chapter7ObjectOrientedDesign {

    /**
     * 7.1 - Design the data structures for a generic deck of cards. Explain how you would subclass
     * it to implement particular card games.
     */
    abstract static class Card {
        public enum Suite {
            HEARTS,
            DIAMONDS,
            CLUBS,
            SPADES
        }

        private Suite suite;
        private int cardNumber;

        public Card(final Suite suite, final int cardNumber) {
            this.suite = suite;
            this.cardNumber = cardNumber;
        }

        public int getNumber() {
            return this.cardNumber;
        }

        public Suite getSuite() {
            return this.suite;
        }
    }

    /**
     * 7.2 - Imagine you have a call center with three levels of employees: fresher, technical lead
     * (TL), product manager (PM). There can be multiple employees, but only one TL or PM. An
     * incoming telephone call must be allocated to a fresher who is free. If a fresher can’t handle
     * the call, he or she must escalate the call to technical lead. If the TL is not free or not
     * able to handle it, then the call should be escalated to PM. Design the classes and data
     * structures for this problem. Implement a method getCallHandler().
     */
    public class CallHandler {

    }

    /**
     * 7.3 - Design a musical juke box using object oriented principles.
     */
    // MP3 Player?(more modern)
    // Song, Controls on Jukebox(previous, right), Playlist(contains songs)
    class Song {
        private UUID uuid;
        private String song;
        private String artist;
        private String album;
    }

    abstract class Playlist {
        private Song song;
        private Queue<Song> list;

        abstract void enqueueSong(Song s);

        abstract void dequeueSong(Song s);

        abstract Song getCurrentSong();
    }

    abstract class Selector {
        private Song currentSong;

        abstract void setTrack(Song s);

        abstract Song getCurrentSong();

    }

    public class JukeBox {

        private List<Song> songList;
        private Selector selector;

        public JukeBox(final List<Song> songList) {
            this.songList = songList;
        }
    }

    /**
     * 7.4 - Design a chess game using object oriented principles.
     */

    /**
     * 7.5 -
     */
}
