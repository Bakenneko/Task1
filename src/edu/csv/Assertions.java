/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.csv;

import java.util.Objects;

/**
 * Utility class for input parameter validation.
 *
 * TODO Replace usage with {@link Objects} when we switch to Java 7.
 *
 * @version $Id: Assertions.java 1742459 2016-05-05 19:43:57Z britter $
 */
final class Assertions {

    private Assertions() {
        // can not be instantiated
    }

    public static void notNull(final Object parameter, final String parameterName) {
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter '" + parameterName + "' must not be null!");
        }
    }
}
