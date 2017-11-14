package com.epam.jdi.uitests.core.templates.base;

import com.epam.jdi.uitests.core.interfaces.base.IBaseElement;

import java.util.HashMap;
import java.util.Map;

import static com.epam.jdi.tools.LinqUtils.foreach;

/**
 * Created by Roman_Iovlev on 11/10/2017.
 */
public class LinkedElements {
    public LinkedElements() {
        linkedElements = new HashMap<>();}
    public LinkedElements(Map<String, IBaseElement> map) {
        this();
        foreach(map, e -> add(e.getKey(), e.getValue()));
    }
    protected Map<String, IBaseElement> linkedElements = new HashMap<>();
    public IBaseElement get(String name) {
        return linkedElements.get(name.toLowerCase());
    }
    public boolean isEmpty() {
        return linkedElements.size() == 0;
    }
    public boolean isAny() {
        return !isEmpty();
    }
    public void add(String name, IBaseElement element) {
        linkedElements.put(name.toLowerCase(), element);
    }
}
