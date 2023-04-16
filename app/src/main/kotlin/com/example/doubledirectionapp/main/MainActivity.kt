package com.example.doubledirectionapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doubledirectionapp.R
import com.example.doubledirectionapp.model.Category
import com.example.doubledirectionapp.model.Element

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.category_list).also {
            it.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            it.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            it.adapter = MainAdapter(
                listOf(
                    Category(
                        "Category-1", listOf(
                            Element.FILM,
                            Element.IMAGE,
                            Element.FILE,
                            Element.MUSIC,
                            Element.FILM,
                            Element.IMAGE,
                            Element.FILE,
                            Element.MUSIC
                        )
                    ),
                    Category(
                        "Category-2", listOf(
                            Element.IMAGE,
                            Element.FILM,
                            Element.FILE,
                            Element.MUSIC,
                            Element.IMAGE,
                            Element.FILM,
                            Element.FILE,
                            Element.MUSIC
                        )
                    ),
                    Category(
                        "Category-3", listOf(
                            Element.FILE,
                            Element.FILM,
                            Element.IMAGE,
                            Element.MUSIC,
                            Element.FILE,
                            Element.FILM,
                            Element.IMAGE,
                            Element.MUSIC
                        )
                    ),
                    Category(
                        "Category-4", listOf(
                            Element.MUSIC,
                            Element.FILM,
                            Element.IMAGE,
                            Element.FILE,
                            Element.MUSIC,
                            Element.FILM,
                            Element.IMAGE,
                            Element.FILE
                        )
                    ),
                    Category(
                        "Category-5", listOf(
                            Element.FILE,
                            Element.IMAGE,
                            Element.FILM,
                            Element.MUSIC,
                            Element.FILE,
                            Element.FILM,
                            Element.IMAGE,
                            Element.MUSIC
                        )
                    ),
                    Category(
                        "Category-6", listOf(
                            Element.MUSIC,
                            Element.IMAGE,
                            Element.FILM,
                            Element.FILE,
                            Element.MUSIC,
                            Element.FILM,
                            Element.IMAGE,
                            Element.FILE
                        )
                    )
                )
            )
        }

    }

}