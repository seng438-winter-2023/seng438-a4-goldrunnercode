/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2013, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 * ----------------
 * ParamChecks.java
 * ----------------
 * (C) Copyright 2011, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Oct-2011 : Version 1 (DG);
 *
 */

package org.jfree.chart.util;

import java.security.InvalidParameterException;

/**
 * A utility class for checking parameters.
 *
 * @since 1.0.14
 */
public class ParamChecks {

    /**
     * Throws an <code>IllegalArgumentException</code> if the supplied 
     * <code>param</code> is <code>null</code>.
     *
     * @param param  the parameter to check (<code>null</code> permitted).
     * @param name  the name of the parameter (to use in the exception message
     *     if <code>param</code> is <code>null</code>).
     *
     * @throws IllegalArgumentException  if <code>param</code> is 
     *     <code>null</code>.
     *
     * @since 1.0.14
     */
    public static void nullNotPermitted(Object param, String name) {
        if (param == null) {
            throw new InvalidParameterException("Null '" + name + "' argument.");
        }
    }
    
    /**
     * Throws an {@code IllegalArgumentException} if {@code value} is negative.
     * 
     * @param value  the value.
     * @param name  the parameter name (for use in the exception message).
     * 
     * @since 1.0.18
     */
    public static void requireNonNegative(int value, String name) {
        if (value < 0) {
            throw new InvalidParameterException("Require '" + name + "' (" 
                    + value + ") to be non-negative.");
        }
    }
}