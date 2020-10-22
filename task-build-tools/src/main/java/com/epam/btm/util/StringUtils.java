package com.epam.btm.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean isNumberCreatable = NumberUtils.isCreatable(str);
        if (!isNumberCreatable) {
            return false;
        }
        return Double.parseDouble(str) > 0;
    }
}
