package com.bignerdranch.android.criminalintent;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Claye on 10/09/16.
 */


public class CrimeCursorWrapper extends CursorWrapper { public CrimeCursorWrapper(Cursor cursor) {
    super(cursor);
}


    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        String destination = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DESTINATION));
        String triptype = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TRIPTYPE));
        String duration = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DURATION));
        String comment = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.COMMENT));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDestination(destination);
        crime.setTripType(triptype);
        crime.setDuration(duration);
        crime.setComment(comment);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        return crime;
    }
}
