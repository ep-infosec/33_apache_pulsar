/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.proxy.extensions;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Metadata information about a Proxy Extension.
 */
@Data
@NoArgsConstructor
public class ProxyExtensionDefinition {

    /**
     * The name of the extension.
     */
    private String name;

    /**
     * The description of the extension to be used for user help.
     */
    private String description;

    /**
     * The class name for the extension.
     */
    private String extensionClass;

}
