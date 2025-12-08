package app.nyamnyam.auth.data.repo

import app.coconut2.coconut2_mvvm.base.BaseRepository
import app.common.data.dao.PreferenceDao
import app.common.data.entity.CommonPreferenceEntity
import app.nyamnyam.auth.domain.repo.IUserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepository @Inject constructor(
    val dao: PreferenceDao
) : BaseRepository(), IUserRepository {
    override suspend fun getPreference(): Flow<CommonPreferenceEntity>? {
        dao.getAllPreference()
        return null
    }

}