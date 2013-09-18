/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/eula
 */
package org.jooq;

/* [pro] */

import java.sql.Array;
import java.sql.SQLException;
import java.util.List;

/**
 * A "record" that encapsulates an Oracle-style ARRAY (or VARRAY), additionally
 * providing some convenience methods
 *
 * @param <E> The array element type
 * @author Lukas Eder
 */
public interface ArrayRecord<E> extends Attachable, Iterable<E> {

    /**
     * Get the contained array
     */
    E[] get();

    /**
     * Get the contained array as a {@link List}
     */
    List<E> getList();

    /**
     * Set the contained array
     */
    void set(Array array) throws SQLException;

    /**
     * Set the contained array
     */
    void set(E... array);

    /**
     * Set the contained array as a {@link List}
     */
    void setList(List<? extends E> list);

    /**
     * Get the size of the contained array
     */
    int size();

    /**
     * Get the name of the array type
     */
    String getName();

    /**
     * Get the data type of the array type
     */
    DataType<E> getDataType();
}
/* [/pro] */