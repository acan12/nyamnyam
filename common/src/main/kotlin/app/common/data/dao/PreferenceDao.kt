package app.common.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.common.data.entity.CommonPreferenceEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PreferenceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: CommonPreferenceEntity)

    @Query("SELECT * FROM common_preference")
    fun getAllPreference(): Flow<List<CommonPreferenceEntity>>

    @Delete
    suspend fun deletePreference(data: CommonPreferenceEntity)
}