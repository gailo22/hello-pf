package hello.omni.beans;

import java.util.concurrent.atomic.AtomicInteger;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.omnifaces.util.Faces;

@FacesConverter("testConverter")
public class TestConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return value + "-" + getCounter().getAndIncrement();
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value != null ? value.toString() : "";
    }

    private static AtomicInteger getCounter() {
        AtomicInteger counter = Faces.getSessionAttribute(TestConverter.class.getName());

        if (counter == null) {
            counter = new AtomicInteger();
            Faces.setSessionAttribute(TestConverter.class.getName(), counter);
        }

        return counter;
    }

}