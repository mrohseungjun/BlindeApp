package com.example.blindeapp.data.source.local

import androidx.room.TypeConverter
import com.example.blindeapp.util.DateUtil
import java.util.Date

class DateConverter {

    @TypeConverter
    fun toDate(timestamp : String?) : Date?{
        return timestamp?.let{ DateUtil.dbDateFormat.parse(it)}
    }

    @TypeConverter
    fun toTimeStamp(date: Date?) : String? {
        return DateUtil.dbDateFormat.format(date)
    }
}