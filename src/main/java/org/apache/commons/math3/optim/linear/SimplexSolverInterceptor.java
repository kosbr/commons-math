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
package org.apache.commons.math3.optim.linear;

import org.apache.commons.math3.optim.PointValuePair;

/**
 * The interceptor for intermediate solutions of second phase of the simplex
 * method. It allows to observe for solving process and interrupt it if it is needed.
 */
public interface SimplexSolverInterceptor {

    /**
     * This method is executed after every simplex iteration except the last one.
     * It has an intermediate solution in the argument.
     * @param pointValuePair intermediate solution
     * @return If the solving process must be interrupted.
     */
    boolean intercept(PointValuePair pointValuePair);
}
