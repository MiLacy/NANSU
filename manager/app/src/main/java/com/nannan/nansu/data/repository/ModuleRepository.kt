package com.nannan.nansu.data.repository

import com.nannan.nansu.data.model.Module
import com.nannan.nansu.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
