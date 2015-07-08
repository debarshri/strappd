package io.github.debarshri.example;

import io.github.debarshri.Bootstrap;
import io.github.debarshri.Html;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import static io.github.debarshri.Bootstrap.*;

public class BootstrapExample {

    public static void init() {

        Spark.get("/bootstrap", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                return Bootstrap.html(
                        navbar(
                                brand("Yolothingy!", "#"),
                                nav("Test1", "#test1"),
                                dropDown("Test dropDown",
                                        menuItem("Item1", "#link1"),
                                        menuItem("Item2", "#link2"),
                                        menuItem("Item3", "#link3")
                                )
                        ),
                        container(
                                jumbotron(Html.h1("Yolo###")),
                                div(3,3,"test this offset")

                        ),
                        container(
                                table_bordered(
                                        tr(th("Col1"),th("Col3"),th("Col3")),
                                        tr(td("data"),td("data"),td("data")),
                                        tr(td("data"),td("data"),td("data")),
                                        tr(td("data"),td("data"),td("data")),
                                        tr(td("data"),td("data"),td("data")),
                                        tr(td("data"),td("data"),td("data"))
                                )
                        )
                );
            }
        });
    }
}
