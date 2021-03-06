/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.core.registry.definition;

/**
 * Registry for Definitions that are based on a specific domain models.
 * @param <D> The type for the definition.
 */
public interface TypeDefinitionRegistry<D> extends DefinitionRegistry<D> {

    /**
     * Lookup the Definition instance of type <code>D</code>.
     * @param type The Definition's type criteria.
     * @return The Definition of type <code>D</code> that this registry contains, <code>null</code> otherwise.
     */
    D getDefinitionByType( Class<D> type );

}
