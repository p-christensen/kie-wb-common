/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.kie.workbench.common.services.refactoring.model.query;

import java.util.HashMap;
import java.util.Map;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.backend.vfs.Path;
import org.uberfire.paging.AbstractPathPageRow;

/**
 * A row of data containing refactoring information
 */
@Portable
public class RefactoringPageRow extends AbstractPathPageRow {

    final Map<String, String> properties = new HashMap<String, String>();

    public RefactoringPageRow() {
        super();
    }

    public RefactoringPageRow( final Path path ) {
        super( path );
    }

    public void addProperty( final String name,
                             final String value ) {
        properties.put( name,
                        value );
    }

    public Map<String, String> getProperties() {
        return properties;
    }

}