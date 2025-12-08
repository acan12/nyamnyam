package app.common

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import app.coconut2.coconut2_mvvm.core.datasource.local.AppDatabase
import app.common.CommonDependencies.Companion.COMMON_DATABASE_NAME
import app.common.data.dao.PreferenceDao
import app.common.data.entity.CommonPreferenceEntity


@Database(version = 1, exportSchema = false, entities = [CommonPreferenceEntity::class])
abstract class CommonDatabase : AppDatabase() {
    abstract fun preferenceDao(): PreferenceDao

    companion object {
        @Volatile
        private var INSTANCE: CommonDatabase? = null
        fun getDatabase(context: Context): CommonDatabase = INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                CommonDatabase::class.java,
                COMMON_DATABASE_NAME
            ).build()
            INSTANCE = instance
            instance
        }
    }
}