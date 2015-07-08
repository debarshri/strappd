package io.github.debarshri;

import static io.github.debarshri.Utils.merge;

public class Html {
    public static String h1(String data) {
        return String.format("<h1>%s</h1>", data);
    }

    public static String h2(String data) {
        return String.format("<h2>%s</h2>", data);
    }

    public static String h3(String data) {
        return String.format("<h3>%s</h2>", data);
    }

    public static String h4(String data) {
        return String.format("<h4>%s</h2>", data);
    }

    public static String p(String data) {
        return String.format("<p>%s</p>", data);
    }

    public static String a(String name, String href) {
        String format = "<a href=%s>%s</a>";
        return String.format(format, href, name);
    }

    public static String html(String... data) {
        return String.format("<!DOCTYPE html><html lang=\"en\">\n%s</html>", merge(data));
    }

    public static String body(String... data) {
        return String.format("<body>%s</body>", merge(data));
    }

    public static String b(String data) {
        String format = "<b>%s</b>";
        return String.format(format, data);
    }

    public static String footer(String... data) {
        String htmlfooter = "<footer>%s</footer>\n";

        return String.format(htmlfooter, merge(data));
    }

    public static String form(String method, String action, String... data) {
        String form = "<form action=%s method=%s>%s</footer>\n";
        return String.format(form, action, method, merge(data));
    }

    public static String script(String s) {
        return String.format("<script>%s</script>", s);
    }

    public static String scriptWithSource(String s) {
        return String.format("<script src=\"%s\"></script>\n", s);
    }

    public static String css(String s) {
        return String.format("<style>%s</style>\n", s);
    }

    public static String head(String... s) {
        return String.format("<head>%s</head>", merge(s));
    }

    public static String title(String title) {
        return String.format("<title>%s</title>", title);
    }

    public static String link(String href) {
        return String.format("<link rel=\"stylesheet\" href=\"%s\" media=\"screen\">\n", href);

    }

    public static String br() {
        return "<br />";
    }

    public static String pre(String pre) {
        return String.format("<pre>%s</pre>", pre);
    }

    public static String textarea(String text) {
        return String.format("<textarea>%s</textarea>", text);
    }

    public static String div(String...s) {
        return "<div>"+merge(s)+"</div>";
    }
}
