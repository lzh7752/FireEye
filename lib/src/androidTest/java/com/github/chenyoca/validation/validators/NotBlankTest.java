package com.github.chenyoca.validation.validators;

import com.github.chenyoca.validation.Type;
import com.github.chenyoca.validation.supports.AbstractValidator;

/**
 * Created by YooJia.Chen
 * YooJia.Chen@gmail.com
 * 2014-07-22
 */
public class NotBlankTest extends GroupTester {
    @Override
    protected AbstractValidator setUpValidator() {
        return new NotBlankValidator(Type.NotBlank, null);
    }

    @Override
    protected String[] thisShouldAllAssertTrue() {
        return new String[]{
                "1",
                "122222",
                "  123",
        };
    }

    @Override
    protected String[] thisShouldAllAssertFalse() {
        return new String[]{
                "",
                " ",
                "     ",
                "           ",
        };
    }
}
