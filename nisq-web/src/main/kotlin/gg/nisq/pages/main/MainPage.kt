package gg.nisq.pages.main

import kotlinx.html.*
import layout

fun HTML.mainPage() = layout {

    div(classes = "flex") {

        div(classes = "flex-none w-14 h-14 bg-red-800") {
            h1(classes = "bg-red-800") {
                +"Side panel"
            }
        }

        div(classes = "flex-auto w-64 bg-amber-600") {
            h1(classes = "") {
                +"Nippon squad Main"
            }
            ul {
                for (n in 1..10) {
                    li { +"$n" }
                }
            }
        }

        div(classes = "flex-auto w-32 bg-orange-200") {
            h1(classes = "") {
                +"Side panel"
            }
        }
    }


}