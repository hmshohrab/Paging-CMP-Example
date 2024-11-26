package org.example.project.viewmodel;
import org.example.project.network.NetworkRepository


class HomeViewModel(private val networkRepository: NetworkRepository) {
    val products = networkRepository.getProducts()
}