import io.github.debarshri.Html;
import io.github.debarshri.element.Head;
import io.github.debarshri.element.HtmlElement;
import io.github.debarshri.element.Title;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HeadTest {
    
    @Test
    public void shouldCreateHeader()
    {
        List<HtmlElement> elementList = new ArrayList<HtmlElement>();
        Title element = new Title("test");
        elementList.add(element);

        Head head = new Head(elementList);
        Html html = new Html(head);

        System.out.println(html.toElement());
    }
}