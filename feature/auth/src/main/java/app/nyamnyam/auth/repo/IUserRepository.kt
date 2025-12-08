package app.nyamnyam.auth.domain.repo

import app.common.data.entity.CommonPreferenceEntity
import kotlinx.coroutines.flow.Flow

interface IUserRepository {
    suspend fun getPreference(): Flow<CommonPreferenceEntity>?
}