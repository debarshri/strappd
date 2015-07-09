package io.github.debarshri.example;

import io.github.debarshri.Html;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import static io.github.debarshri.Html.*;

public class HTMLExample {
    
    public static void init() {
        Spark.get("/html", new Route() {
            @Override
            public Object handle(Request request, Response response) {

                return body(
                        h1("Hello, world."),
                        h2("Can dig this?"),
                        h3("No really?"),
                        h4("No?"),
                        Html.form("/html","GET",Html.div("Yo! man")),
                        Html.br(),
                        Html.a("hello","/yolo"),
                        Html.br(),
                        Html.b("I am bold."),
                        Html.br(),
                        Html.textarea("Is this a text box?")
                );
            }
        });

        Spark.get("/html/example", new Route() {
            @Override
            public Object handle(Request request, Response response) {

                return body(
                        h1("Hello, world."),
                        h2("Can dig this?"),
                        h3("No really?"),
                        h4("No?"),
                        Html.form("/html","GET",Html.div("Yo! man")),
                        Html.br(),
                        Html.a("hello","/yolo"),
                        Html.br(),
                        Html.b("I am bold."),
                        Html.br(),
                        Html.textarea("Is this a text box?")
                );
            }
        });
    }
}
