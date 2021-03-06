/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.forms.dynamic.backend.server.context.generation.statik.impl.processors;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.drools.workbench.models.datamodel.oracle.Annotation;
import org.kie.workbench.common.forms.dynamic.backend.server.context.generation.statik.impl.FieldSetting;
import org.kie.workbench.common.forms.dynamic.service.context.generation.TransformerContext;
import org.kie.workbench.common.forms.metaModel.TextArea;
import org.kie.workbench.common.forms.model.impl.basic.textArea.TextAreaFieldDefinition;
import org.kie.workbench.common.forms.service.impl.fieldProviders.TextAreaFieldProvider;

@Dependent
public class TextAreaAnnotationProcessor extends AbstractFieldAnnotationProcessor<TextAreaFieldDefinition, TextAreaFieldProvider> {

    @Inject
    public TextAreaAnnotationProcessor( TextAreaFieldProvider fieldProvider ) {
        super( fieldProvider );
    }

    @Override
    protected void initField( TextAreaFieldDefinition field,
                              Annotation annotation,
                              FieldSetting fieldSetting,
                              TransformerContext context ) {
        String placeHolder = annotation.getParameters().get( "placeHolder" ).toString();
        if ( !placeHolder.isEmpty() ) {
            field.setPlaceHolder( placeHolder );
        }
        field.setRows( (Integer) annotation.getParameters().get( "rows" ) );
    }

    @Override
    protected Class<TextArea> getSupportedAnnotation() {
        return TextArea.class;
    }
}
