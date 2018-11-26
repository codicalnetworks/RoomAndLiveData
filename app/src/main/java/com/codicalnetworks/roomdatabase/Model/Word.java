package com.codicalnetworks.roomdatabase.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by ADETOBA on 11/26/2018.
 */

@Entity (tableName = "word_table")
public class Word {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    public String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    @NonNull
    public String getmWord() {
        return mWord;
    }

}
