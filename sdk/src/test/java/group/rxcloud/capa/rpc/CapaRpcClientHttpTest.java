/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.capa.rpc;

import group.rxcloud.capa.component.http.CapaHttpBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class CapaRpcClientHttpTest {

    @Test
    public void testStructure_Success() {
        CapaRpcClientBuilder capaRpcClientBuilder = new CapaRpcClientBuilder();
        Assertions.assertNotNull(capaRpcClientBuilder);

        Supplier<CapaHttpBuilder> capaHttpBuilderSupplier = () -> new CapaHttpBuilder();
        CapaRpcClientBuilder rpcClientBuilder = new CapaRpcClientBuilder(capaHttpBuilderSupplier);
        Assertions.assertNotNull(rpcClientBuilder);
    }

    @Test
    public void testBuild_Success() {
        CapaRpcClientBuilder capaRpcClientBuilder = new CapaRpcClientBuilder();
        CapaRpcClient client = capaRpcClientBuilder.build();

        Assertions.assertNotNull(client);
    }

}
