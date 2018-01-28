package crackingthecode.part2conceptsandalgorithms;

import java.util.List;
import java.util.Queue;
import java.util.UUID;

@SuppressWarnings("unused")
public final class Chapter7ObjectOrientedDesign {
    /**
     * 7.5 - Design the data structures for an online book reader system.
     */
    public enum BookStatus {
        ONLINE,
        AWAY,
        OFFLINE
    }

    /*
     * 7.2 - Imagine you have a call center with three levels of employees: fresher, technical lead
     * (TL), product manager (PM). There can be multiple employees, but only one TL or PM. An
     * incoming telephone call must be allocated to a fresher who is free. If a fresher can’t handle
     * the call, he or she must escalate the call to technical lead. If the TL is not free or not
     * able to handle it, then the call should be escalated to PM. Design the classes and data
     * structures for this problem. Implement a method getCallHandler().
     */

    /**
     * 7.6 - Implement a jigsaw puzzle. Design the data structures and explain an algorithm to solve
     * the puzzle.
     */
    public enum Edge {
        CONNECT_IN,
        CONNECT_IN2,
        CONNECT_OUT,
        CONNECT_OUT2
    }

    /**
     * 7.7 - Explain how you would design a chat server. In particular, provide details about the
     * various backend components, classes, and methods. What would be the hardest problems to solve?
     */
    public enum StatusType {
        ONLINE,
        AWAY,
        OFFLINE
    }

    /**
     * 7.9 - Explain the data structures and algorithms that you would use to design an in-memory file
     * system. Illustrate with an example in code where possible
     */
    @SuppressWarnings("EmptyMethod")
    public interface BaseFileSystem {
        void mount();
        void unmount();
        void createFile(String name);
        void createDirectory(String name);
        void openFile(File file, String mode);
        void closeFile(File file);
        void readFile(File file);
        void writeFile(File file);
        void copy(File source,  File destination);
        void delete(File file);
    }

    /**
     * 7.1 - Design the data structures for a generic deck of cards. Explain how you would subclass it
     * to implement particular card games.
     */
    public static class Card {
        private Suite mSuite;
        private int mCardNumber;
        public Card(Suite suite,  int cardNumber) {
            mSuite = suite;
            mCardNumber = cardNumber;
        }

        public int getNumber() {
            return mCardNumber;
        }

        public Suite getSuite() {
            return mSuite;
        }

        public enum Suite {
            HEARTS,
            DIAMONDS,
            CLUBS,
            SPADES
        }
    }

    /*
     * 7.4 - Design a chess game using object oriented principles.
     */

    /**
     * 7.3 - Design a musical juke box using object oriented principles.
     */
    // MP3 Player?(more modern)
    // Song, Controls on Jukebox(previous, right), Playlist(contains songs)
    public static class Song {
        private UUID mUuid;
        private String mSong;
        private String mArtist;
        private String mAlbum;
    }

    public abstract static class Playlist {
        private Song mSong;
        private Queue<Song> mList;

        abstract void enqueueSong(Song song);

        abstract void dequeueSong(Song song);

        abstract Song getCurrentSong();
    }

    public abstract static class Selector {

        private Song mCurrentSong;

        abstract void setTrack(Song song);

        abstract Song getCurrentSong();
    }

    public static class JukeBox {
        private List<Song> mSongList;
        private Selector mSelector;

        public JukeBox(List<Song> songList) {
            mSongList = songList;
        }
    }

    public static class Piece {
        public Edge left = Edge.CONNECT_IN;
        public Edge right = Edge.CONNECT_IN2;
        public Edge bottom = Edge.CONNECT_OUT;
        public Edge top = Edge.CONNECT_OUT2;
        public int orientation;
    }

    public abstract static class Puzzle {
        public Piece[][] current;
        public Piece[][] solution;

        public abstract boolean check(Piece[][] current, Piece[][] solution);
    }

    public static class Status {
        public StatusType statusType;
        public String message;
    }

    public abstract static class User {
        public Status status;
        public String firstName;
        public String lastName;
        public String userName;
        public User[] friendsList;

        public abstract boolean addUser(String username);

        public abstract boolean removeUser(String username);
    }

    public abstract static class AddRequest {
        public String fromUser;
        public String toUSer;
    }

    /*
     * 7.8 - Othello is played as follows: Each Othello piece is white on one side and black on the
     * other. When a piece is surrounded by its opponents on both the left and right sides, or both
     * the top and bottom, it is said to be captured and its color is flipped. On your turn, you
     * must capture at least one of your opponent’s pieces. The game ends when either user has no
     * more valid moves, and the win is assigned to the person with the most pieces. Implement the
     * object oriented design for Othello.
     */

    public abstract static class Server {
        public abstract boolean login(String user, String pass);
    }

    public static class Drive {
    }

    public static class File implements BaseFileSystem {
        // contains metadata
        @Override
        public void mount() {
        }

        @Override
        public void unmount() {
        }

        @Override
        public void createFile(String name) {
        }

        @Override
        public void createDirectory(String name) {
        }

        @Override
        public void openFile(File file,  String mode) {
        }

        @Override
        public void closeFile(File file) {
        }

        @Override
        public void readFile(File file) {
        }

        @Override
        public void writeFile(File file) {
        }

        @Override
        public void copy(File source,  File destination) {
        }

        @Override
        public void delete(File file) {
        }
    }

    public static class Folder implements BaseFileSystem {
        public List<File> fileList;

        @Override
        public void mount() {
        }

        @Override
        public void unmount() {
        }

        @Override
        public void createFile(String name) {
        }

        @Override
        public void createDirectory(String name) {
        }

        @Override
        public void openFile(File file,  String mode) {
        }

        @Override
        public void closeFile(File file) {
        }

        @Override
        public void readFile(File file) {
        }

        @Override
        public void writeFile(File file) {
        }

        @Override
        public void copy(File source,  File destination) {
        }

        @Override
        public void delete(File file) {
        }
    }

    public static class FileSystem {
        public List<BaseFileSystem> baseFileSystemList;
        public List<Drive> driveList;
    }

    /*
     * 7.10 - Describe the data structures and algorithms that you would use to implement a garbage
     * collector in C++.
     */
    // most of the time this is implemeted with smart pointers
    // memory vs performance
    //  struct Object { };
    //  struct RefCount {
    //      int count;
    //  };
    //  struct RefCountPtr {
    //      Object * pointee;
    //      RefCount * refCount;
    //  };/*/
}
