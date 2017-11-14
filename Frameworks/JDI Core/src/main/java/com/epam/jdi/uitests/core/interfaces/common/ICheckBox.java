package com.epam.jdi.uitests.core.interfaces.common;
/* The MIT License
 *
 * Copyright 2004-2017 EPAM Systems
 *
 * This file is part of JDI project.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:

 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

 */

/**
 * Created by Roman Iovlev on 10.03.2017
 */
import com.epam.jdi.uitests.core.annotations.JDIAction;
import com.epam.jdi.uitests.core.interfaces.base.ISelect;
import com.epam.jdi.uitests.core.interfaces.base.ISetValue;

import static com.epam.jdi.uitests.core.actions.common.CheckboxActions.*;
import static com.epam.jdi.uitests.core.settings.JDISettings.exception;

public interface ICheckBox extends ISelect, ISetValue {
    /**
     * Set checkbox checked
     */
    @JDIAction
    default void check() {
        check.execute(this);
    }
    /**
     * Set checkbox unchecked
     */
    @JDIAction
    default void uncheck() {
        uncheck.execute(this);
    }

    /**
     * @return Verify is checkbox checked
     */
    @JDIAction
    default boolean isChecked() {
        return isChecked.execute(this);
    }
    /**
     * @param value Specify element value
     *              Set value to Element
     */
    @Override
    @JDIAction
    default void setValue(String value) {
        switch (value.toLowerCase()) {
            case "true":
            case "1":
            case "check":
                check();
                break;
            case "false":
            case "0":
            case "uncheck":
                uncheck();
                break;
        }
        throw exception("Can't set value '%s' for Checkbox . Supported values: 'true', '1', 'check', 'false', '0', 'uncheck'");
    }
}