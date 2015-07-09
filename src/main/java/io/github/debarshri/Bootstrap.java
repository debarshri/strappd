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
    private static final String meta = "<meta charset=\"utf-8\">";
    private static final String jquery = "https://code.jquery.com/jquery-1.10.2.min.js";
    private static final String jquery_ui = "//code.jquery.com/ui/1.11.4/jquery-ui.js";
    private static final String jquery_smoothness = "//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css";
    private static final String navbar_brand = "<a class=\"navbar-brand\" href=%s>%s</a>\n";
    private static final String navbar = "<nav class=\"navbar navbar-default\">\n" +
            "  <div class=\"container-fluid\">\n" +
            "    <!-- Brand and toggle get grouped for better mobile display -->\n" +
            "    <div class=\"navbar-header\">\n" +
            "    <ul>\n" +
            "    %s\n" +
            "    </ul></div>\n" +
            "    </div><!-- /.navbar-collapse -->\n" +
            "  </div><!-- /.container-fluid -->\n" +
            "</nav>";
    private static final String table_bordered_sorttable = "<table id=\"table1\" class=\"table table-bordered table-hover sortable filterable\"><tbody>%s</tbody></table>";
    private static final String dropdown = "<ul class=\"nav navbar-nav\">\n" +
            " <li class=\"dropdown\">\n" +
            "              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"themes\"> %s <span class=\"caret\"></span></a>\n" +
            "              <ul class=\"dropdown-menu\" aria-labelledby=\"themes\">\n" +
            "              %s" +
            "              </ul>\n" +
            "            </li>" +
            "          </ul>";
    private static final String button = "<button type=\"submit\" class=\"btn btn-default\">%s</button>\n";
    private static final String default_link_button = "<a href=\"%s\" class=\"btn btn-default\">%s</a>\n";
    private static final String tabnow = "<div>" +
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
    private static final String jumbotron = "<div class=\"jumbotron\">\n" +
            "%s" +
            "</div>";
    private static final String presentation = "<li role=\"presentation\"><a href=\"#%s\" aria-controls=\"%s\" role=\"tab\" data-toggle=\"tab\">%s</a></li>";
    private static final String tabpanel = "<div role=\"tabpanel\" class=\"tab-pane\" id=\"%s\">%s</div>\n";
    private static final String input = " <label>%s</label>\n" +
            "    <input type=\"%s\" class=\"form-control\" placeholder=\"%s\" name=\"%s\" id=\"%s\" value=\"%s\" />";
    private static final String input_with_label = " <label>%s</label>\n" +
            "    <input type=\"%s\" class=\"form-control\" placeholder=\"%s\" name=\"%s\" id=\"%s\" />";
    private static final String table_stripped = "<table class=\"table table-striped table-hover \"><tbody>%s</tbody></table>";
    private static final String nav_bar = "\n<ul class=\"nav navbar-nav\">\n" +
            "   <li><a href=\"%s\" >%s</a></li>\n" +
            "</ul>";
    private static final String form_group = "<div class=\"form-group\">%s</div>";
    private static final String table_hover = "<table class=\"table table-bordered table-hover \"><tbody>%s</tbody></table>";
    private static final String row_default = "  <tr class=\"default\">%s</tr>\n";
    private static final String bootstrap_href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css";
    private static final String google_fonts = "<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>";
    private static final String head = " <thead><tr>%s</tr></thead>\n";
    private static final String th = "<th>%s</th>";


    private Bootstrap() {
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
                        link(bootstrap_href),
                        google_fonts,
                        scriptWithSource(jquery),
                        css("body { font-family: 'Open Sans', sans-serif; }"),
                        scriptWithSource("https://bootswatch.com/bower_components/bootstrap/dist/js/bootstrap.min.js"),
                        link(jquery_smoothness),
                        scriptWithSource("http://www.kryogenix.org/code/browser/sorttable/sorttable.js"),
                        scriptWithSource("https://cdnjs.cloudflare.com/ajax/libs/tablefilter/2.5.0/tablefilter.js"),
                        scriptWithSource("//code.jquery.com/jquery-1.10.2.js"),
                        scriptWithSource(jquery_ui)),
                merge(datas));
    }

    public static String brand(String data, String href) {
        return String.format(navbar_brand, href, data);
    }

    public static String navbar(String... data) {
        return String.format(navbar, merge(data));
    }

    public static String nav(String name, String href) {
        return String.format(nav_bar, href, name);
    }

    public static String button(String value) {
        return String.format(button, value);
    }

    public static String defaultLinkedButton(String name, String href) {
        return String.format(default_link_button, href, name);
    }

    public static String table(String... rows) {
        return String.format(table_stripped, merge(rows));
    }

    public static String table_bordered(String... rows) {
        return String.format(table_hover, merge(rows));
    }

    public static String table_bordered_sorttable(String... rows) {
        return String.format(table_bordered_sorttable, merge(rows));
    }

    public static String tr(String... data) {
        return String.format(row_default, merge(data));
    }

    public static String thead(String... data) {

        return String.format(head, merge(data));
    }

    public static String th(String data) {
        return String.format(th, data);
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
        return String.format(dropdown, name, merge(list));
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
        return String.format(jumbotron, merge(data));
    }

    public static String tabs(Tab... tabs) {
        List<String> navTab = new ArrayList<String>();
        List<String> tabContent = new ArrayList<String>();

        for (Tab tab : tabs) {
            navTab.add(tab.getNavTab());
            tabContent.add(tab.getTabContent());
        }

        String[] navTabs = new String[navTab.size()];
        String[] tabContents = new String[tabContent.size()];

        return String.format(tabnow, merge(navTab.toArray(navTabs)), merge(tabContent.toArray(tabContents)));
    }

    public static Tab tab(String tabname, String name, String data) {
        return new Tab(String.format(presentation, tabname, tabname, name), String.format(tabpanel, tabname, data));
    }

    public static String div_form_group(String... divs) {
        return String.format(form_group, merge(divs));
    }

    public static String input(String labelName, String name, String type, String placeholder) {
        return String.format(input_with_label, labelName, type, placeholder, name, name);
    }

    public static String input(String labelName, String name, String type, String placeholder, String value) {
        return String.format(input, labelName, type, placeholder, name, name, value);
    }
}
