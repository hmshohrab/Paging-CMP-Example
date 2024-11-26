package org.example.project.viewmodel;
import network.NetworkRepository


class HomeViewModel(private val networkRepository: NetworkRepository) {
    val products = networkRepository.getProducts()
}