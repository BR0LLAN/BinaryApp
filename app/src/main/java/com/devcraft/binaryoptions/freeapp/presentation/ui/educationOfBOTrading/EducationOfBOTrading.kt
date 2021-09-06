package com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading


data class EducationOfBOTrading(
    val imgPreview: Int,
    val title: String,
    val article: Article
){
    data class Article(
        val articleImg: Int,
        val articleTitle: String,
        val articleChart: Int,
        val articleContent: String,
        val articleContentAfter: String
    )
}
