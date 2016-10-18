package com.bignerdranch.android.criminalintent;

/**
 * Created by Claye on 10/09/16.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DESTINATION = "destination";
            public static final String TRIPTYPE = "triptype";
            public static final String DURATION = "duration";
            public static final String COMMENT = "comment";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
