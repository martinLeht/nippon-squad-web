import kotlinx.html.*

fun HTML.layout(bodyElement: BODY.() -> Unit) {
    head {
        lang = "en"
        meta { charset = "UTF-8" }
        meta {
            name = "viewport"
            content = "width=device-width, initial-scale=1"
        }

        link(rel = "stylesheet", href = "/static/styles/tailwind.css", type = "text/css")

        val htmx = { e: String -> "assets/htmx.org/1.9.12/$e" }

        script(src = htmx("dist/htmx.min.js")) {}
        script(src = htmx("dist/ext/json-enc.js")) {}
        script(src = htmx("dist/ext/sse.js")) {}
    }

    body {
        bodyElement()
    }
}