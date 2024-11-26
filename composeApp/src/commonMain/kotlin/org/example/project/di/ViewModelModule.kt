package org.example.project.di

import org.koin.dsl.module
import org.example.project.viewmodel.HomeViewModel

val provideviewModelModule = module {
    single {
        HomeViewModel(get())
    }
}