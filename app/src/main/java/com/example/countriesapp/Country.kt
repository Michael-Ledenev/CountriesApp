package com.example.countriesapp

data class Country (
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val language: List<Language>,
)

data class Language (
    val name: String
)