package org.example.project.di

import org.example.project.network.NetworkRepository
import org.koin.dsl.module

val provideRepositoryModule = module {
    single<NetworkRepository> { NetworkRepository(get()) }
}