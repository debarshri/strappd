package io.github.debarshri;

import io.github.debarshri.datatype.Tab;

import java.util.ArrayList;
import java.util.List;

import static io.github.debarshri.Html.*;
import static io.github.debarshri.Utils.merge;

public class Bootstrap {

    private static final String div_with_col_12 = "<div class=\"col-lg-12\">%s</div>";
    private static final String div_with_variable_len = "<div class=\"col-lg-%d\">%s</div>";
    private static final String div_with_class_name = "<div class=\"%s\">%s</div>";
    private static final String div_with_var_len_offset = "<div class=\"col-lg-%d col-lg-offset-%d\" >%s</div>";
    private static final String div_container = "<div class=\"container\">%s</div>";
    private static String         meta = "<meta charset=\"utf-8\">\n";


    private Bootstrap()
    {
        //ignore
    }

    public static String div(String... data) {

        return String.format(div_with_col_12, merge(data));
    }

    public static String div(String data) {
        return String.format(div_with_col_12, data);
    }

    public static String div(int bootstrapSize, String... data) {
        return String.format(div_with_variable_len, bootstrapSize, merge(data));
    }

    public static String div(String bootstrapClassName, int bootstrapSize, String... data) {
        return String.format(div_with_class_name, bootstrapClassName, merge(data));
    }

    public static String div(int bootstrapSize, int offset, String... data) {
        return String.format(div_with_var_len_offset, bootstrapSize, offset, merge(data));
    }


    public static String container(String... datas) {
        return String.format(div_container, merge(datas));
    }

    public static String html(String... datas) {
        return Html.html(
                head(meta,
                        title("Artelius"),
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n",
                        "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n",
                        link("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"),
                        "<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>",
                        scriptWithSource("https://code.jquery.com/jquery-1.10.2.min.js"),
                        css("body { font-family: 'Open Sans', sans-serif; }"),
                        scriptWithSource("https://bootswatch.com/bower_components/bootstrap/dist/js/bootstrap.min.js"),
                        link("//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css"),
                        scriptWithSource("http://www.kryogenix.org/code/browser/sorttable/sorttable.js"),
                        scriptWithSource("https://cdnjs.cloudflare.com/ajax/libs/tablefilter/2.5.0/tablefilter.js"),
                        scriptWithSource("//code.jquery.com/jquery-1.10.2.js"),
                        scriptWithSource("//code.jquery.com/ui/1.11.4/jquery-ui.js"),
                        merge(datas)));
    }

    public static String brand(String data, String href) {
        return String.format("<a class=\"navbar-brand\" href=%s>%s</a>\n", href, data);
    }

    public static String navbar(String... data) {
        String format = "<nav class=\"navbar navbar-default\">\n" +
                "  <div class=\"container-fluid\">\n" +
                "    <!-- Brand and toggle get grouped for better mobile display -->\n" +
                "    <div class=\"navbar-header\">\n" +
                "    <ul>\n" +
                "    %s\n" +
                "    </ul></div>\n" +
                "    </div><!-- /.navbar-collapse -->\n" +
                "  </div><!-- /.container-fluid -->\n" +
                "</nav>";

        return String.format(format, merge(data));
    }

    public static String nav(String name, String href) {
        String format = "\n<ul class=\"nav navbar-nav\">\n" +
                "   <li><a href=\"%s\" >%s</a></li>\n" +
                "</ul>";

        return String.format(format, href, name);
    }

    public static String button(String value) {
        return String.format("<button type=\"submit\" class=\"btn btn-default\">%s</button>\n", value);
    }

    public static String defaultLinkedButton(String name, String href) {
        return String.format("<a href=\"%s\" class=\"btn btn-default\">%s</a>\n", href, name);
    }

    public static String table(String... rows) {
        String format = "<table class=\"table table-striped table-hover \"><tbody>%s</tbody></table>";
        return String.format(format, merge(rows));
    }

    public static String table_bordered(String... rows) {
        String format = "<table class=\"table table-bordered table-hover \"><tbody>%s</tbody></table>";
        return String.format(format, merge(rows));
    }

    public static String table_bordered_sorttable(String... rows) {
        String format = "<table id=\"table1\" class=\"table table-bordered table-hover sortable filterable\"><tbody>%s</tbody></table>";
        return String.format(format, merge(rows));
    }

    public static String tr(String... data) {
        String format = "  <tr class=\"default\">%s</tr>\n";
        return String.format(format, merge(data));
    }

    public static String thead(String... data) {
        String head = " <thead><tr>%s</tr></thead>\n";

        return String.format(head, merge(data));
    }

    public static String th(String data) {
        return String.format("<th>%s</th>", data);
    }

    public static String td(String... data) {
        String format = " <td>%s</td>\n";

        return String.format(format, data);
    }

    public static String td_danger(String... data) {
        String format = " <td class=\"danger\">%s</td>\n";

        return String.format(format, data);
    }

    public static String dropDown(String name, String... list) {

        String format = " <ul class=\"nav navbar-nav\">\n" +
                " <li class=\"dropdown\">\n" +
                "              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"themes\"> %s <span class=\"caret\"></span></a>\n" +
                "              <ul class=\"dropdown-menu\" aria-labelledby=\"themes\">\n" +
                "              %s" +
                "              </ul>\n" +
                "            </li>" +
                "          </ul>";

        return String.format(format, name, merge(list));
    }

    public static String menuItem(String item, String href) {
        String format = "<li><a href=%s>%s</a></li>";
        return String.format(format, href, item);
    }

    public static String li(String data) {

        String format = "<li>%s</li>";
        return String.format(format, data);
    }


    public static String jumbotron(String... data) {
        String format = "<div class=\"jumbotron\">\n" +
                "%s" +
                "            </div>";

        return String.format(format, merge(data));
    }

    public static String tabs(Tab... tabs) {
        List<String> navTab = new ArrayList<String>();
        List<String> tabContent = new ArrayList<String>();

        for (Tab tab : tabs) {
            navTab.add(tab.getNavTab());
            tabContent.add(tab.getTabContent());
        }

        String format = "<div>" +
                "  <!-- Nav tabs -->\n" +
                "  <ul class=\"nav nav-tabs\" role=\"tablist\">\n" +
                "%s" +
                "  </ul>\n" +
                "\n" +
                "  <!-- Tab panes -->\n" +
                "  <div class=\"tab-content\">\n" +
                "%s" +
                "  </div></div>\n" +
                "\n";

        String[] navTabs = new String[navTab.size()];
        String[] tabContents = new String[tabContent.size()];

        return String.format(format, merge(navTab.toArray(navTabs)), merge(tabContent.toArray(tabContents)));

    }

    public static Tab tab(String tabname, String name, String data) {
        String format1 = "<li role=\"presentation\"><a href=\"#%s\" aria-controls=\"%s\" role=\"tab\" data-toggle=\"tab\">%s</a></li>";
        String format2 = "<div role=\"tabpanel\" class=\"tab-pane\" id=\"%s\">%s</div>\n";
        return new Tab(String.format(format1, tabname, tabname, name), String.format(format2, tabname, data));
    }

    public static String div_form_group(String... divs) {
        String format = "<div class=\"form-group\">%s</div>";
        return String.format(format, merge(divs));
    }

    public static String input(String labelName, String name, String type, String placeholder) {
        String format = " <label>%s</label>\n" +
                "    <input type=\"%s\" class=\"form-control\" placeholder=\"%s\" name=\"%s\" id=\"%s\" />";

        return String.format(format, labelName, type, placeholder, name, name);
    }

    public static String input(String labelName, String name, String type, String placeholder, String value) {
        String format = " <label>%s</label>\n" +
                "    <input type=\"%s\" class=\"form-control\" placeholder=\"%s\" name=\"%s\" id=\"%s\" value=\"%s\" />";

        return String.format(format, labelName, type, placeholder, name, name, value);
    }
}
