package app.common.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import app.coconut2.coconut2_mvvm.base.datasource.local.BaseEntity

@Entity(tableName = "common_preference")
data class CommonPreferenceEntity (
    @ColumnInfo(name = "key")
    val key: String,
    @ColumnInfo(name = "value")
    val value: String,
) : BaseEntity()