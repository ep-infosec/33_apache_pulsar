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
package org.apache.pulsar.broker.transaction.pendingack;

import org.apache.pulsar.broker.transaction.pendingack.proto.PendingAckMetadataEntry;

/**
 * Call back for pending ack reply.
 */
public interface PendingAckReplyCallBack {

    /**
     * Pending ack replay complete callback for pending ack store.
     */
    void replayComplete();

    /**
     * Handle metadata entry.
     *
     * @param pendingAckMetadataEntry {@link PendingAckMetadataEntry} the metadata entry of pending ack
     */
    void handleMetadataEntry(PendingAckMetadataEntry pendingAckMetadataEntry);

    /**
     * Pending ack replay failed callback for pending ack store.
     */
    void replayFailed(Throwable t);

}