package com.nannan.nansu.data.repository

import com.nannan.nansu.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
